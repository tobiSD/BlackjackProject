package com.skilldistillery.blackjack.entites;

import java.util.Scanner;

public class Player {

	protected BlackJackHand hand = new BlackJackHand();
	protected Dealer dealer;

	Scanner kb = new Scanner(System.in);

	public Player() {

	}

	// constructor
	public Player(Dealer dealer) {
		this.dealer = dealer;
	}

	// getters and setters
	public Hand getHand() {
		return this.hand;
	}

	public void setHand(BlackJackHand hand) {
		this.hand = hand;
	}

	// player adds card to hand
	public void addCardToHand(Card cards) {
		//System.out.println(cards);
		hand.addCard(cards);
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + ", getHand()=" + getHand() + "]";
	}

	// show card
	public void showCard() {
		for (Card c : hand.getCards()) {
			System.out.println(c.getSuit() + " " + c.getRank());
		}
	}

	// player has bjack
	public boolean isBlackjack() {
		if (this.getHand().getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	// initial 2 cards
	public void cardsdealt(int numCardsToDeal) {
		int numCardsDealt = 0;
		while (numCardsDealt < numCardsToDeal) {
			hand.addCard(dealer.dealCard());
			numCardsDealt++;

		}
		showCard();
		System.out.println("your total hand " + hand.getHandValue());
	}

	// hit or stand
	public void hitorstand() { 
		String choice = "";
		System.out.println("Do you want to hit or stand");
		choice = kb.next();
		if (choice.equals("hit")) {
			// player gets a new card from the remaining deck
			hit();
			// then display the previous two card plus new card and new card
			showCard();
			// returns new total
			System.out.println(hand.getHandValue());
			
			if (hand.getHandValue() > 21) {
				System.out.println("Game is over");
			}else {
				hitorstand();    //call a method in itself 
			}
		} else {
			System.out.println("You choose to stand");
		}
	}

	//players hit
	public void hit() {
		addCardToHand(dealer.dealCard());
	}
	
	//stand
	public void stand() {
		//dealer game starts
		
	}
}