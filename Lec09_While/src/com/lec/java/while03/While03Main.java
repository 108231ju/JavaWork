package com.lec.java.while03;

public class While03Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		// 1-10 까지 홀수만 출력
		
		int count = 1;
		while (count <= 10) {
			if (count % 2 == 1) {
				System.out.println(count);	
			}
			
			count++;
		}

	} // end main()

} // end class While03Main









