package 반복제어문3.자가진단05;

import java.util.Scanner;

/*문제
		자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.


		입력 예
		3
		출력 예
		*****  
		 ***	
		  *		 
		  i j m
		  
		  3 1 5
		  3 1 4
		  3 1 3
		  3 1 2
		  3 1 1 
		  
		  3 2 5 ..
		  3 2 4
		  3 2 3
		  3 2 2
		  3 2 1 .
		  
		  3 3 5 ..
		  3 3 4 ..
		  3 3 3
		  3 3 2 .
		  3 3 1 .
		  		  
*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); // 3
		for(int j = 1 ; j <= i; j++) {
			for(int m = (2*i-1);m >= j; m--) {
				if(j+m <= 2*i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		sc.close();
	}

}
