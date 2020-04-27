package 선택제어문.자가진단05;

import java.util.Scanner;

// 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		double i,j;
		i = sc.nextDouble();
		j = sc.nextDouble();
		
		if(i >= 4.0 && j >= 4.0) {
			System.out.println("A");
		}else if(i >= 3.0 && j >=3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		sc.close();

	}

}
