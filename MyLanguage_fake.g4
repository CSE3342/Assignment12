grammar MyLanguage;

// end @parser code block
// the parser grammar rules
root_rule : ('a') {System.out.println("a return");};

WS : [ \t\r\n]+ -> skip ;