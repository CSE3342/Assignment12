grammar MyLanguage;

@header {
    import java.io.*;
    import java.net.URL;
    import java.nio.charset.Charset;
}

@parser::members {
    final private static String public_url = "http://lyle.smu.edu/~prestont/" +
        "3342/dataService.php";
    private static String setIdKeyVal(String id, String key, String val) {
        return readFromUrl(public_url + "?id=" + id + "&key=" + key +
                "&val=" + val);
    }
    private static String getIdKey(String id, String key) {
        return readFromUrl(public_url + "?id=" + id + "&key=" + key);
    }
    private static String getId(String id) {
        return readFromUrl(public_url + "?id=" + id);
    }
    private static String getDatabase() {
        return readFromUrl(public_url);
    }
    private static String readFromUrl(String url) {
        try {
            InputStream is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            return sb.toString();
        }catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
            return "";
        }
    }
}

root_rule : (set_id_key_val | get_id_key | get_id | get_database) ;
set_id_key_val : 'Hey, let me tell you that ' id=ITEM ' has a ' key=ITEM
    ' of ' val=ITEM { System.out.println(
                        setIdKeyVal($id.text,$key.text,$val.text)
                      );
                    } ;
get_id_key : 'Do you know ' id=ITEM '\'s ' key=ITEM '?' {
    System.out.println(getIdKey($id.text,$key.text)); } ;
get_id : 'What\'s the scoop on ' id=ITEM '?' {
    System.out.println(getId($id.text)); } ;
get_database : 'What do we know?' { System.out.println(getDatabase()); } ;

ITEM : [a-zA-Z][a-zA-Z_$0-9]+ ;
WS : [ \t\r\n]+ -> skip ;