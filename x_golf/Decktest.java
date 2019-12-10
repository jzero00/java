package x_golf;

public class Decktest {

	public static void main(String[] args) {

		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c = d.pick();
		System.out.println(c);
	}

}
