-- 비등가 조언 (NON-EQUAL JOIN)

SELECT * FROM T_CUSTOMER;
SELECT * FROM T_GIFT;

--#6201
--t_customer 테이블, t_gift 테이블을 join 하여  고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여 
--고객의 '이름(c_name)'과 포인트(c_point) 상품명(g_name)을 출력하세요
--BETWEEN ~ AND ~ 사용

SELECT C.C_NAME "고객명",C.C_POINT "POINT", G.G_NAME "상품명"
FROM T_CUSTOMER C, T_GIFT G
WHERE C.C_POINT BETWEEN G.G_START AND G.G_END ;

SELECT C.C_NAME "고객명",C.C_POINT "POINT", G.G_NAME "상품명"
FROM T_CUSTOMER C JOIN T_GIFT G
ON C.C_POINT BETWEEN G.G_START AND G.G_END ;

--#6202) 
--앞 예제에서 조회한 상품의 이름(g_name)과  필요수량이 몇개인지 조회하세요
--그룹함수 적용!
SELECT G.G_NAME "상품명" ,COUNT(*) "필요수량"
FROM T_CUSTOMER C, T_GIFT G
WHERE C.C_POINT BETWEEN G.G_START AND G.G_END 
GROUP BY G.G_NAME ;

--#6203
--t_student 테이블과 t_exam01 시험성적 테이블, t_credit 학점 테이블을 조회하여  
--학생들의 이름과 점수와 학점을 출력하세요
--t_exam01, t_credit 테이블 보기: 
--각 테이블들이 무엇을 의미하는가 생각해보자.  왜 그렇게 설계해야 하는가?
SELECT * FROM T_EXAM01 ;
SELECT * FROM T_CREDIT ;
SELECT * FROM T_STUDENT ;

SELECT S.NAME ,E.TOTAL ,C.GRADE 
FROM T_STUDENT S, T_CREDIT C, T_EXAM01 E 
WHERE S.STUDNO = E.STUDNO AND E.TOTAL 
BETWEEN C.MIN_POINT AND C.MAX_POINT;

SELECT S.NAME ,E.TOTAL ,C.GRADE 
FROM T_STUDENT S 
JOIN T_EXAM01 E ON S.STUDNO = E.STUDNO
JOIN T_CREDIT C ON E.TOTAL BETWEEN C.MIN_POINT AND C.MAX_POINT
;

--#6204 
--t_customer 와 t_gift 테이블 join 
--자기 포인트(c_point) 보다 낮은 포인트의 상품 중 한가지를 선택할수 있다고 할때 '산악용자전거'를 선택할 수 있는 
--고객명(c_name)과 포인트(c_point), 상품명(g_name)을 출력하세요
SELECT * FROM T_GIFT ;
SELECT * FROM T_CUSTOMER ;
SELECT C.C_NAME "고객명" ,C.C_POINT "뽀인트" ,G.G_NAME "상품명" 
FROM T_CUSTOMER C, T_GIFT G
WHERE C.C_POINT >= G.G_START AND G.G_NAME = '산악용자전거';

SELECT C.C_NAME "고객명" ,C.C_POINT "뽀인트" ,G.G_NAME "상품명" 
FROM T_CUSTOMER C JOIN T_GIFT G
ON C.C_POINT >= G.G_START AND G.G_NAME = '산악용자전거';

-- #6205
--t_emp2, t_post 테이블 사용하여 사원들의 이름(name)과 나이, 현재직급(post),  ‘예상직급’을 출력하세요. 
--‘예상직급’은 나이로 계산하며 해당 나이가 받아야 하는 직급을 의미합니다. 
--나이는 오늘(SYSDATE)을 기준으로 하되 소수점 이하는 절삭하여 계산하세요
--(t_emp2 의 직급(post) 은 null 허용함에 주의)

--나이계산은 어떻게?  :  
--      (현재연도 - 생년월일연도) + 1, 
--       SYSDATE, TO_CHAR() 사용

SELECT * FROM T_EMP2 ;
SELECT * FROM T_POST ;

SELECT E.NAME "이름" , 
	(TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(BIRTHDAY ,'YYYY') + 1) "현재나이",
	NVL(E.POST, ' ') "현재직급", P.POST "예상직급"
FROM T_EMP2 E, T_POST P 
WHERE (TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(BIRTHDAY ,'YYYY') + 1) 
	BETWEEN P.S_AGE AND P.E_AGE 
;  

SELECT E.NAME "이름" , 
	(TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(BIRTHDAY ,'YYYY') + 1) "현재나이",
	NVL(E.POST, ' ') "현재직급", P.POST "예상직급"
FROM T_EMP2 E JOIN T_POST P 
ON (TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(BIRTHDAY ,'YYYY') + 1) 
	BETWEEN P.S_AGE AND P.E_AGE 
;  

--#6206
--t_student 테이블과 t_professor 테이블 Join 하여 학생이름과 지도교수 이름을 출력하세요. 
--단! 지도교수가 결정되지 않은 학생의 명단도 함께 출력하세요
--기존의 INNER Join 방식으로 먼저 만들어 보고 OUTER Join 을 해보고 비교해보자

SELECT s.name "학생이름", p.name "교수이름"
FROM t_student s LEFT OUTER JOIN t_professor p
	ON s.profno = p.PROFNO
;

-- #6207
SELECT s.name "학생이름", p.name "교수이름"
FROM t_student s RIGHT OUTER JOIN t_professor p
	ON s.profno = p.PROFNO
;

-- #6208
SELECT s.name "학생이름", p.name "교수이름"
FROM t_student s FULL OUTER JOIN t_professor p
	ON s.profno = p.PROFNO
;

--#6209
--t_dept2 테이블에서 부서명 과 그 부서의 상위부서명을 출력하세요
SELECT D1.DNAME ,D2.DNAME 
FROM T_DEPT2 D1, T_DEPT2 D2
WHERE D1.PDEPT = D2.DCODE ;
SELECT * FROM T_DEPT2 ;
SELECT D1.DNAME ,D2.DNAME 
FROM T_DEPT2 D1 JOIN T_DEPT2 D2
ON D1.PDEPT = D2.DCODE ;

-- #6210 
--t_professor 테이블 : 교수번호, 교수이름, 입사일, 그리고 자신보다 입사일 빠른 사람의 인원수를 출력하세요
--단 자신보다 입사일이 빠른 사람수를 오름차순으로 출력하세요
--hint: left outer 사용 
--         / 그룹함수 사용

SELECT * FROM T_PROFESSOR ;

SELECT P1.PROFNO "교수번호" , P1.NAME "교수명" , P1.HIREDATE "입사일",
	COUNT(P2.HIREDATE )"빠른분들"
FROM T_PROFESSOR P1 LEFT OUTER JOIN T_PROFESSOR P2
ON P1.HIREDATE < P2.HIREDATE 
GROUP BY P1.PROFNO ,P1.NAME ,P1.HIREDATE 
ORDER BY 4

;




