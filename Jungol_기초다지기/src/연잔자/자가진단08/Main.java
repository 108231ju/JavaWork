package 연잔자.자가진단08;

import java.util.Scanner;

/*3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.

(JAVA는 1이면 true, 0이면 false를 출력한다.)


입력 예
10 9 9
출력 예
1 0*/
public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int i,j,k;
	i = Integer.parseInt(sc.next());
	j = Integer.parseInt(sc.next());
	k = Integer.parseInt(sc.next());
	if(i>j && i>k) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	if(i == j && i == k) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	sc.close();
	}
}
