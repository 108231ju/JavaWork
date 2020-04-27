package com.lec.java.operator08;

/* 비트 연산자 (bit-wise operator)
 *   a & b: (and) a,b가 모두 1 이면 결과도 1, 그 외에는 0
 *   a | b: (or) a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
 *   a ^ b: (xor) a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
 *          결국 둘이 같으면 0, 다르면 1
 *    ~a  : (not) a가 1이면 0, a가 0이면 1로 바꿔줌
*/
public class Operator08Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");
		
		byte n1 = 10;	// 		0000 1010
		byte n2 = 7;	// 		0000 0111
						//	&---------------
						//		0000 0010
//디버깅 -> 변수값 계획대로 되고 있는가, 콘솔창 결과창 확인 
		int result = n1 & n2; 
		System.out.println("& 결과 = " + result);
		System.out.println("& 결과 = " + Integer.toBinaryString(result));
		
		result = n1 | n2;
		System.out.println("| 결과 = " + result);
		System.out.println("| 결과 = " + Integer.toBinaryString(result));
		
		result = n1 ^ n2;
		System.out.println("^ 결과 = " + result);
		System.out.println("^ 결과 = " + Integer.toBinaryString(result));
		
		result = ~n1;
		System.out.println("~ 결과 = " + result);
		System.out.println("~ 결과 = " + Integer.toBinaryString(result));
		
		// 음수 정수 표현 참조 : http://tcpschool.com/c/c_refer_negativeNumber
		
		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");
		
		int n3 = 10; // 0000 1010
						//
		int result2 = n3 >> 1;	//비트를 오른쪽으로 이동
		System.out.println(">> 결과 = " + result2);
		System.out.println(">> 결과 = " + Integer.toBinaryString(result2));
		
		result2 = n3 << 1;	//비트를 왼쪽으로 이동
		System.out.println(">> 결과 = " + result2);
		System.out.println(">> 결과 = " + Integer.toBinaryString(result2));
		
		System.out.println(n3 << 1);
		System.out.println(n3 * 2);
		
		System.out.println(n3 >> 1);
		System.out.println(n3 / 2);
		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class







