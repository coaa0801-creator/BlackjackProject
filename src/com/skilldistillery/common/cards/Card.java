package com.skilldistillery.common.cards;

public class Card {
	private Suit suit;
	private Rank value;
	
	public Card (Suit suit, Rank rank) {
		this.suit = suit;
		value = rank;
	}

	@Override
	public String toString() {
		return value + " of " + suit;
	}

	public int getValue() {
			return value.getValue();
	}
	
	

}
