package 선택제어문.자가진단01;

import java.util.Scanner;

// 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
/*입력 예
-5
출력 예
-5
minus

입력 예
5
출력 예
5*/
public class Main {

	public static void main(String[] args) {
	
		System.out.println();
		Scanner sc = new Scanner (System.in);
		
		int i = sc.nextInt();
		
		if(i < 0) {
			System.out.println("minus");
		} else {
			System.out.println(i);
		}

	}

}
