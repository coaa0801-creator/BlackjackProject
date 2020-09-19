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
				playHand(player1, player2, player3, player4, player5, player6);
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
				playHand(player1, player2, player3, player4, player5, player6);
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
				playHand(player1, player2, player3, player4, player5, player6);
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
				playHand(player1, player2, player3, player4, player5, player6);
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
				playHand(player1, player2, player3, player4, player5, player6);
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
				playHand(player1, player2, player3, player4, player5, player6);
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

	private void playHand(boolean player1, boolean player2, boolean player3, boolean player4, boolean player5,
			boolean player6) {
//		System.out.println(blackJackDeck.checkDeckSize()); check card amount
		int startNumCards = blackJackDeck.checkDeckSize();
		blackJackDeck.shuffle();
		blackJackDeck.dealCard(); //burn card in BlackJack
		table1Dealer.dealStartHands(player1, player2, player3, player4, player5, player6);
		this.player1 = table1Dealer.getPlayer1();
		this.dealer = table1Dealer.getDealer();
		table.showCurrentTable(this.player1, this.player2, this.player3, this.player4, this.player5, this.player6,
				dealer);

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
