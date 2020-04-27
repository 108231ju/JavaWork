package 입력.자가진단05;

public class Main {

	public static void main(String[] args) {
		/* 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.

		2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.​


		출력 예
		 2.1yd = 192.0cm
		10.5in =  26.7cm
*/
		double yd = 91.44;
		double in = 2.54;
		
	
		System.out.printf(" %.1fyd = %.1fcm\n",2.1, (2.1*yd));
		System.out.printf("%.1fin =  %.1fcm\n",10.5, (10.5*in));
	}

}
