package com.lec.java.switch02;

public class Switch02Main {

	public static void main(String[] args) {
		System.out.println("switch 연습");

		// 도전
		// switch ~ case 조건문을 사용해서
		// 짝수 이면 --> "짝수입니다"  출력
		// 홀수 이면 --> "홀수입니다"  출력

		 int num = 91;
		int result = num % 2;
		/*switch (result) {
		case 0 :
			System.out.println("짝수입니다");
			break;
		default:
			System.out.println("홀수입니다");
			
		}*/
		
		if (result == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









