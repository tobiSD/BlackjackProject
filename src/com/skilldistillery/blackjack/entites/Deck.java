package com.skilldistillery.blackjack.entites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// every deck has list of cards
	List<Card> deck = new ArrayList<>(52);

	// number of cards still in the deck
	public int checkDeckSize() {
		return deck.size();

	}

	// removes a card
	public Card dealCard() {
		Card dealtCard = deck.remove(0);
		return dealtCard;
		// deck.remove(0);
	}

	// shuffle the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}

		}
		System.out.print("Done creating " + deck.size());
	}
}
