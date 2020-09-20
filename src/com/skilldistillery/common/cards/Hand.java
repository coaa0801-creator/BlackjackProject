package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<Card>();
	
	public Hand(){
		
	}
	
	public void addCard(Card card) {
//		if (card == null) {
//			return null;
//		}
		hand.add(card);
//		return hand;
		
	}
	public void clearHand() {
			while (hand.size() > 0) {
			hand.remove(0);
		}
		
	}
	public abstract int getHandValue();
		
	public List<Card> getHand() {
	return hand;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < hand.size(); i++) {
		string.append(hand.get(i).toString());
		string.append("\n");
		}
		String result = string.toString();
		
		return result;
	}
	
}
