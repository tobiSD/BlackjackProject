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
		
		// give players 2 cards each 
		System.out.println();
		System.out.println("DEALER'S CARD");
		dealer.dealCard(dealer);
		dealer.dealCard(dealer);
		dealer.showonecard();

		//player
		System.out.println();
		System.out.println("PLAYER'S CARD");
		player.cardsdealt(2, player);
		player.hitorstand();
		
		//dealer
		System.out.println();
		System.out.println("DEALER CARD");
		dealer.showCard();
		dealer.dealerhitorstand();
		logic();
		
	}
	public void logic() {
		int pv =player.getHand().getHandValue();
		int dv = dealer.getHand().getHandValue();
		System.out.println();
		if(pv == dv ) {
			System.out.println("equal");
		}if (pv == 21 ){
			System.out.println("blackjack");
		}if (pv>dv) {
			System.out.println("player has more points");
		}if (pv<dv) {
			System.out.println("dealer has more points");
		}
		else {
			System.out.println("bust");
		}
	}
}
