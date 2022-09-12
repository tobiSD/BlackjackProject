package com.skilldistillery.blackjack.app;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp playblackjack = new BlackjackApp();
		playblackjack.run();

	}

	private void run() {
		System.out.println("Welcome to BlackJack Game");
		BlackJackGame game = new BlackJackGame();
		game.playGame();

	}
}
