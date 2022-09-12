package com.skilldistillery.blackjack.entites;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	public boolean isBlackjack() {
		return false;
	}

	public boolean isbust() {

		return false;
	}

	@Override
	public int getHandValue() {
		int value = 0;
		// int aceCount = 0;
		for (Card card : cards) {
			value = value + card.getValue();
		}
		return value;
	}

}
