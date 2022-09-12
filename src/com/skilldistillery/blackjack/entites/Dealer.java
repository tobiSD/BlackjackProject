package com.skilldistillery.blackjack.entites;

public class Dealer extends Player {

	private Deck deck;

	public Dealer() {
		deck = new Deck();
	}

	public void shuffle() {
		deck.shuffle();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	public void showonecard() {
		//System.out.println(hand.getCard(0));
		System.out.println("Second card is face down");
	}
	
	// initial 2 cards
	public void cardsdealt(int numCardsToDeal) {
		int numCardsDealt = 0;
		while (numCardsDealt < numCardsToDeal) {
			addCardToHand(dealCard());
			numCardsDealt++;
		}
		showCard();
		System.out.println("your total hand " + hand.getHandValue());
	}
	
	//dealers hit
	public void hit() {
		addCardToHand(dealCard());
	}
}
