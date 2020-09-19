package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackGame {
	private Deck blackJackDeck = new Deck();
	Scanner kb = new Scanner(System.in);
	private GamePlayTable table = new GamePlayTable();
	private BlackjackDealer table1Dealer = new BlackjackDealer(blackJackDeck);
	private BlackjackHand player1;
	private BlackjackHand dealer;
	private BlackjackHand player2;
	private BlackjackHand player3;
	private BlackjackHand player4;
	private BlackjackHand player5;
	private BlackjackHand player6;
	private BlackjackPlayer user1 = new BlackjackPlayer(player1);
	private BlackjackPlayer user2 = new BlackjackPlayer(player2);;
	private BlackjackPlayer user3 = new BlackjackPlayer(player3);;
	private BlackjackPlayer user4 = new BlackjackPlayer(player4);;
	private BlackjackPlayer user5 = new BlackjackPlayer(player5);;
	private BlackjackPlayer user6 = new BlackjackPlayer(player6);;
	private String player1Result = "  SEAT OPEN   ";
	private String player2Result = "  SEAT OPEN   ";
	private String player3Result = "  SEAT OPEN   ";
	private String player4Result = "  SEAT OPEN   ";
	private String player5Result = "  SEAT OPEN   ";
	private String player6Result = "  SEAT OPEN   ";

	public String startGame() {
		String menu = "quit";
		playerChooseNumberDecks();
		boolean playGame = true;
		if (blackJackDeck == null) {
			playGame = false;
		}
		while (playGame) {
			boolean player1 = true;
			boolean player2 = false;
			boolean player3 = false;
			boolean player4 = false;
			boolean player5 = false;
			boolean player6 = false;
			menu = userChoosePlayerAmount();
			if (menu.equals("quit")) {
				playGame = false;
			}

		}

		return menu;
	}

	private String userChoosePlayerAmount() {
		String menu = "";
		boolean keepGoing = true;
		while (keepGoing) {
			userChoosePlayerAmountMenu();
			String userChoice = kb.nextLine().toLowerCase();
			switch (userChoice) {
			case "1":
			case "one":
				boolean player1 = true;
				boolean player2 = false;
				boolean player3 = false;
				boolean player4 = false;
				boolean player5 = false;
				boolean player6 = false;
				player1Result = "  PLAYER 1    ";
				player2Result = "  SEAT OPEN   ";
				player3Result = "  SEAT OPEN   ";
				player4Result = "  SEAT OPEN   ";
				player5Result = "  SEAT OPEN   ";
				player6Result = "  SEAT OPEN   ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "2":
			case "two":
				player1 = true;
				player2 = true;
				player3 = false;
				player4 = false;
				player5 = false;
				player6 = false;
				player1Result = "  PLAYER 1    ";
				player2Result = "  PLAYER 2    ";
				player3Result = "  SEAT OPEN   ";
				player4Result = "  SEAT OPEN   ";
				player5Result = "  SEAT OPEN   ";
				player6Result = "  SEAT OPEN   ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "3":
			case "three":
				player1 = true;
				player2 = true;
				player3 = true;
				player4 = false;
				player5 = false;
				player6 = false;
				player1Result = "  PLAYER 1    ";
				player2Result = "  PLAYER 2    ";
				player3Result = "  PLAYER 3    ";
				player4Result = "  SEAT OPEN   ";
				player5Result = "  SEAT OPEN   ";
				player6Result = "  SEAT OPEN   ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "4":
			case "four":
				player1 = true;
				player2 = true;
				player3 = true;
				player4 = true;
				player5 = false;
				player6 = false;
				player1Result = "  PLAYER 1    ";
				player2Result = "  PLAYER 2    ";
				player3Result = "  PLAYER 3    ";
				player4Result = "  PLAYER 4    ";
				player5Result = "  SEAT OPEN   ";
				player6Result = "  SEAT OPEN   ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "5":
			case "five":
				player1 = true;
				player2 = true;
				player3 = true;
				player4 = true;
				player5 = true;
				player6 = false;
				player1Result = "  PLAYER 1    ";
				player2Result = "  PLAYER 2    ";
				player3Result = "  PLAYER 3    ";
				player4Result = "  PLAYER 4    ";
				player5Result = "  PLAYER 5    ";
				player6Result = "  SEAT OPEN   ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "6":
			case "six":
				player1 = true;
				player2 = true;
				player3 = true;
				player4 = true;
				player5 = true;
				player6 = true;
				player1Result = "  PLAYER 1    ";
				player2Result = "  PLAYER 2    ";
				player3Result = "  PLAYER 3    ";
				player4Result = "  PLAYER 4    ";
				player5Result = "  PLAYER 5    ";
				player6Result = "  PLAYER 6    ";
				playFullTableHand(player1, player2, player3, player4, player5, player6);
				keepGoing = false;
				break;
			case "7":
			case "quit":
				keepGoing = false;
				menu = "quit";
				break;

			default:
				System.out.println("Please pick a number from the list");
			}
		}

		return menu;
	}

	private String userChoosePlayerAmountMenu() {
		System.out.println("\n<===========================================>");
		System.out.println("|                            _____          |\n"
				+ "|                    _____  |K  WW|         |\n" + "|            _____  |Q  ww| |   {)|         |\n"
				+ "|     _____ |J  ww| |   {(| |(v)%%| _____   |\n" + "|    |10 v ||   {)| |(v)%%| | v%%%||A_ _ |  |\n"
				+ "|    |v v v||(v)% | | v%%%| |_%%%>||( v )|  |\n" + "|    |v v v|| v % | |_%%%O|        | \\ / |  |\n"
				+ "|    |v v v||__%%[|                |  .  |  |\n" + "|    |___0I|                       |____V|  |\n"
				+ "|                                           |");
		System.out.println("|          HOW MANY PLAYERS WOULD           |");
		System.out.println("|          YOU LIKE TO PLAY WITH?           |");
		System.out.println("|                                           |");
		System.out.println("|             1: 1 PLAYERS                  |");
		System.out.println("|             2: 2 PLAYERS                  |");
		System.out.println("|             3: 3 PLAYERS                  |");
		System.out.println("|             4: 4 PLAYERS                  |");
		System.out.println("|             5: 5 PLAYERS                  |");
		System.out.println("|             6: 6 PLAYERS                  |");
		System.out.println("|                                           |");
		System.out.println("|             QUIT: QUIT GAME               |");
		System.out.println("|                                           |");
		System.out.println("<===========================================>");

		return null;
	}

	private void playFullTableHand(boolean player1, boolean player2, boolean player3, boolean player4, boolean player5,
			boolean player6) {
//		System.out.println(blackJackDeck.checkDeckSize()); check card amount
		boolean dealerNoShow = true;
		int startNumCards = blackJackDeck.checkDeckSize();
		
		blackJackDeck.shuffle();
		blackJackDeck.dealCard(); //burn card in BlackJack
		table1Dealer.dealStartHands(player1, player2, player3, player4, player5, player6);
		this.player1 = table1Dealer.getPlayer1();
		this.player2 = table1Dealer.getPlayer2();
		this.player3 = table1Dealer.getPlayer3();
		this.player4 = table1Dealer.getPlayer4();
		this.player5 = table1Dealer.getPlayer5();
		this.player6 = table1Dealer.getPlayer6();
		this.dealer = table1Dealer.getDealer();
		int counter = 1;
		
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		this.player1 = userMoves(this.player1,counter);
		counter++;
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		this.player2 = userMoves(this.player2,counter);
		counter++;
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		this.player3 = userMoves(this.player3,counter);
		counter++;
		
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		this.player4 = userMoves(this.player4,counter);
		counter++;
	
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		this.player5 = userMoves(this.player5,counter);
		counter++;
		
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		
		this.player6 = userMoves(this.player6,counter);
		table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result, player5Result, player6Result);
		
		

	}

	private BlackjackHand userMoves(BlackjackHand player,int counter) {
		 
		BlackjackHand playerUp = player;
		if (counter == 1) {
			boolean playerTurn = true;
			if (user1.isBlackjack(this.player1)) {
				playerTurn = false;
				player1Result = "BLACKJACK!!";
			}
			while (playerTurn) {
				while (this.player1.getHandValue() < 21) {
					String choice =	user1.hitOrStay(this.player1);
					if (choice.equals("hit")){
						playerUp = table1Dealer.dealOneCard(this.player1);
						
			}
					else if (choice.equals("stay")) {
						playerTurn = false;
								break;
					}
			}
			}
		}
	
		else if (counter == 2) {
		boolean playerTurn = true;
		if (user2.isBlackjack(this.player2)) {
			playerTurn = false;
			player2Result = "BLACKJACK!!";
		}
		while (playerTurn) {
			while (this.player2.getHandValue() < 21) {
				String choice =	user2.hitOrStay(this.player2);
				if (choice.equals("hit")){
					playerUp = table1Dealer.dealOneCard(this.player2);
				}
				else if (choice.equals("stay")) {
					playerTurn = false;
					break;
				}
			}
		}
	}

		else if (counter == 3) {
		boolean playerTurn = true;
		if (user3.isBlackjack(this.player3)) {
			playerTurn = false;
			player3Result = "BLACKJACK!!";
		}
		while (playerTurn) {
			while (this.player3.getHandValue() < 21) {
				String choice =	user3.hitOrStay(this.player3);
				if (choice.equals("hit")){
					playerUp = table1Dealer.dealOneCard(this.player3);
				}
				else if (choice.equals("stay")) {
					playerTurn = false;
					break;
				}
			}
		}
	}
		else if (counter == 4) {
		boolean playerTurn = true;
		if (user4.isBlackjack(this.player4)) {
			playerTurn = false;
			player4Result = "BLACKJACK!!";
		}
		while (playerTurn) {
			while (this.player4.getHandValue() < 21) {
				String choice =	user4.hitOrStay(this.player4);
				if (choice.equals("hit")){
					playerUp = table1Dealer.dealOneCard(this.player4);
				}
				else if (choice.equals("stay")) {
					playerTurn = false;
					break;
				}
			}
		}
	}

		else if (counter == 5 ) {
		boolean playerTurn = true;
		if (user5.isBlackjack(this.player5)) {
			playerTurn = false;
			player5Result = "BLACKJACK!!";
		}
		while (playerTurn) {
			while (this.player5.getHandValue() < 21) {
				String choice =	user5.hitOrStay(this.player5);
				if (choice.equals("hit")){
					playerUp = table1Dealer.dealOneCard(this.player5);
				}
				else if (choice.equals("stay")) {
					playerTurn = false;
					break;
				}
			}
		}
	}
		else if (counter == 6) {
		boolean playerTurn = true;
		if (user6.isBlackjack(this.player6)) {
			playerTurn = false;
			player5Result = "BLACKJACK!!";
		}
		while (playerTurn) {
			while (this.player6.getHandValue() < 21) {
				String choice =	user5.hitOrStay(this.player6);
				if (choice.equals("hit")){
					playerUp = table1Dealer.dealOneCard(this.player6);
				}
				else if (choice.equals("stay")) {
					playerTurn = false;
					break;
				}
			}
		}
	}
	return playerUp;
	}

	private Deck playerChooseNumberDecks() {
		boolean keepGoing = true;
		while (keepGoing) {
			playerChooseNumberDecksMenu();
			String userChoice = kb.nextLine().toLowerCase();
			switch (userChoice) {
			case "1":
			case "52":
				keepGoing = false;
				break;
			case "2":
			case "104":
				blackJackDeck.addMoreDecks(2);
				keepGoing = false;
				break;
			case "3":
			case "156":
				blackJackDeck.addMoreDecks(3);
				keepGoing = false;
				break;
			case "4":
			case "208":
				blackJackDeck.addMoreDecks(4);
				keepGoing = false;
				break;
			case "5":
			case "260":
				blackJackDeck.addMoreDecks(5);
				keepGoing = false;
				break;
			case "6":
			case "quit":
				blackJackDeck = null;
				keepGoing = false;
				break;
			default:
				System.out.println("Please pick a number from the list");
			}
		}
		return blackJackDeck;
	}

	private void playerChooseNumberDecksMenu() {
		System.out.println("\n<===========================================>");
		System.out.println("|                            _____          |\n"
				+ "|                    _____  |K  WW|         |\n" + "|            _____  |Q  ww| | /\\{)|         |\n"
				+ "|     _____ |J  ww| | /\\{(| | \\/%%| _____   |\n"
				+ "|    |10 o || /\\{)| | \\/%%| |  %%%||A ^  |  |\n"
				+ "|    |o o o|| \\/% | |  %%%| |_%%%>|| / \\ |  |\n"
				+ "|    |o o o||   % | |_%%%O|        | \\ / |  |\n" + "|    |o o o||__%%[|                |  .  |  |\n"
				+ "|    |___0I|                       |____V|  |\n" + "|                                           |");
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
