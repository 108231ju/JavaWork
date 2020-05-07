package 반복제어문3.자가진단02;

import java.util.Scanner;

/*	 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.


	입력 예
	5
	출력 예
	*
	**
	***
	****
	***** */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for(int j = 1;j <= i;j++) {
			for(int m = 1;m <= j; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
