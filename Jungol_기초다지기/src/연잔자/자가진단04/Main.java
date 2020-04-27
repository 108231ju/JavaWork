package 연잔자.자가진단04;

import java.util.Scanner;

/*두 개의 정수를 입력받아 각각 후치 증가 연산자와 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.


입력 예
10 20
출력 예
11 19 190*/
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.next()) ;
		int j = Integer.parseInt(sc.next()) - 1 ;
		int sum = i * j;
		System.out.println((i + 1) + " " + j + " " + sum);
		sc.close();
		

	}

}
