package 반복제어문1.자가진단01;
/*1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.


출력 예
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

Hint!

int 변수를 선언하고 초기값으로 1을 대입한다.*/
public class Main {

	public static void main(String[] args) {
		int i = 1;
		while(i < 16) {
			System.out.print(i + " ");
			i++;
		}

	}

}
