package 반복제어문2.자가진단04;

import java.util.Scanner;

/*문제
100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.


입력 예
95
출력 예
585*/
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	int i = sc.nextInt();
	int sum = 0;
	for(int j = i;j <= 100; j++) {
		
			sum = sum + j;
		
		
	}
	System.out.println(sum);
	sc.close();

	}

}
