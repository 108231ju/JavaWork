package 반복제어문2.형성평가06;

import java.util.Scanner;

/*문제
두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)


입력 예
10 15
출력 예
sum : 37
avg : 12.3*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int sum = 0;
		int count = 0;
		if(i < j) {
			for(int k = i; k <= j; k++) {
				if(k % 3 == 0 || k % 5 == 0) {
					count++;
					sum = sum + k;
					
				}
			
				
			}
			
		}else {
			for(int k = j; k <= i; k++) {
				if(k % 3 == 0 || k % 5 == 0) {
					count++;
					sum = sum + k;
				}
			
		}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(((double)sum/count)*10.0)/10.0);
		
		sc.close();

	}

}
