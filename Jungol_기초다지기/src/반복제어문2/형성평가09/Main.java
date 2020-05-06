package 반복제어문2.형성평가09;

import java.util.Scanner;

/*문제
정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.

 

* 주의 

 ')'와 '('사이에 공백이 1칸 있다.
(1,_1) 처럼 출력한다 : '_'는 공백


입력 예
4
출력 예
(1, 1) (1, 2) (1, 3) (1, 4)
(2, 1) (2, 2) (2, 3) (2, 4)
(3, 1) (3, 2) (3, 3) (3, 4)
(4, 1) (4, 2) (4, 3) (4, 4)*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j = 1; j <= i; j++) {
			for(int m = 1; m <= i; m++) {
				System.out.print("(" + j + ", " + m + ") ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
