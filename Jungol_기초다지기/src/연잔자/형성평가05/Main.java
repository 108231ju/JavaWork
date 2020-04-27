package 연잔자.형성평가05;

import java.util.Scanner;

/*민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.

(JAVA는 1 이면 true, 0 이면 false를 출력한다.)


입력 예
150 35
145 35
출력 예
0 

Hint!

관계 연산자와 논리 연산자를 함께 이용한다.*/
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m_height,m_weight,g_height,g_weight;
		
		m_height = sc.nextInt();
		m_weight = sc.nextInt();
		g_height = sc.nextInt();
		g_weight = sc.nextInt();
		
		if(m_height > g_height && m_weight > g_weight) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		

	}

}
