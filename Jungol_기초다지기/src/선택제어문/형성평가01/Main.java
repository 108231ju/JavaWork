package 선택제어문.형성평가01;

import java.util.Scanner;

/*두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.


입력 예
50 85
출력 예
35*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i,j;
		i = sc.nextInt();
		j = sc.nextInt();
		
		if(i > j) {
			System.out.println(i - j);
		}else {
			System.out.println(j - i);
		}
		
		sc.close();

	}

}
