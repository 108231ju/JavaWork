package 반복제어문1.형성평가03;

import java.util.Scanner;

/*	 0 부터 100 까지의 점수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.

	(평균은 반올림하여 소수 첫째자리까지 출력한다.)
	
	
	입력 예
	55 100 48 36 0 101
	출력 예
	sum : 239
	avg : 47.8 */

public class Main {

	public static void main(String[] args) {
	System.out.println();
	Scanner sc = new Scanner (System.in);
	int i, sum, count;
	count = 0;
	sum = 0;
	
	for(;;) {
		i = sc.nextInt();
		if(i > 100 || i < 0 ) break;
			count++;
			sum += i;
			
		
	
		
	}
	
	System.out.println("sum : " + sum);
	System.out.println("avg : " + Math.round(((double)sum/count)*10.0)/10.0);
	sc.close();
	}
}


