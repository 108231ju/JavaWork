package 반복제어문2.형성평가04;

import java.util.Scanner;

/*문제
100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)


입력 예
3
99 65 30
출력 예
64.67*/
public class Main {

	public static void main(String[] args) {
	System.out.println();
	Scanner sc = new Scanner (System.in);
	int i = sc.nextInt();
	int hap = 0;
	int count = 0;
	
		for(int j = 0;j < i; j++) {
		int	num = sc.nextInt();
			if(num <= 100) {
			hap = hap + num;
			count++;
			}
			
		}
		System.out.println(Math.round(((double)hap / count)*100.0)/100.0);
	sc.close();

	}

}
