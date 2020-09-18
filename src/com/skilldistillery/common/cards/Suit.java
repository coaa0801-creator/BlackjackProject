package com.skilldistillery.common.cards;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	Suit(String suit){
		Suit = suit;
	}
	private String Suit;
		
	@Override
	public String toString() {
		return Suit;
	}

	public String getSuit() {
		return Suit;
	}
	

}
