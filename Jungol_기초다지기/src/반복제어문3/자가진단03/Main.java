package 반복제어문3.자가진단03;

import java.util.Scanner;

/*문제
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.


입력 예
3
출력 예
***
**
*
*
**
*** */
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		
		int i = sc.nextInt();
		int j ;
		for( j = i;i >= 1; i--) {
			for(int m = i;m >= 1;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i <= j ;i++) {
			for(int n = 1; n <= i;n++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close(); 
	}

}
