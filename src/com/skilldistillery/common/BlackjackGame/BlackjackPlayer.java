package com.skilldistillery.common.BlackjackGame;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.common.cards.Card;

public class BlackjackPlayer {
	Scanner kb = new Scanner(System.in);
	private BlackjackHand hand;

	public BlackjackPlayer(BlackjackHand playerHand) {
		this.hand = playerHand;
	}
	public String hitOrStay(BlackjackHand playerHand) {
		String userChoice = null;
		this.hand = playerHand;
		String hit = "hit";
		String stay = "stay";
		String quit = "quit";
		boolean keepGoing = true;
		while(keepGoing) {
			hitOrStayMenu(hand);
		userChoice = kb.nextLine().toLowerCase();	
		switch (userChoice) {
		case "1":
		case "hit":
			keepGoing = false;
			return hit;
		case "2":
		case "stay":
			keepGoing = false;
			return stay;
		case "3": case "quit":
		keepGoing = false;
		return quit;
		default:
			System.out.println("Please choose an option from the list");
		}
		}
		return userChoice;
		
		
		}
		
	
	private void hitOrStayMenu(BlackjackHand playerHand) {
	
		int currentScore = playerHand.getHandValue();	
		System.out.println("\n<===========================================>\n"
							+"|                                           |\n"
							+"|                   PLAYER                  |\n"
							+"|                                           |\n"
							+"|           YOUR CURRENT SCORE IS:          |\n"
							+"|                                           |\n"
							+"|                     " + currentScore + "                    |\n"
							+"|                                           |\n"
							+"|             WOULD YOU LIKE TO             |\n"
							+"|                                           |\n"
							+"|          1: HIT (GET ANOTHER CARD)        |\n"
							+"|          2: STAY (KEEP CURRENT SCORE)     |\n"
							+"|                                           |\n"
							+"|          QUIT: QUIT GAME                  |\n"
							+"|                                           |\n"
							+"<===========================================>");
		
	}
	public boolean isBlackjack(BlackjackHand player) {
		boolean blackjack = false;
	//		int test21 = 21;
//		if (test21 == 21) {
//		blackjack = true;
//		}
			
		if (player.getHandValue() == 21) {
			blackjack = true;
		}
		return blackjack;
	}
		
		
		
		
		
	 
}