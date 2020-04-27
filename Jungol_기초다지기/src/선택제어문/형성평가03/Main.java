package 선택제어문.형성평가03;

import java.util.Scanner;

/*년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.


입력 예
2008
출력 예
leap year

400으로 나누어떨어지면 윤년이다. 또는 4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년이다. 나머지는 모두 평년이다.*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int leap = year % 4;
		int leapy = year % 100;
		int leapye = year % 400;
		if((leap == 0 && leapy != 0 )|| leapye == 0) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
		
		sc.close();

	}

}
