
/* Drop Tables */

DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;
DROP TABLE subject CASCADE CONSTRAINTS;
DROP TABLE professor CASCADE CONSTRAINTS;
DROP TABLE student CASCADE CONSTRAINTS;
DROP TABLE department CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE department
(
	deptno number NOT NULL,
	tel number,
	office varchar2(10),
	deptname varchar2(20),
	PRIMARY KEY (deptno)
);


CREATE TABLE NEW_TABLE
(
	studno number NOT NULL,
	sudjno number NOT NULL
);


CREATE TABLE professor
(
	profrno number NOT NULL,
	jumin number,
	address varchar2(20),
	name varchar2(10),
	posision varchar2(10),
	tel number,
	s_year number,
	deptno number NOT NULL,
	PRIMARY KEY (profrno)
);


CREATE TABLE student
(
	studno number NOT NULL,
	name varchar2(10) NOT NULL,
	jumin number,
	grade number,
	tel number,
	address varchar2(30),
	deptno number NOT NULL,
	PRIMARY KEY (studno)
);


CREATE TABLE subject
(
	sudjno number NOT NULL,
	sudjname varchar2(20),
	rank number,
	personal number,
	class varchar2(10),
	s_year number,
	profrno number NOT NULL,
	PRIMARY KEY (sudjno)
);



/* Create Foreign Keys */

ALTER TABLE professor
	ADD FOREIGN KEY (deptno)
	REFERENCES department (deptno)
;


ALTER TABLE student
	ADD FOREIGN KEY (deptno)
	REFERENCES department (deptno)
;


ALTER TABLE subject
	ADD FOREIGN KEY (profrno)
	REFERENCES professor (profrno)
;


ALTER TABLE NEW_TABLE
	ADD FOREIGN KEY (studno)
	REFERENCES student (studno)
;


ALTER TABLE NEW_TABLE
	ADD FOREIGN KEY (sudjno)
	REFERENCES subject (sudjno)
;



