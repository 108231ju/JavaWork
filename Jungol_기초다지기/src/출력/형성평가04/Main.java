package 출력.형성평가04;

public class Main {

	public static void main(String[] args) {
		/*다음 출력 예와 같이 출력되는 프로그램을 작성하시오.

		합계와 평균은 수식을 이용하세요. 


		출력 예
		kor 90
		mat 80
		eng 100
		sum 270
		avg 90 */
		
		int kor = 90;
		int mat = 80;
		int eng = 100;
		int sum = 270;
		int avg = 90;
		
		System.out.println("kor " + kor + "\nmat " + mat + "\neng " + eng);
		System.out.println("sum " + (kor + mat + eng));
		System.out.println("avg " + (kor + mat + eng) / 3);

	}

}
