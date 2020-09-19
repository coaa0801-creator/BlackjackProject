package com.skilldistillery.common.BlackjackGame;

import java.util.List;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	@Override
	public int getHandValue() {
		List<Card> hand = getHand();
		int handTotal = 0;
		for (int i = 0; i < hand.size(); i++)
			handTotal += hand.get(i).getValue();
		
		return handTotal;
	}

}
