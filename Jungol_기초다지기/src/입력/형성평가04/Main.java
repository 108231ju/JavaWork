package 입력.형성평가04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)


			입력 예
			20 50 100
			출력 예
			sum = 170
			avg = 56    */
		
		Scanner sc = new Scanner(System.in);
	
		int i = Integer.parseInt(sc.next());
		int i1 = Integer.parseInt(sc.next());
		int i2 = sc.nextInt();
		
		int sum = i + i1 + i2;
		double avg = sum / 3;
		
		System.out.println("sum = " + sum);
		System.out.printf("avg = %.0f",avg);
		
	
		sc.close();

	}

}
