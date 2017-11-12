/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.sql.parser;

/**
 * 
 * SQL Token 
 * @author wenshao [szujobs@hotmail.com]
 */
public enum Token {
    SELECT("SELECT"), 
    DELETE("DELETE"), 
    INSERT("INSERT"), 
    UPDATE("UPDATE"), 
    
    FROM("FROM"), 
    HAVING("HAVING"), 
    WHERE("WHERE"), 
    ORDER("ORDER"), 
    BY("BY"),
    GROUP("GROUP"), 
    INTO("INTO"), 
    AS("AS"), 
    
    CREATE("CREATE"),
    ALTER("ALTER"), 
    DROP("DROP"), 
    SET("SET"), 
   
    NULL("NULL"), 
    NOT("NOT"), 
    DISTINCT("DISTINCT"),

    TABLE("TABLE"), 
    TABLESPACE("TABLESPACE"), 
    VIEW("VIEW"), 
    SEQUENCE("SEQUENCE"), 
    TRIGGER("TRIGGER"), 
    USER("USER"), 
    INDEX("INDEX"), 
    SESSION("SESSION"),
    PROCEDURE("PROCEDURE"),
    FUNCTION("FUNCTION"),
    
    PRIMARY("PRIMARY"), 
    KEY("KEY"), 
    DEFAULT("DEFAULT"), 
    CONSTRAINT("CONSTRAINT"), 
    CHECK("CHECK"), 
    UNIQUE("UNIQUE"), 
    FOREIGN("FOREIGN"), 
    REFERENCES("REFERENCES"), 
    
    EXPLAIN("EXPLAIN"), 
    FOR("FOR"), 
    IF("IF"), 
   
   
   
    ALL("ALL"), 
    UNION("UNION"), 
    EXCEPT("EXCEPT"), 
    INTERSECT("INTERSECT"), 
    MINUS("MINUS"),
    INNER("INNER"), 
    LEFT("LEFT"), 
    RIGHT("RIGHT"), 
    FULL("FULL"), 
    OUTER("OUTER"), 
    JOIN("JOIN"), 
    ON("ON"), 
    SCHEMA("SCHEMA"), 
    CAST("CAST"),
    COLUMN("COLUMN"),
    USE("USE"),
    DATABASE("DATABASE"),
    TO("TO"),

    AND("AND"), 
    OR("OR"), 
    XOR("XOR"), 
    CASE("CASE"), 
    WHEN("WHEN"), 
    THEN("THEN"), 
    ELSE("ELSE"),
    ELSIF("ELSIF"),
    END("END"), 
    EXISTS("EXISTS"), 
    IN("IN"),

    NEW("NEW"), 
    ASC("ASC"), 
    DESC("DESC"), 
    IS("IS"), 
    LIKE("LIKE"), 
    ESCAPE("ESCAPE"), 
    BETWEEN("BETWEEN"), 
    VALUES("VALUES"), 
    INTERVAL("INTERVAL"),

    LOCK("LOCK"), 
    SOME("SOME"), 
    ANY("ANY"),
    TRUNCATE("TRUNCATE"),

    RETURN("RETURN"),

    // mysql
    TRUE("TRUE"), 
    FALSE("FALSE"),
    LIMIT("LIMIT"),
    KILL("KILL"),
    IDENTIFIED("IDENTIFIED"),
    PASSWORD("PASSWORD"),
    DUAL("DUAL"),
    BINARY("BINARY"),
    SHOW("SHOW"),
    REPLACE("REPLACE"),

    BITS,

    // MySql procedure add by zz
    WHILE("WHILE"),
    DO("DO"),
    LEAVE("LEAVE"),
    ITERATE("ITERATE"),
    REPEAT("REPEAT"),
    UNTIL("UNTIL"),
    OPEN("OPEN"),
    CLOSE("CLOSE"),
    OUT("OUT"),
    INOUT("INOUT"),
    EXIT("EXIT"),
    UNDO("UNDO"),
    SQLSTATE("SQLSTATE"),
    CONDITION("CONDITION"),
    DIV("DIV"),
    
    //postgresql
    WINDOW("WINDOW"),
    OFFSET("OFFSET"),
    ROW("ROW"),
    ROWS("ROWS"),
    ONLY("ONLY"),
    FIRST("FIRST"),
    NEXT("NEXT"),
    FETCH("FETCH"),
    OF("OF"),
    SHARE("SHARE"),
    NOWAIT("NOWAIT"),
    RECURSIVE("RECURSIVE"),
    TEMPORARY("TEMPORARY"),
    TEMP("TEMP"),
    UNLOGGED("UNLOGGED"),
    RESTART("RESTART"),
    IDENTITY("IDENTITY"),
    CONTINUE("CONTINUE"),
    CASCADE("CASCADE"),
    RESTRICT("RESTRICT"),
    USING("USING"),
    CURRENT("CURRENT"),
    RETURNING("RETURNING"),
    COMMENT("COMMENT"),
    OVER("OVER"),
    TYPE("TYPE"),
    ILIKE("ILIKE"),

    // oracle
    START("START"),
    PRIOR("PRIOR"),
    CONNECT("CONNECT"),
    WITH("WITH"),
    EXTRACT("EXTRACT"),
    CURSOR("CURSOR"),
    MODEL("MODEL"),
    MERGE("MERGE"),
    MATCHED("MATCHED"),
    ERRORS("ERRORS"),
    REJECT("REJECT"),
    UNLIMITED("UNLIMITED"),
    BEGIN("BEGIN"),
    EXCLUSIVE("EXCLUSIVE"),
    MODE("MODE"),
    WAIT("WAIT"),
    ADVISE("ADVISE"),
    SYSDATE("SYSDATE"),
    DECLARE("DECLARE"),
    EXCEPTION("EXCEPTION"),
    GRANT("GRANT"),
    REVOKE("REVOKE"),
    LOOP("LOOP"),
    GOTO("GOTO"),
    COMMIT("COMMIT"),
    SAVEPOINT("SAVEPOINT"),
    CROSS("CROSS"),
    
    PCTFREE("PCTFREE"),
    INITRANS("INITRANS"),
    MAXTRANS("MAXTRANS"),
    INITIALLY("INITIALLY"),
    ENABLE("ENABLE"),
    DISABLE("DISABLE"),
    SEGMENT("SEGMENT"),
    CREATION("CREATION"),
    IMMEDIATE("IMMEDIATE"),
    DEFERRED("DEFERRED"),
    STORAGE("STORAGE"),
    MINEXTENTS("MINEXTENTS"),
    MAXEXTENTS("MAXEXTENTS"),
    MAXSIZE("MAXSIZE"),
    PCTINCREASE("PCTINCREASE"),
    FLASH_CACHE("FLASH_CACHE"),
    CELL_FLASH_CACHE("CELL_FLASH_CACHE"),
    NONE("NONE"),
    LOB("LOB"),
    STORE("STORE"),
    CHUNK("CHUNK"),
    CACHE("CACHE"),
    NOCACHE("NOCACHE"),
    LOGGING("LOGGING"),
    NOCOMPRESS("NOCOMPRESS"),
    KEEP_DUPLICATES("KEEP_DUPLICATES"),
    EXCEPTIONS("EXCEPTIONS"),
    PURGE("PURGE"),
    
    COMPUTE("COMPUTE"),
    ANALYZE("ANALYZE"),
    OPTIMIZE("OPTIMIZE"),
    
    // transact-sql
    TOP("TOP"),
    
    ARRAY("ARRAY"),
    DISTRIBUTE("DISTRIBUTE"),
    
    // hive

    EOF, 
    ERROR,
    IDENTIFIER,
    HINT,
    VARIANT,
    LITERAL_INT,
    LITERAL_FLOAT,
    LITERAL_HEX,
    LITERAL_CHARS,
    LITERAL_NCHARS,

    LITERAL_ALIAS,
    LINE_COMMENT,
    MULTI_LINE_COMMENT,
    
    // Oracle
    BINARY_FLOAT,
    BINARY_DOUBLE,
    
    // odps,hive
    PARTITION,
    PARTITIONED,
    OVERWRITE,
    
    // Teradata
    SEL("SEL"),
    LOCKING("LOCKING"),
    ACCESS("ACCESS"),
    VOLATILE("VOLATILE"),
    MULTISET("MULTISET"),
    POSITION("POSITION"),
    RANGE_N("RANGE_N"),
    FORMAT("FORMAT"),
    QUALIFY("QUALIFY"),
    MOD("MOD"),

    // DB2
    CONCAT("CONCAT"),
    // Phoenix
    UPSERT("UPSERT"),

    LEFT_PARENTHESES("("),
    RIGHT_PARENTHESES(")"),
    LEFT_BRACE("{"),
    RIGHT_BRACE("}"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    SEMICOLON(";"),
    COMMA(","), 
    DOT("."), 
    DOT_DOT(".."),
    DOT_DOT_DOT("..,"),
    EQ("="), 
    GT(">"), 
    LT("<"),
    LT_SUB_GT("<->"),
    BANG("!"),
    BANG_BANG("!!"),
    BANG_TILDE("!~"),
    BANG_TILDE_STAR("!~*"),
    TILDE("~"),
    TILDE_STAR("~*"),
    TILDE_EQ("~="),
    QUES("?"),
    QUES_QUES("??"),
    QUES_BAR("?|"),
    QUES_AMP("?&"),
    COLON(":"), 
    COLON_COLON("::"),
    COLON_EQ(":="),
    EQ_EQ("=="),
    EQ_GT("=>"),
    LT_EQ("<="),
    LT_EQ_GT("<=>"),
    LT_GT("<>"),
    GT_EQ(">="),
    BANG_EQ("!="),
    BANG_GT("!>"),
    BANG_LT("!<"),
    AMP_AMP("&&"),
    BAR_BAR("||"),
    BAR_BAR_SLASH("||/"),
    BAR_SLASH("|/"),
    PLUS("+"), 
    SUBTRACT("-"),
    SUBTRACT_GT("->"),
    SUBTRACT_GT_GT("->>"),
    STAR("*"), 
    SLASH("/"), 
    AMP("&"), 
    BAR("|"), 
    CARET("^"),
    CARET_EQ("^="),
    PERCENT("%"), 
    LT_LT("<<"),
    GT_GT(">>"),
    MONKEYS_AT("@"),
    MONKEYS_AT_AT("@@"),
    POUND("#"),
    POUND_GT("#>"),
    POUND_GT_GT("#>>"),
    MONKEYS_AT_GT("@>"),
    LT_MONKEYS_AT("<@"),
    ;

    public final String name;

    Token(){
        this(null);
    }

    Token(String name){
        this.name = name;
    }
}
