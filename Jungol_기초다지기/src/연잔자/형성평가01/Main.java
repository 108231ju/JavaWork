package 연잔자.형성평가01;

import java.util.Scanner;

/*국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)


입력 예
70 95 63 100
출력 예
sum 328
avg 82*/
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, com, sum, avg;
		
		kor = Integer.parseInt(sc.next());
		eng = Integer.parseInt(sc.next());
		math = Integer.parseInt(sc.next());
		com = Integer.parseInt(sc.next());
		
		sum = kor + eng + math + com;
		avg = sum / 4;
		
		System.out.println("sum " + sum);
		System.out.println("avg "+ avg);
		
	}

}
