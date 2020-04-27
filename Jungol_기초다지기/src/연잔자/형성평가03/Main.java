package 연잔자.형성평가03;

import java.util.Scanner;

/*직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.


입력 예
20 15
출력 예
width = 25
length = 30
area = 750*/
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int width, length, area;
		width = Integer.parseInt(sc.next()) + 5;
		length = Integer.parseInt(sc.next()) * 2;
		
		area = width * length;
		
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);

	}

}
