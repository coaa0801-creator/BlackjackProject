package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

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
		userChoice = kb.nextLine().toLowerCase();	
		hitOrStayMenu(hand);
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
		System.out.println("\n<===========================================>"
							+"|                                           |"
							+"|                   PLAYER                  |"
							+"|                                           |"
							+"|           YOUR CURRENT SCORE IS:          |"
							+"|                                           |"
							+"|                     " + currentScore + "                   |"
							+"|                                           |"
							+"|             WOULD YOU LIKE TO             |"
							+"|                                           |"
							+"|          1: HIT (GET ANOTHER CARD)        |"
							+"|          2: STAY (KEEP CURRENT SCORE)     |"
							+"|                                           |"
							+"|          QUIT: QUIT GAME                  |"
							+"|                                           |"
							+"<===========================================>");
		
	}
	public boolean isBlackjack() {
		boolean blackjack = false;
		if (hand.getHandValue() == 21) {
			blackjack = true;
		}
		return blackjack;
	}
		
		
		
		
		
	 
}
