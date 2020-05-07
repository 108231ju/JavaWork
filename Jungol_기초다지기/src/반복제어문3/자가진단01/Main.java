package 반복제어문3.자가진단01;

import java.util.Scanner;

/*문제
자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.


입력 예
100
출력 예
10 100*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int k = 1;k <= i; k++) {
			if(k % 2 != 0) {
			sum = sum + k;
			count++;
			}
			if(sum >= i) break;
		}
		System.out.println(count + " " + sum);
		
		sc.close();

	}

}
