grammar Diameter;


// Note: Whitespace handling not as strict as in the specification.

rules:
    (command_def | simple_avp_def| grouped_avp_def | enum_def)* EOF
    ;

//msg_def
//   : command_def  //ID ( '=' | '=/' ) elements
//   ;

simple_avp_def:
    diameter_name avp_code avp_type
    ;

avp_code:
    INT|DIGIT
    ;

enum_id:
    DIGIT|INT
    ;

avp_type:
    'Integer32'|'Integer64'|'Unsigned32'|'Unsigned64'|'Float32'|'Float64'|'Grouped'|
    'Enumerated'|'UTF8String'|'OctetString'|'DiameterIdentity'|'DiameterURI'|'IPFilterRule'|'Time'|'Address'
    ;

//avp_def:
//    avp_def_name '::=' avp
//    ;

//avp_def_name: (ALPHA | DIGIT | '_' | '-')+ | 'AVP';

command_def
      : '<' command_name '>' '::=' diameter_message
      ;
command_name
     :diameter_name
     ;
diameter_name
    : ALPHA (ALPHA | DIGIT | '-')*
    ;

header
    : '<' 'Diameter Header:' command_id (r_bit)* (p_bit)* (e_bit)* application_id* '>'
    ;

diameter_message
    : header fixed* required* optional*
    ;

command_id: INT;

application_id:    INT
    ;

r_bit            : ', REQ';
p_bit            : ', PXY';
e_bit            : ', ERR';

fixed            : (qual)* '<' avp_name '>';
required         : (qual)* '{' avp_name '}';
optional         : (qual)* '[' avp_name ']';
qual             : (min)* '*' (max)*;
min              : (DIGIT)+;
max              : (DIGIT)+;

avp_name         : (ALPHA | DIGIT | '_' | '-')+ | 'AVP';

avp:
    avp_header  fixed* required* optional*
    ;

enum_def:
     diameter_name '::=' avp_header enum_item+
    ;

enum_item:
    enum_item_name '(' enum_id ')'
    ;

enum_item_name:
    (ALPHA|'_')+
    ;

avp_header
    : '<AVP Header:' avpcode (vendor)? '>'
    ;

avpcode
    : INT
    ;
vendor
    :INT
    ;
grouped_avp_def
    : '<' diameter_name '>' '::=' avp
    ;

fragment BinaryValue
   : 'b' BIT+ ( ( '.' BIT+ )+ | ( '-' BIT+ ) )?
   ;


fragment DecimalValue
   : 'd' DIGIT+ ( ( '.' DIGIT+ )+ | ( '-' DIGIT+ ) )?
   ;


fragment HexValue
   : 'x' HEX_DIGIT+ ( ( '.' HEX_DIGIT+ )+ | ( '-' HEX_DIGIT+ ) )?
   ;


/*
ProseValue
   : '<' ( ~ '>' )* '>'
   ;
*/


ALPHA
   : ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )*
   ;


DIGIT
   : '0' .. '9'
   ;


//ID : ALPHA;

INT
   : '0' .. '9'+
   ;


COMMENT
   : ';' ~ ( '\n' | '\r' )* '\r'? '\n' -> channel ( HIDDEN )
   ;


WS
   : ( ' ' | '\t' | '\r' | '\n' ) -> channel ( HIDDEN )
   ;


STRING
   : ( '%s' | '%i' )? '"' ( ~ '"' )* '"'
   ;


fragment BIT
   : '0' .. '1'
   ;




// Note: from the RFC errata (http://www.rfc-editor.org/errata_search.php?rfc=5234&eid=4040):
// > ABNF strings are case insensitive and the character set for these strings is US-ASCII.
// > So the definition of HEXDIG already allows for both upper and lower case (or a mixture).
fragment HEX_DIGIT
   : ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
   ;