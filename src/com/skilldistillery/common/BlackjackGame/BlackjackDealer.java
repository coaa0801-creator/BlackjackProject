package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Deck;

public class BlackjackDealer {
	private BlackjackHand anyPlayer = new BlackjackHand();
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

	public BlackjackHand dealOneCard(BlackjackHand player) {
		this.anyPlayer = player;
		this.anyPlayer.addCard(blackjackDeck.dealCard());
		printCardDrawn(anyPlayer);
		
		return anyPlayer;
		
	}
	
	private void printCardDrawn(BlackjackHand anyPlayer2) {
		String [] topOfCard = new String[1];
		String [] cardNumUpLeft = new String[1];
		String [] cardSuitMid = new String[1];
		String [] cardNumBotRt = new String[1];
		String blankLineCard = "|     |";
		for (int player1Count = 0; player1Count < topOfCard.length ;player1Count++) {
			if(anyPlayer2 != null){ 
			try {	
					topOfCard[player1Count] = " _____ ";
					cardNumUpLeft[player1Count] = anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getIdTop() + "   |";
					cardSuitMid[player1Count] = "|  " + anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getSuit() + "  |";
					cardNumBotRt[player1Count] = "|___" + anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getIdBottom() + "|" ;
			} catch (IndexOutOfBoundsException e) {
				topOfCard[player1Count] = "     ";
				cardNumUpLeft[player1Count] = "     ";
				cardSuitMid[player1Count] = "     ";
				cardNumBotRt[player1Count] = "     ";
				}}
		}
		
		System.out.println("\n<===========================================>\n"
				+"|                                           |\n"
				+"|                 YOU DREW                  |\n"
				+"|                 " + topOfCard[0] + "                   |\n"
				+"|                 " + cardNumUpLeft[0] + "                   |\n"
				+"|                 " + blankLineCard + "                   |\n"
				+"|                 " + cardSuitMid[0] + "                   |\n"
				+"|                 " + blankLineCard + "                   |\n"
				+"|                 " + cardNumBotRt[0] + "                   |\n"
				+"|                                           |\n"
				+"<===========================================>");}
		
	

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
				this.player2.addCard(blackjackDeck.dealCard());
			}
			if (player3) {
				this.player3.addCard(blackjackDeck.dealCard());
			}
			if (player4) {
				this.player4.addCard(blackjackDeck.dealCard());
			}
			if (player5) {
				this.player5.addCard(blackjackDeck.dealCard());
			}
			if (player6) {
				this.player6.addCard(blackjackDeck.dealCard());
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

	public boolean checkBlackjack(BlackjackHand dealer) {
		boolean blackjack = false;
	//		int test21 = 21;
//		if (test21 == 21) {
//		blackjack = true;
//		}
			
		if (dealer.getHandValue() == 21) {
			blackjack = true;
		}
		return blackjack;
	
	}

	public BlackjackHand Play(BlackjackHand dealer) {
		boolean keepGoing = true;
		while (keepGoing) {
			int dealerHandWithAces = dealer.getHandValue();
			for (int i = 0; i < dealer.getHand().size(); i++) {
				if (dealer.getHand().get(i).getValue() == 11 && dealer.getHandValue() > 21) {
					dealerHandWithAces = dealer.getHandValue() - 10;
				}
				
			}
				if (dealerHandWithAces < 17 ) {
					dealer = dealOneDealerCard(dealer);
				}else if(dealerHandWithAces >= 17) {
					break;
				}
		}
		return dealer;
		
	
}
	private BlackjackHand dealOneDealerCard(BlackjackHand dealer2) {
		this.anyPlayer = dealer2;
		this.anyPlayer.addCard(blackjackDeck.dealCard());
		printDealerCardDrawn(anyPlayer);
		
		return anyPlayer;
		
	}

	private void printDealerCardDrawn(BlackjackHand anyPlayer2) {
		String [] topOfCard = new String[1];
		String [] cardNumUpLeft = new String[1];
		String [] cardSuitMid = new String[1];
		String [] cardNumBotRt = new String[1];
		String blankLineCard = "|     |";
		for (int player1Count = 0; player1Count < topOfCard.length ;player1Count++) {
			if(anyPlayer2 != null){ 
			try {	
					topOfCard[player1Count] = " _____ ";
					cardNumUpLeft[player1Count] = anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getIdTop() + "   |";
					cardSuitMid[player1Count] = "|  " + anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getSuit() + "  |";
					cardNumBotRt[player1Count] = "|___" + anyPlayer2.getHand().get(anyPlayer2.getHand().size()-1).getIdBottom() + "|" ;
			} catch (IndexOutOfBoundsException e) {
				topOfCard[player1Count] = "     ";
				cardNumUpLeft[player1Count] = "     ";
				cardSuitMid[player1Count] = "     ";
				cardNumBotRt[player1Count] = "     ";
				}}
		}
		
		System.out.println("\n<===========================================>\n"
				+"|                                           |\n"
				+"|                DEALER DREW                |\n"
				+"|                 " + topOfCard[0] + "                   |\n"
				+"|                 " + cardNumUpLeft[0] + "                   |\n"
				+"|                 " + blankLineCard + "                   |\n"
				+"|                 " + cardSuitMid[0] + "                   |\n"
				+"|                 " + blankLineCard + "                   |\n"
				+"|                 " + cardNumBotRt[0] + "                   |\n"
				+"|                                           |\n"
				+"<===========================================>");}
		
	

	public void clearHands() {
	player1.clearHand();
	dealer.clearHand();
	if (player2 != null) {
		player2.clearHand();}
		if (player3 != null) {
		player3.clearHand();}
		if (player4 != null) {
		player4.clearHand();}
		if (player5 != null) {
		player5.clearHand();}
		if (player6 != null) {
		player6.clearHand();}
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