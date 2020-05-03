package 반복제어문2.형성평가01;

import java.util.Scanner;

/*문제
10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.


입력 예
4
출력 예
JUNGOL​
JUNGOL​
JUNGOL​
JUNGOL​*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j = 1;j <= i; j++) {
			
		System.out.println("JUNGOL");
			
		}
		
		sc.close();

	}

}
