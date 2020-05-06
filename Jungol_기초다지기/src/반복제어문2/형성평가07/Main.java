package 반복제어문2.형성평가07;

import java.util.Scanner;

/*문제
한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.


입력 예
5
출력 예
5 10 15 20 25 30 35 40 45 50*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j = 1; j <= 10; j++) {
			System.out.print(i * j + " ");
		}
		sc.close();

	}

}
