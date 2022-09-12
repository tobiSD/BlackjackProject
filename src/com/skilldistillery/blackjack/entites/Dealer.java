package com.skilldistillery.blackjack.entites;

public class Dealer extends Player {

	private Deck deck;

	public Dealer() {
		deck = new Deck();
	}

	public void shuffle() {
		deck.shuffle();
	}

	public void dealCard(Player player) {
		Card cardtodeal = deck.dealCard();
		player.addCardToHand(cardtodeal);
	}

	public void showonecard() {
		// System.out.println(hand.getCards());
		System.out.println(hand.getCard(0));
		System.out.println("Second card is face down");

	}

	public void dealerhitorstand() {
		while (true) {
			int total = hand.getHandValue();
			System.out.println(total);
			if (hand.getHandValue() <= 17) {
				dealerhit();
			} else {
				System.out.println("You choose to stay");
				break;
			}
		}
		showCard();
	}

	public void dealerhit() {
		dealCard(this);
	}
}
