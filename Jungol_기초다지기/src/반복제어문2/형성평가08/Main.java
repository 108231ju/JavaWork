package 반복제어문2.형성평가08;

import java.util.Scanner;

/*행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.


입력 예
3 4
출력 예
1 2 3 4
2 4 6 8
3 6 9 12*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. ++
		 * 2. += 2
		 * 3. += 3
		 * 
		 * 
		 * */
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		for(int k = 1; k <= i; k++) {
			for(int m = 1; m <= j; m++) {
				System.out.print(m*k + " ");
				
				}
				System.out.println();
				
			}
		
			
		
		sc.close();	
		}
		
	}


