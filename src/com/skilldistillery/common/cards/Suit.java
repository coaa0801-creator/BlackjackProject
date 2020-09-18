package com.skilldistillery.common.cards;

public enum Suit {
	HEARTS('\u2665'), SPADES('\u2660'), CLUBS('\u2663'), DIAMONDS('\u2666');
	
	Suit(char c){
		Suit = c;
	}
	private char Suit;
		
	@Override
	public String toString() {
		String returnString = "" + Suit + "";
		return returnString;
	}

	public char getSuit() {
		return Suit;
	}
	

}
