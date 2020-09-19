package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackDealer {
	private BlackjackHand player1 = new BlackjackHand();
	private BlackjackHand player2 = new BlackjackHand();
	private BlackjackHand player3 = new BlackjackHand();
	private BlackjackHand player4 = new BlackjackHand();
	private BlackjackHand player5 = new BlackjackHand();
	private BlackjackHand player6 = new BlackjackHand();
	private BlackjackHand dealer = new BlackjackHand();

	Scanner kb = new Scanner(System.in);
	private Deck blackjackDeck;

	public BlackjackDealer(Deck blackJackDeck) {
		this.blackjackDeck = blackJackDeck; 
	}

	public void dealStartHands(boolean player1, boolean player2,boolean player3, boolean player4,boolean player5, boolean player6) {
//		System.out.println(blackjackDeck.checkDeckSize());check deck size
		int count = 0;
		while (count < 2) {
			count++;
			if (player1) {
//				System.out.println(blackjackDeck.dealCard());
				this.player1.addCard(blackjackDeck.dealCard());
			}
			if (player2) {
				this.player1.addCard(blackjackDeck.dealCard());
			}
			if (player3) {
				this.player1.addCard(blackjackDeck.dealCard());
			}
			if (player4) {
				this.player1.addCard(blackjackDeck.dealCard());
			}
			if (player5) {
				this.player1.addCard(blackjackDeck.dealCard());
			}
			if (player6) {
				this.player1.addCard(blackjackDeck.dealCard());
			}
			dealer.addCard(blackjackDeck.dealCard());
		}

//		System.out.println(blackJackDeck.checkDeckSize()); in case of deck error

	}

	public BlackjackHand getPlayer1() {
		return player1;
	}

	public BlackjackHand getDealer() {
		return dealer;
	}

	public BlackjackHand getPlayer2() {
		return player2;
	}

	public BlackjackHand getPlayer3() {
		return player3;
	}

	public BlackjackHand getPlayer4() {
		return player4;
	}

	public BlackjackHand getPlayer5() {
		return player5;
	}

	public BlackjackHand getPlayer6() {
		return player6;
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
//_______    ___
//|4      | |4  |
//|       |	| ♥ |
//|   ♥     |__4|
//|       |
//|      4|
//|_______|