package 반복제어문2.자가진단05;

import java.util.Scanner;

/*문제
10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.


입력 예
10 15 36 99 100 19 46 88 87 13
출력 예
Multiples of 3 : 4
Multiples of 5 : 3*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
	
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int count2 = 0;
	for(int i = 0;i < 10;i++) {
		arr[i] = sc.nextInt();
		
		if(arr[i] % 3 == 0) {
			count ++;
		}
		
		if(arr[i] % 5 == 0) {
			count2 ++;
		}
	}
	System.out.println("Multiples of 3 : "+count);
	System.out.println("Multiples of 5 : "+count2);
	sc.close();
	
	}

}
