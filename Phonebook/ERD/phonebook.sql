
/* Drop Tables */

DROP TABLE phonebook CASCADE CONSTRAINTS;

/* Create Tables */

CREATE TABLE phonebook
(
	pb_uid number NOT NULL,
	pb_name varchar2(40) NOT NULL,
	pb_phonenum varchar2(40),
	pb_memo clob,
	pb_regdate date DEFAULT SYSDATE,
	PRIMARY KEY (pb_uid)
);

-- 시퀀스 객체도 생성하자
DROP SEQUENCE phonebook_seq;
CREATE SEQUENCE phonebook_seq;

SELECT *FROM PHONEBOOK ;

SELECT * FROM PHONEBOOK ORDER BY PB_UID DESC;

SELECT count(*) FROM test_member;
SELECT MAX(mb_no) "MAX" FROM TEST_MEMBER ;
SELECT MIN(mb_no) "MIN" FROM TEST_MEMBER ;

SELECT COUNT(*) cnt FROM PHONEBOOK ;















