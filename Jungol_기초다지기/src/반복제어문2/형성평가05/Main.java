package 반복제어문2.형성평가05;

import java.util.Scanner;

/*문제
10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.


입력 예
10 20 30 55 66 77 88 99 100 15
출력 예
even : 6
odd : 4*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		for(int j = 0; j < 10; j++) {
			int i = sc.nextInt();
			if(i % 2 == 0) {
				count1++;
			}else if(i % 2 != 0) {
				count2++;
			
			}
		}
		System.out.println("even : " + count1);
		System.out.println("odd : " + count2);
		sc.close();

	}

}
