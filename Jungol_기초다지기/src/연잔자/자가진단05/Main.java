package 연잔자.자가진단05;

import java.util.Scanner;

/*두 개의 정수를 입력받아서, 

첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고, 

두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.

 

(JAVA는 1이면 true, 0이면 false를 출력한다.)


입력 예
5 5
출력 예
1
0*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.next());
		int j = Integer.parseInt(sc.next());
		
		if(i == j) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();

	}

}
