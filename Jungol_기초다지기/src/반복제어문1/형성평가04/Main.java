package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
/*문제
0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.


입력 예
1 2 3 4 5 6 7 8 9 10 0
출력 예
5*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count, i, j, k;
		System.out.println();
		
		count = 0;
		
		
		for(;;) {
			i = sc.nextInt();
			k = i % 3;
			j = i % 5;
			if(k != 0 && j != 0) 
				count++;
			
			if(i == 0) break;
			
		}
		System.out.println(count);
		sc.close();

	}

}

