<?php
//Preston Tighe
//Programming Languages
//10-19-16

class Database {
    private $database_name = 'database.json';
    private $id;
    private $key;
    private $val;
    private $rows = array();

    public function __construct () {
        //Check valid GET params
        $this->_check_params();

        //Store GET params
        $this->_store_params();

        //Check valid ID if provided
        $this->_check_id();

        //Clear database
        if(!empty($_GET['clear'])){
            $this->_clear_database();
            exit;
        }

        //Fetch previous database
        $this->_fetch_database();

        //Return value where id & key
        if(!empty($this->id) && empty($this->key) && empty($this->val)){
            echo $this->_lookup_id();
            exit;
        }

        //Return value where id & key
        if(!empty($this->id) && !empty($this->key) && empty($this->val)){
            echo $this->_lookup_key();
            exit;
        }

        //Print all rows
        if(empty($this->id) && empty($this->key) && empty($this->val)){
            echo $this->_print_database();
            exit;
        }

        //Store row
        if(!empty($this->id) && !empty($this->key) && !empty($this->val)){
            $this->_insert_row();
            exit;
        }

        //Error handling
        if(empty($this->id) && !empty($this->key) && empty($this->val)){
            throw new Exception('ID is required.');
        }
        if(empty($this->id) && empty($this->key) && !empty($this->val)){
            throw new Exception('ID & key is required.');
        }
    }
    private function _check_params(){
        //Check valid GET params
        $valid_keys = array('id','key','val','clear');
        $invalid_keys = array();
        foreach($_GET as $key => $value){
            if(!in_array($key,$valid_keys)){
                $invalid_keys[] = $key;
            }
        }
        if(!empty($invalid_keys)){
            throw new Exception('Invalid keys: ' .
                implode(', ',$invalid_keys) .
                ', expecting keys: ' . implode(', ',$valid_keys));
        }
    }
    private function _store_params(){
        $this->id = !empty($_GET['id']) ? $_GET['id'] : null;
        $this->key = !empty($_GET['key']) ? $_GET['key'] : null;
        $this->val = !empty($_GET['val']) ? $_GET['val'] : null;
    }
    private function _check_id(){
        if(!empty($this->id) && !preg_match('/[a-zA-Z][\w]*/',$this->id)){
            throw new Exception('The ID can only be the letters a-z or A-Z.');
        }
    }
    private function _clear_database(){
        $this->rows = array();
        $this->_save_database();
    }
    private function _fetch_database(){
        if(file_exists($this->database_name)){
            $this->rows = json_decode(
                file_get_contents($this->database_name), true);
        }
    }
    private function _lookup_id(){
        $return_data = array();
        foreach($this->rows as $row){
            if($row['id'] == $this->id){
                $return_data[] = $row;
            }
        }
        if(empty($return_data)){
            throw new Exception('Could not find any rows with ID #' .
                $this->id . '.');
        }

        $names = array();
        foreach($return_data as $item){
            $names[] = $item['val'];
        }
        return count($return_data) . ' names in history: ' .
            implode(', ', array_reverse($names));
    }
    private function _lookup_key(){
        foreach(array_reverse($this->rows) as $row){
            if($row['id'] == $this->id){
                if($row['key'] == $this->key){
                    return $row['val'];
                }
            }
        }
        throw new Exception('Could not find a row with ID #' . $this->id .
            ' and key `' . $this->key . '`.');
    }
    private function _print_database(){
        $message = '';
        $ids = array();
        $keys = array();
        foreach($this->rows as $row){
            $ids[] = $row['id'];
            $keys[] = $row['key'];
        }
        $message .= 'IDS:' . "\n";
        $message .= implode(' ', $ids);
        $message .= "\n" . 'KEYS:' . "\n";
        $message .= implode(' ', $keys);
        return $message;
    }
    private function _insert_row(){
        $this->rows[] = array(
            'id' => $this->id,
            'key' => $this->key,
            'val' => $this->val
        );
        $this->_save_database();
        echo 'Row has been inserted';
    }
    private function _save_database(){
        file_put_contents($this->database_name, json_encode($this->rows));
    }
}

try{
    $database = new Database();
}catch(Exception $e){
    echo 'Error: ' . $e->getMessage();
}
