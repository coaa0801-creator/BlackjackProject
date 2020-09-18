package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>();
	
	public Deck() {			
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
		}
	
	public List<Card> addMoreDecks(int numDecksForGameplay){
		int decksAdded = 1;
		while(decksAdded < numDecksForGameplay) {
			decksAdded++;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
				}
					}}
		return deck;
				
			
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
