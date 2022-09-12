package com.skilldistillery.blackjack.entites;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Deck {
	// every deck has list of cards
	private ArrayList<Card> deck = new ArrayList<Card>(52);

	public List<Card> getDeck() {
		return deck;
	}

	// number of cards still in the deck
	public int checkDeckSize() {
		return deck.size();
	}

	// add card to deck
	public void addCard(Card card) {
		deck.add(card);
	}

	// removes a card
	public Card dealCard() {
		Card dealtCard = deck.get(0);
		deck.remove(0);
		return dealtCard;
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
	}

	public void draw(Card cards) {
		System.out.println("drawing " + cards);
	}

	public String toString() {
		String output = " ";
		for (Card c : deck) {
			output += c;
			output += "\n";
		}
		return output;
	}
}
