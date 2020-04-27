package 연잔자.자가진단06;

import java.util.Scanner;

/*두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.

이때 입력받은 두 정수를 이용하여 출력하시오.

 (JAVA는 1이면 true, 0이면 false를 출력한다.)

 


입력 예
4 5
출력 예
4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1*/
public class Main {
	

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.next());
		int j = Integer.parseInt(sc.next());
		
	System.out.printf("%d > %d --- %s\n",i,j,i > j);
	System.out.printf("%d < %d --- %s\n",i,j,i < j);
	System.out.printf("%d >= %d --- %s\n",i,j,i >= j);
	System.out.printf("%d <= %d --- %s",i,j,i <= j);
		
		
		
		sc.close();

	}

}
