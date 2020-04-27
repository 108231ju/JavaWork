package com.lec.java.while01;

/*
 	조건식이 true 인 동안 while 블럭 반복
 	
 	while(조건식 true / false){
 		.. 
 		..
 	}
 
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
			// 1 ... 10
			int count = 1;
			while(count <= 10) {
				System.out.println(count);
				count++;
			} // end while
			
		System.out.println();
		
		// 10 ... 1
			count = 10;
			while(count >= 1 ) {
				System.out.println(count);
				count--;
			
		}

		
	} // end main()
	
} // end class While01Main









