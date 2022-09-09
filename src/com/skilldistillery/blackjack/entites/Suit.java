package com.skilldistillery.blackjack.entites;

public enum Suit {
	HEARTS("hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
