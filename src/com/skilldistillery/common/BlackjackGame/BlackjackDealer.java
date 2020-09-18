package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackDealer {
	
	Scanner kb = new Scanner(System.in);

	public void dealCards(Deck blackjackDeck) {
		System.out.println(blackjackDeck.checkDeckSize());
		
//		System.out.println(blackJackDeck.checkDeckSize()); in case of deck error
	}
	
	
	
	
	

}

//Deck deckOne = new Deck();
//System.out.println("How many cards?");
// try {
//	int num = kb.nextInt();
//	if(num > deckOne.checkDeckSize()) {
//		System.out.println("Too many cards");
//	} else {
//		int value = 0;
//		for(int i = 0; i < num; i++) {
//			Card c = deckOne.dealCard();
//			value = c.getValue();
//			System.out.println(c);
//		}
//	}
//} catch (Exception e) {
//	System.out.println("Please enter a number.");
//}
//}
//}
//Rank[] ranks = Rank.values();
//for(int i=0; i<ranks.length; i++) {
//System.out.println(ranks[i] + " " + ranks[i].getValue());
//}
//
//for(Suit s : Suit.values()){
//System.out.println(s);
//}
//_______
//|4      |
//|       |
//|   ♥   |
//|       |
//|      4|
//|_______|