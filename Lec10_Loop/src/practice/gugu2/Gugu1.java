package practice.gugu2;

public class Gugu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int dan = 2;
			while (dan <= 9) {
				int n = 1;
				while (n <= 9) {
					
					System.out.println(dan + " x " + n + " = " + (dan*n) );
					n++;
				}
				dan++;
				System.out.println();
			}
	}

}
