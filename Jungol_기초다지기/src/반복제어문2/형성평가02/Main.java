package 반복제어문2.형성평가02;

import java.util.Scanner;

/*문제
100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.


입력 예
10 5
출력 예
5 6 7 8 9 10*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		if(i < j) {
			for(int k = i; k <= j;k++) {
			System.out.println(k);
			
		}
		}else {
			for(int k = j; k <= i;k++) {
				System.out.println(k);
				
			}
		}
		
		
		sc.close();

	}

}
