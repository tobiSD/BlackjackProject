package com.skilldistillery.blackjack.entites;

import java.util.ArrayList;

public abstract class Hand {
	// holds the list of cards
	protected ArrayList<Card> cards;
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	// add a single card
	public void addCard(Card card) {
		cards.add(card);
	}

	public Hand() {
		cards = new ArrayList<Card>();
	}

	//add cards from the deck
	public void addtodeck(Deck deck) {
		cards.add(deck.dealCard());
	}

	public void clear() {
		cards.clear();
	}

	//get one card 
	public Card getCard(int i) {
		return cards.get(i);
	}
	
	public abstract int getHandValue();


	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public String toString() {
		String output = " ";
		for (Card c: cards) {
			output+=c + " ";
		}
		return output;
	}
}
