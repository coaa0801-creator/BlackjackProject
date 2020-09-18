package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>(52);
	
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
				
			}
			
		}
	}

	public int checkDeckSize() {
		int numOfCards = -1;
		numOfCards = deck.size();
		return numOfCards;
	}

	public Card dealCard() {
		return deck.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(deck);

	}
}
