package com.skilldistillery.blackjack.entites;

import java.util.Objects;

public class Card {
	// every card has a rank and a suit
	// create 2 field;
	private Suit suit;
	private Rank rank;

	// constructor
	public Card(Suit suit, Rank rank) {
		
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card(Card card) {
		this.suit = card.getSuit();
		this.rank = card.getRank();
	}

	public int getValue() {
		return rank.getValue();
	}
	
	//getters and setters

	public Suit getSuit() {
		return suit;
	}

//	public void setSuit(Suit suit) {
//		this.suit = suit;
//	}

	public Rank getRank() {
		return rank;
	}

//	public void setRank(Rank rank) {
//		this.rank = rank;
//	}

	// hashcode
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + ", getValue()=" + getValue() + "]";
	}
}
