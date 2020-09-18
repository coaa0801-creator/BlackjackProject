package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackGame {
	BlackjackDealer table1Dealer = new BlackjackDealer();	
	Deck blackJackDeck = new Deck();
	Scanner kb = new Scanner(System.in);
	
	public String playGame() {
		String menu = "quit";
		playerChooseNumberDecks();

		boolean playGame = true;
		if (blackJackDeck == null) {
			playGame = false;
		}
		while (playGame) {
			table1Dealer.dealCards(blackJackDeck);
		
		
		
		
		}		
	
		
//		blackJackDeck.addMoreDecks(userInput);
		
		
		
		
	return menu;	
	}
	
	
	
	private Deck playerChooseNumberDecks() {
		boolean keepGoing = true;
		while (keepGoing) {
			playerChooseNumberDecksMenu();
			String userChoice = kb.nextLine().toLowerCase();
		switch (userChoice) {
		case "1": case "52":
			keepGoing = false;
			break;
		case "2": case "104":
			blackJackDeck.addMoreDecks(2);
			keepGoing = false;
			break;			
		case "3": case "156":
			blackJackDeck.addMoreDecks(3);
			keepGoing = false;
			break;			
		case "4": case "208":
			blackJackDeck.addMoreDecks(4);
			keepGoing = false;
			break;			
		case "5": case "260":
			blackJackDeck.addMoreDecks(5);
			keepGoing = false;
			break;			
		case "6": case "quit":
			blackJackDeck = null;
			keepGoing = false;
			break;
		default: 
			System.out.println("Please the number from the list");
		}
		}
		return blackJackDeck;
	}
		
	private void playerChooseNumberDecksMenu() {
		System.out.println("\n<===========================================>");
		System.out.println("|                            _____          |\n" + 
				"|                    _____  |K  WW|         |\n" + 
				"|            _____  |Q  ww| | /\\{)|         |\n" + 
				"|     _____ |J  ww| | /\\{(| | \\/%%| _____   |\n" + 
				"|    |10 o || /\\{)| | \\/%%| |  %%%||A ^  |  |\n" + 
				"|    |o o o|| \\/% | |  %%%| |_%%%>|| / \\ |  |\n" + 
				"|    |o o o||   % | |_%%%O|        | \\ / |  |\n" + 
				"|    |o o o||__%%[|                |  .  |  |\n" + 
				"|    |___0I|                       |____V|  |\n" + 
				"|                                           |");
		System.out.println("|           HOW MANY DECKS WOULD            |");
		System.out.println("|          YOU LIKE TO PLAY WITH?           |");
		System.out.println("|                                           |");
		System.out.println("|             1: 52 CARDS                   |");
		System.out.println("|             2: 104 CARDS                  |");
		System.out.println("|             3: 156 CARDS                  |");
		System.out.println("|             4: 208 CARDS                  |");
		System.out.println("|             5: 260 CARDS                  |");
		System.out.println("|                                           |");
		System.out.println("|             QUIT: QUIT GAME               |");
		System.out.println("|                                           |");
		System.out.println("<===========================================>");
		
	}

}
