package com.skilldistillery.blackjack.entites;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	public boolean isBlackjack() {
		// returns true if the total value of the hand is equal to 21
		return true;
	}

	public boolean isbust() {
		// returns false if it over 21
		return false;
	}

	@Override
	public int getHandValue() {
		int value = 0;
		// int aceCount = 0;
		for (Card card : cards) {
			value = value + card.getValue();
//				if(card.getValue() == 11) {
//					aceCount++;
//				}
//			}
//			if(value>21 && aceCount>0) {
//				while(aceCount>0 && value >21) {
//					aceCount --;
//					value-=10;
//				}
		}
		return value;
	}

}
