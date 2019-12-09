package c_statement;

import java.util.Scanner;

public class Rep_prac {

	public static void main(String[] args) {

		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int ans = 0;
		int input = 0;
		do {
			a1 = (int)(Math.random() * 9 + 1);
			a2 = (int)(Math.random() * 9 + 1);
			a3 = (int)(Math.random() * 9 + 1);
		} while(((a1 == a2) || (a2 == a3) || (a3 == a1)));
		
		ans = 100 * a1 + 10 * a2 + a3;
		System.out.println(ans);
		
		Scanner s = new Scanner(System.in);
		input = Integer.parseInt(s.nextLine());
		
		
		
	}	// end main

}		// end class


