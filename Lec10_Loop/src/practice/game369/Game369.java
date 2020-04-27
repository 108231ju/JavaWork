package practice.game369;

/*	369게임
	1~100 까지의 자연수를 나열하되,
	10개 단위로 줄바꿈을 하고
	숫자에 3,6,9 중 하나라도 있으면 * 표시를 하기 */

/*  369 게임
	1	2	*	4	5	*	7	8	*	10	
	11	12	*	14	15	*	17	18	*	20	
	21	22	*	24	25	*	27	28	*	*	
	*	*	*	*	*	*	*	*	*	40	
	41	42	*	44	45	*	47	48	*	50	
	51	52	*	54	55	*	57	58	*	*	
	*	*	*	*	*	*	*	*	*	70	
	71	72	*	74	75	*	77	78	*	80	
	81	82	*	84	85	*	87	88	*	*	
	*	*	*	*	*	*	*	*	*	100 */	
// ^0^*
public class Game369 {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 100;) {
			for (int j = 1; j < 11; j++) {
				int first = i/10;
				int second = i%10;
				if (first == 3 || first == 6 || first == 9) {
					System.out.print(" * ");
				} else if (second == 3 || second == 6 || second == 9) {
					System.out.print(" * ");
				} else {
					System.out.printf("%3d",i);
				}
				i++;
			}
			System.out.println();
		}
		
				
		}

}
