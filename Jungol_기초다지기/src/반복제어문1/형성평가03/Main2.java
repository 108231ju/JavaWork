package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, height, width;
		String con = "";
		System.out.println();
		
		while(true) {
			
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			height = sc.nextInt();
			
			width = (base * height) / 2;
			System.out.println("Triangle width = " +Math.round((width)*10.0)/10.0);
			System.out.print("Continue? ");
			con = sc.next();
			
			if(con.equals("Y") || con.equals("y")) {
				
			}else {
				break;
			}
		}
		sc.close();
	
		
		
	}

}
