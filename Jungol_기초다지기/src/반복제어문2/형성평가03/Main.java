package 반복제어문2.형성평가03;

import java.util.Scanner;

/*문제
정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.


입력 예
20
출력 예
50*/
public class Main {

	public static void main(String[] args) {
	System.out.println();
	Scanner sc = new Scanner(System.in);
	
	int i = sc.nextInt();
	int hap = 0;
	
	for(int j = 1; j <= i; j++) {
		if(j % 5 == 0) {
			hap = hap + j;
		}
		
	}
	System.out.println(hap);
	sc.close();

	}

}
