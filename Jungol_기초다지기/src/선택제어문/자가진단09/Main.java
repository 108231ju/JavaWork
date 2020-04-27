package 선택제어문.자가진단09;

import java.util.Scanner;

/*3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.


입력 예
18 -5 10
출력 예
-5*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		if(i < j && i < k) {
			System.out.println(i);
		}else if(j < i && j < k) {
			System.out.println(j);
		}else if(k < i && k < j) {
			System.out.println(k);
		}
		sc.close();

	}

}
