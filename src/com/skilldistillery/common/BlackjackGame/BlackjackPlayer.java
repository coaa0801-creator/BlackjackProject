package com.skilldistillery.common.BlackjackGame;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.common.cards.Card;

public class BlackjackPlayer {
	Scanner kb = new Scanner(System.in);
	private BlackjackHand playerHand;

	public BlackjackPlayer(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	public String hitOrStay(BlackjackHand playerHand, int counter) {
		String choice = null;
		boolean keepGoing = true;
		while(keepGoing) {
			hitOrStayMenu(playerHand, counter);
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
		
	
	private void hitOrStayMenu(BlackjackHand playerHand, int counter) {
		int playerHandWithAces = 0;
		int currentScore = playerHand.getHandValue();	
		for (int i = 0; i < playerHand.getHand().size(); i++) {
			if (playerHand.getHand().get(i).getValue() == 11) {
				playerHandWithAces = playerHand.getHandValue();
			}
		}
		if (playerHandWithAces != 0 && playerHand.getHandValue() < 22 && playerHand.getHand().size() == 2) {
			System.out.println("\n<===========================================>\n"
					+"|                                           |\n"
					+"|                   PLAYER " + counter + "                |\n"
					+"|                                           |\n"
					+"|           YOUR CURRENT SCORE IS:          |\n"
					+"|                                           |\n"
					+"|                   " + currentScore + " or " + (currentScore - 10) + "                 |\n"
					+"|                                           |\n"
					+"|             WOULD YOU LIKE TO             |\n"
					+"|                                           |\n"
					+"|          1: HIT (GET ANOTHER CARD)        |\n"
					+"|          2: STAY (KEEP CURRENT SCORE)     |\n"
					+"|                                           |\n"
					+"|          QUIT: QUIT GAME                  |\n"
					+"|                                           |\n"
					+"<===========================================>");}
		else if (playerHandWithAces != 0 && playerHand.getHandValue() < 22) {
			System.out.println("\n<===========================================>\n"
					+"|                                           |\n"
					+"|                   PLAYER " + counter + "                |\n"
					+"|                                           |\n"
					+"|           YOUR CURRENT SCORE IS:          |\n"
					+"|                                           |\n"
					+"|                   " + currentScore + " or " + (currentScore - 10) + "                 |\n"
					+"|                                           |\n"
					+"|             WOULD YOU LIKE TO             |\n"
					+"|                                           |\n"
					+"|          1: HIT (GET ANOTHER CARD)        |\n"
					+"|          2: STAY (KEEP CURRENT SCORE)     |\n"
					+"|                                           |\n"
					+"|          QUIT: QUIT GAME                  |\n"
					+"|                                           |\n"
					+"<===========================================>");}
		else if (playerHandWithAces != 0 && playerHand.getHandValue() > 22) {
			System.out.println("\n<===========================================>\n"
					+"|                                           |\n"
					+"|                   PLAYER " + counter + "                |\n"
					+"|                                           |\n"
					+"|           YOUR CURRENT SCORE IS:          |\n"
					+"|                                           |\n"
					+"|                      " + (currentScore - 10) + "                   |\n"
					+"|                                           |\n"
					+"|             WOULD YOU LIKE TO             |\n"
					+"|                                           |\n"
					+"|          1: HIT (GET ANOTHER CARD)        |\n"
					+"|          2: STAY (KEEP CURRENT SCORE)     |\n"
					+"|                                           |\n"
					+"|          QUIT: QUIT GAME                  |\n"
					+"|                                           |\n"
					+"<===========================================>");}
		
		
		
		else if (currentScore < 10) {
		System.out.println("\n<===========================================>\n"
							+"|                                           |\n"
							+"|                   PLAYER " + counter + "                |\n"
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
					+"|                   PLAYER " + counter + "                |\n"
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
		int playerHandWithAces = hand.getHandValue();
		for (int i = 0; i < hand.getHand().size(); i++) {
			if (hand.getHand().get(i).getValue() == 11 && hand.getHandValue() > 21) {
				playerHandWithAces = hand.getHandValue() - 10;
			}
		}
		boolean busted = false;
		if (playerHandWithAces > 21) {
		busted = true;
		}
		return busted;
		
	}
		
		
		
		
		
	 
}
