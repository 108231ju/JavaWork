package 입력.자가진단08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.

(C, C++, Java 의 경우 실수는 "double"로 선언하세요.)


입력 예
12.2536
526.129535
A

출력 예
12.25
526.13
A*/

		
		Scanner sc = new Scanner(System.in);
		double i1 = Double.parseDouble(sc.next());
		double i2 = Double.parseDouble(sc.next());
		String i3 = sc.next();
		
		System.out.printf("%.2f\n",i1);
		System.out.printf("%.2f\n",i2);
		System.out.println(i3);
		sc.close();
	}

}
