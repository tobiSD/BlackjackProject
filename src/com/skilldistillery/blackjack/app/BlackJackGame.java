package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entites.Dealer;
import com.skilldistillery.blackjack.entites.Player;

public class BlackJackGame {

	//private Deck deck;

	private Player player;
	private Dealer dealer;

	public BlackJackGame() {
		// super();
	}

	public void playGame() {
		// create our player and dealer
		dealer = new Dealer();
		player = new Player(dealer);

		// dealer shuffle the deck
		dealer.shuffle();
		
		// give player 2 cards each 
		System.out.println();
		System.out.println("Dealers card");
		//show one card
		dealer.showonecard();

		
		System.out.println();
		System.out.println("Players card");
		player.cardsdealt(2);
		player.hitorstand();
		
		//when player choice = 0; show 2 cards for dealer
		//ask dealer hit or stand 
		// end game when value >21
		System.out.println();
		System.out.println("Dealers card");
		dealer.cardsdealt(2);
		dealer.hitorstand();
		
		
		
	}
}
