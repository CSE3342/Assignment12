grammar BankDeposit;


// the header block is used handle imports and to optionally
// set up your code in a package

@header {
    import java.util.*;
}

// code block for parser
@parser::members {
    Map<String, Integer> visitors = new HashMap<String, Integer>() ;

    void doBanking(String user, String action, int amt) {
        if (!visitors.containsKey(user) ) {
            visitors.put(user,0);
        }

        int currentBalance = visitors.get(user);
        if ( action.equals("dep") )
            visitors.put(user, currentBalance + amt);
        else if ( action.equals("withdraw") )
            visitors.put(user, currentBalance - amt);
    }

    void showBalances() {
        for (Map.Entry<String, Integer> entry : visitors.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " has balance = " + value);
        }
    }
}

// end @parser code block
// the parser grammar rules
s : r+ { showBalances(); } ;
r : ID ACTION NUM { doBanking($ID.text, $ACTION.text, $NUM.int); } ;

// Lexer token rules - note that we put the most general ID rule after
// DEPOSIT and WITHDRAW since they will match the ID rule and
// we do not want that
NUM : [0-9]+ ;
ACTION : 'dep' | 'withdraw' ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;