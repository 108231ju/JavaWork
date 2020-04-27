package 연잔자.자가진단01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
		
		입력 예
		10 25 33
		출력 예
		sum : 68
		avg : 22*/
			
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.next());
		int i2 = Integer.parseInt(sc.next());
		int i3 = sc.nextInt();
		
		int sum = i + i2 + i3;
		double avg = sum / 3;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.0f",avg);
		
		sc.close();
	}

}
