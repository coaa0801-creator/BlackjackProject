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
		String choice = null;
		this.hand = playerHand;
		boolean keepGoing = true;
		while(keepGoing) {
			hitOrStayMenu(hand);
		String userChoice = kb.nextLine().toLowerCase();	
		switch (userChoice) {
		case "1":
		case "hit":
			keepGoing = false;
			choice = "hit";
			break;
		case "2":
		case "stay":
			keepGoing = false;
			choice = "stay";
			break;
		case "3": case "quit":
		keepGoing = false;
		choice = "quit";
		break;
		default:
			System.out.println("Please choose an option from the list");
		}
		}
		return choice;
		
		
		}
		
	
	private void hitOrStayMenu(BlackjackHand playerHand) {
	
		int currentScore = playerHand.getHandValue();	
		if (currentScore < 10) {
		System.out.println("\n<===========================================>\n"
							+"|                                           |\n"
							+"|                   PLAYER                  |\n"
							+"|                                           |\n"
							+"|           YOUR CURRENT SCORE IS:          |\n"
							+"|                                           |\n"
							+"|                     " + currentScore + "                     |\n"
							+"|                                           |\n"
							+"|             WOULD YOU LIKE TO             |\n"
							+"|                                           |\n"
							+"|          1: HIT (GET ANOTHER CARD)        |\n"
							+"|          2: STAY (KEEP CURRENT SCORE)     |\n"
							+"|                                           |\n"
							+"|          QUIT: QUIT GAME                  |\n"
							+"|                                           |\n"
							+"<===========================================>");}
		else {
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
					+"<===========================================>");}
		
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
	public boolean handBusted(BlackjackHand hand) {
		boolean busted = false;
		if (hand.getHandValue() > 21) {
		busted = true;
		}
		return busted;
		
	}
		
		
		
		
		
	 
}
