package com.lec.java.firstjava;
/*
모든 자바 프로그램은 main() 메소드로부터 '시작'한다
프로그램 실행순서는 '시작' 부터 한 문장(Statement) 씩 실행되는 것이 원칙
문장의 끝은 반드시 세미콜론 ';' 으로 마무리 해야 한다
*/

// 블럭 주석
// /* ~ */
public class FirstJava {
// tab 우측 shift+tab 좌측
	public static void main(String[] args) {
		System.out.println("My First Java App");
		
		System.out.println(123);
		System.out.println();	// 줄바꿈만.
		System.out.println(10 + 20);
		System.out.println("10 + 20"); // "~" 안의 10+ 20 은 문자열로 인식
		
		// 문자열 출력은 반드시 " ~ "로 감싸야 한다.
//		ctrl + / 주석 단축키
//		System.out.println(안녕하세요); // 에러
		
		System.out.println(3.141592 * 10 * 10);
		System.out.println(10 * 10 / 2);
		
		// + 연산자의 여러가지 동작
		System.out.println("안녕하세요" + "여러분");
		System.out.println("결과: " + 10);
		System.out.println("결과: " + 10 + 20);
		System.out.println("결과: " + (10 + 20));
		//10 + 20 + 30
		
		//사칙연산 보여주기 (+, -, *, / )
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 + 20 = " + (10 - 20));
		System.out.println("10 + 20 = " + (10 * 20));
		System.out.println("10 + 20 = " + (10 / 20)); // 정수 / 정수 결과는 정수(소숫점 이하 절삭)
		System.out.println("10 + 20 = " + ((double)10 / 20));
		
		// 이스케이프 문자 (escape character)
		// " ~ " 문자열 안에서 특수한 문자 출력
		// 역슬래시(\) 와의 조합문자로 구성
		
		// \" : 쌍따옴표 출력
		// \n : 줄바꿈
		// \t : 탭문자
		// \\ : 역슬래시
		
		
		// she says "Hi" <--- 출력하려면?
//		System.out.println("she says "Hi""); //에서
		System.out.println("she says \"Hi\"");
		
		System.out.println("\t123\t456");
		System.out.println("\t10\t4");
		System.out.println("Avengers\nEndgame");
		
		
	}


}
