package practice.gugu2;

public class Guge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 1;
		int n;
		int result;
		while(dan <= 9) {
		
			n = 1;
			while (n <=9) {
				result = dan * n;
			System.out.printf(dan + " X " + n + " = " + (dan * n) + " " );
			if(n % 3 == 0)
			System.out.println();
			n++;
		}
			dan++;
			System.out.println();
			
		}
		
		
		System.out.println();
	}

}
