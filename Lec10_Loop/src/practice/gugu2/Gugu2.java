package practice.gugu2;

public class Gugu2 {

	public static void main(String[] args) {
		
		
		int i, j, column, loop;
		for(loop = 0; loop < 3; loop++) { // loop --> 단이 가로로 3단 이상 넘어가지 않게 해주는 제어문
			// 각 열에 시작할 단을 계산
			column = 2 + loop * 3;
			
			for( j = 1; j < 10; j++) {
				
				for ( i = column; i < column + 3 && i < 10 ; i++) {
					System.out.printf("%d X %d = %2d\t", i, j, i * j);
			
					
				} //for 3
				System.out.println();
				
			}//for 2
			System.out.println();
			
		} //for 1
		System.out.println("\n프로그램 종료");
	}

}
