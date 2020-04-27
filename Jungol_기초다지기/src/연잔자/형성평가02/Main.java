package 연잔자.형성평가02;

import java.util.Scanner;

/*두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.


입력 예
35 10
출력 예
35 / 10 = 3...5*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i,j,sub,n;
		i = Integer.parseInt(sc.next());
		j = Integer.parseInt(sc.next());
		
		sub = i / j;
		n = i % j;
		
		System.out.println(i + " / " + j + " = " + sub + "..." + n);
		

	}

}
