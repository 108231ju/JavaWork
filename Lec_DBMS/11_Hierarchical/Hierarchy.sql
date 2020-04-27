-- 계층형 쿼리 (Hierarchical Query)

SELECT * FROM t_dept2;  -- 서로의 계층관계 주목!

SELECT LPAD(dname, 10, '*') 부서명 FROM t_dept2;

-- LEVEL
SELECT  DNAME, LEVEL 
FROM T_DEPT2 
CONNECT BY PRIOR DCODE = PDEPT
START WITH DCODE = 0001
;

/* 해설
 * LEVEL 은 오라클에서 계속 사용할 수 있는 것으로
 * 해당 데이터가 몇번째 단계 이냐를 의미하는 것.
 * 
 * CONNECT BY PRIOR  :  각 row 들이 어떻게 연결되어야 하는지 조건 지정
 * PRIOR를 어느쪽에 주느냐가 중요!
 */

-- PRIOR 을 다른데 주면??
SELECT  DNAME, LEVEL 
FROM T_DEPT2 
CONNECT BY DCODE = PRIOR  PDEPT
START WITH DCODE = 0001
;

SELECT DCODE, DNAME, NVL(PDEPT,0) ,LEVEL 
FROM T_DEPT2 
CONNECT BY DCODE = PRIOR  PDEPT
--START WITH DCODE = 1005 --S/W 지원 -> 기술부 -> 사장실(3)
START WITH DCODE = 1011 
;

SELECT LPAD(DNAME , LEVEL * 6, '*') 부서명 
FROM T_DEPT2 
CONNECT BY PRIOR DCODE = PDEPT 
START WITH DCODE = 0001
;

---------------------------------------------------
SELECT * FROM T_EMP2;

SELECT LPAD(E.NAME || ' ' || D.DNAME || ' ' || NVL(E.POST,'사원'), LEVEL*22,'-') "이름과 직급"
FROM T_EMP2 E,(SELECT DNAME , DCODE , PDEPT FROM T_DEPT2) D
WHERE E.DEPTNO  = D.DCODE
CONNECT BY PRIOR E.EMPNO = E.PEMPNO 
START WITH E.EMPNO = 20000101
;

SELECT LEVEL -1 HR
FROM DUAL 
CONNECT BY LEVEL <= 24
;
 