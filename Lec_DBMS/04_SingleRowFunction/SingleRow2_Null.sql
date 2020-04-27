SELECT * FROM T_PROFESSOR ;

--NULL 값과의 연산결과는 NULL  이다!
SELECT NAME ,PAY ,BONUS, PAY + BONUS 
FROM T_PROFESSOR ;

-- 그룹함수에서는 동작, NULL 은 연산에서 제외되어 동작.
SELECT SUM(PAY), SUM(BONUS) FROM T_PROFESSOR ;

-- NVL() 함수
SELECT NAME ,PAY ,BONUS, 
		PAY + BONUS 총지급액1,
		PAY + NVL(BONUS,0) 총지급액2
FROM T_PROFESSOR ;

--#4201
--Professor 테이블 : 101번 학과 교수들의 이름(name), 급여(pay), 보너스(bonus ), 연봉(pay) 출력하기.
--연봉은 pay * 12 + bonus 로 계산,  bonus 가 없는 교수는 0 으로 계산
--#4202
SELECT NAME, PAY,
	NVL2(BONUS, BONUS,0) BONUS, 
	NVL2(BONUS, PAY * 12 + BONUS, PAY * 12) 연봉 
FROM T_PROFESSOR 
WHERE DEPTNO = 101;

