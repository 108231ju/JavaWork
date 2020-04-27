package 입력.자가진단09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.


		입력 예
		1.2568
		95.21438
		526.851364
		출력 예
		1.257
		95.214
		526.851 */
		
		Scanner sc = new Scanner(System.in);
		double i1 = Double.parseDouble(sc.next());
		double i2 = Double.parseDouble(sc.next());
		double i3 = Double.parseDouble(sc.next());
		
		System.out.printf("%.3f\n", i1);
		System.out.printf("%.3f\n", i2);
		System.out.printf("%.3f\n", i3);
		sc.close();

	}

}
