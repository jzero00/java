package x_golf;

import java.util.ArrayList;
import java.util.Scanner;

public class Decktest {

	public static void main(String[] args) {
		ArrayList<Card> getCard = new ArrayList<>();
		
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		
		d.shuffle();
		c = d.pick();
		System.out.println(c);
		
		d.shuffle();
		c = d.pick();
		System.out.println(c);
		
		d.shuffle();
		c = d.pick();
		System.out.println(c);
		
		d.shuffle();
		c = d.pick();
		System.out.println(c);
		
		Scanner s = new Scanner(System.in);
		System.out.print("카드를 받으려면 아무키를 누르고 Die하려면 0을 누르세요");
		String key = s.nextLine();
		if(key.equals("0")){
			System.out.println("게임을 종료합니다.");
		}
		else {
			d.shuffle();
			c = d.pick();
			System.out.println(c);
			System.out.print("카드를 받으려면 아무키를 누르고 Die하려면 0을 누르세요");
			key = s.nextLine();
			if(key.equals("0")){
				System.out.println("게임을 종료합니다.");
			}
			else {
				d.shuffle();
				c = d.pick();
				System.out.println(c);
			}
		}
		
	}

}
