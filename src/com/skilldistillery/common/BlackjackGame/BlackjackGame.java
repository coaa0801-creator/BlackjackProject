package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackGame {
	private Deck blackJackDeck = new Deck();
	Scanner kb = new Scanner(System.in);
	private GamePlayTable table = new GamePlayTable();
	private BlackjackDealer table1Dealer = new BlackjackDealer(blackJackDeck);
	private BlackjackHand dealer;
	private BlackjackHand player1;
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
	private String dealerName = "    DEALER    ";
	private String player1Result = "  SEAT OPEN   ";
	private String player2Result = "  SEAT OPEN   ";
	private String player3Result = "  SEAT OPEN   ";
	private String player4Result = "  SEAT OPEN   ";
	private String player5Result = "  SEAT OPEN   ";
	private String player6Result = "  SEAT OPEN   ";

//                               = "BLACKJACK!!   "
	public String startGame() {
		String menu = "quit";
		playerChooseNumberDecks();
		boolean playGame = true;
		if (blackJackDeck == null) {
			playGame = false;
		}
		while (playGame) {
			menu = userChoosePlayerAmount();
			if (menu.equals("quit")) {
				playGame = false;
				break;
			}
			menu = playAgain();
			if (menu.equals("quit")) {
				playGame = false;
				break;
			}
			clearHands();
		}


		return menu;
	}

	private void clearHands() {
	player1.clearHand();
	dealer.clearHand();
	table1Dealer.clearHands();
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

	private String playAgain() {
		String choice = null;
		boolean keepGoing = true;
		while (keepGoing) {
			playAgainMenu();
			String userChoice = kb.nextLine().toLowerCase();
			switch (userChoice) {
			case "1":
			case "play": case "again": case "play again":
				keepGoing = false;
				choice = "play";
				break;
			case "2":
			case "quit":
				blackJackDeck = null;
				keepGoing = false;
				choice = "quit";
				break;
			default:
				System.out.println("Please pick a number from the list");
			}
		}
		return choice;

}

	private void playAgainMenu() {
		System.out.println("\n<===========================================>\n"
				+"|                                           |\n"
				+"|                                           |\n"
				+"|             WOULD YOU LIKE TO             |\n"
				+"|                PLAY AGAIN?                |\n"
				+"|                                           |\n"
				+"|               1: PLAY AGAIN               |\n"
				+"|            QUIT: QUIT GAME                |\n"
				+"|                                           |\n"
				+"|                                           |\n"
				+"<===========================================>");}
		
	

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
		blackJackDeck.dealCard(); // burn card in BlackJack
		table1Dealer.dealStartHands(player1, player2, player3, player4, player5, player6);
		this.player1 = table1Dealer.getPlayer1();
		this.dealer = table1Dealer.getDealer();
		int counter = 1;
		boolean keepPlaying = true;
		boolean dealerBlackjack = table1Dealer.checkBlackjack(this.dealer);

		while (keepPlaying) {
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (dealerBlackjack == true) {
				dealerNoShow = false;
				dealerHasBlackjack(player2, player3, player4, player5, player6);
				keepPlaying = false;
				table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
						this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
						player5Result, player6Result, dealerName);
				break;
			}
			
			
			this.player1 = gameMoves(this.player1, counter);
			counter++;
			if (this.player1 == null) {
				keepPlaying = false;
				break;
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (player2) {
				this.player2 = table1Dealer.getPlayer2();
				this.player2 = gameMoves(this.player2, counter);
				counter++;
				if (this.player2 == null) {
					keepPlaying = false;
					break;
				}
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (player3) {
				this.player3 = table1Dealer.getPlayer3();
				this.player3 = gameMoves(this.player3, counter);
				counter++;
				if (this.player3 == null) {
					keepPlaying = false;
					break;
				}
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (player4) {
				this.player4 = table1Dealer.getPlayer4();
				this.player4 = gameMoves(this.player4, counter);
				counter++;
				if (this.player4 == null) {
					keepPlaying = false;
					break;
				}
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (player5) {
				this.player5 = table1Dealer.getPlayer5();
				this.player5 = gameMoves(this.player5, counter);
				counter++;
				if (this.player5 == null) {
					keepPlaying = false;
					break;
				}
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			if (player6) {
				this.player6 = table1Dealer.getPlayer6();
				this.player6 = gameMoves(this.player6, counter);
				if (this.player6 == null) {
					keepPlaying = false;
					break;
				}
			}

			dealerNoShow = false;
		
			this.dealer = table1Dealer.Play(dealer);
			compareHands();
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			
			
			
			if (blackJackDeck.checkDeckSize() < 53) {
				while (blackJackDeck.checkDeckSize() != 0) {
					blackJackDeck.dealCard();
				}
				for (int i = 0; i < (startNumCards / 52);i++) {
					blackJackDeck.addMoreDecks((startNumCards/52) + 1);
					keepPlaying = false;
				}
			}
			
		}

	}

	private void dealerHasBlackjack(boolean player2, boolean player3, boolean player4, boolean player5, boolean player6) {
         if (player1.getHandValue() != 21) {
        	 player1Result = "YOU LOSE      ";
         }
		
		if (player2) {
			this.player2 = table1Dealer.getPlayer2();
			if (this.player2.getHandValue() != 21) {
				player2Result = "YOU LOSE      ";
			}
			
		}
		if (player3) {
			this.player3 = table1Dealer.getPlayer3();
			if (this.player3.getHandValue() != 21) {
				player3Result = "YOU LOSE      ";
			}
			
		}
		if (player4) {
			this.player4 = table1Dealer.getPlayer4();
			if (this.player4.getHandValue() != 21) {
				player4Result = "YOU LOSE      ";
			}
			
		}
		if (player5) {
			this.player5 = table1Dealer.getPlayer5();
			if (this.player5.getHandValue() != 21) {
				player5Result = "YOU LOSE      ";
			}
			
		}
		if (player6) {
			this.player6 = table1Dealer.getPlayer6();
			if (this.player6.getHandValue() != 21) {
				player6Result = "YOU LOSE      ";
			}
			
		}
	}

	private void compareHands() {
		int dealerHandValue = dealer.getHandValue();
		if (dealerHandValue > 21) {
			dealerHandValue = 0;
		}
		if (this.player1 != null) {
			int player1HandValue = player1.getHandValue();
			if (player1HandValue > 21) {
				player1HandValue = -1;
			}
			if (player1HandValue == -1) {
				player1Result = "BUSTED!       ";
			}
			else if (player1HandValue > dealerHandValue) {
				player1Result = "WINNER!!      ";
			} else if (player1HandValue < dealerHandValue) {
				player1Result = "YOU LOSE      ";
			} else {
				player1Result = "PUSH          ";
			}
		}
		if (this.player2 != null) {
			int player2HandValue = player2.getHandValue();
			if (player2HandValue > 21) {
				player2HandValue = -1;
			}
			if (player2HandValue == -1) {
				player2Result = "BUSTED!       ";
			}
			else if (player2HandValue > dealerHandValue) {
				player2Result = "WINNER!!      ";
			} else if (player2HandValue < dealerHandValue) {
				player2Result = "YOU LOSE      ";
			} else {
				player2Result = "PUSH          ";
			}
		}
		if (this.player3 != null) {
			int player3HandValue = player3.getHandValue();
			if (player3HandValue > 21) {
				player3HandValue = -1;
			}
			if (player3HandValue == -1) {
				player3Result = "BUSTED!       ";
			}
			else if (player3HandValue > dealerHandValue) {
				player3Result = "WINNER!!      ";
			} else if (player3HandValue < dealerHandValue) {
				player3Result = "YOU LOSE      ";
			} else {
				player3Result = "PUSH          ";
			}
		}
		if (this.player4 != null) {
			int player4HandValue = player4.getHandValue();
			if (player4HandValue > 21) {
				player4HandValue = -1;
			}
			if (player4HandValue == -1) {
				player4Result = "BUSTED!       ";
			}
			else if (player4HandValue > dealerHandValue) {
				player4Result = "WINNER!!      ";
			} else if (player4HandValue < dealerHandValue) {
				player4Result = "YOU LOSE      ";
			} else {
				player4Result = "PUSH          ";
			}
		}
		if (this.player5 != null) {
			int player5HandValue = player5.getHandValue();
			if (player5HandValue > 21) {
				player5HandValue = -1;
			}
			if (player5HandValue == -1) {
				player5Result = "BUSTED!       ";
			}
			else if (player5HandValue > dealerHandValue) {
				player5Result = "WINNER!!      ";
			} else if (player5HandValue < dealerHandValue) {
				player5Result = "YOU LOSE      ";
			} else {
				player5Result = "PUSH          ";
			}
		}
		if (this.player6 != null) {
			int player6HandValue = player6.getHandValue();
			if (player6HandValue > 21) {
				player6HandValue = -1;
			}
			if (player6HandValue == -1) {
				player6Result = "BUSTED!       ";
			}
			else if (player6HandValue > dealerHandValue) {
				player6Result = "WINNER!!      ";
			} else if (player6HandValue < dealerHandValue) {
				player6Result = "YOU LOSE      ";
			} else {
				player6Result = "PUSH          ";
			}
		}
	

	}

	private BlackjackHand gameMoves(BlackjackHand player, int counter) {

		BlackjackHand playerUp = player;
		if (counter == 1) {
			boolean playerTurn = true;
			if (user1.isBlackjack(this.player1)) {
				playerTurn = false;
				player1Result = "BLACKJACK!!   ";
			}
			while (this.player1.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user1.hitOrStay(this.player1);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player1);
						if (user1.handBusted(playerUp)) {
							playerTurn = false;
							player1Result = "BUSTED!       ";
							break;
						}

					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;

					}
				}
			}
		}

		else if (counter == 2) {
			boolean playerTurn = true;
			if (this.player2 != null) {
			if (user2.isBlackjack(this.player2)) {
				playerTurn = false;
				player2Result = "BLACKJACK!!   ";
			}
			while (this.player2.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user2.hitOrStay(this.player2);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player2);
						if (user2.handBusted(playerUp)) {
							playerTurn = false;
							player2Result = "BUSTED!       ";
							break;
						}
					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;
					}
					}
				}
			}
		}

		else if (counter == 3) {
			boolean playerTurn = true;
			if (this.player3 != null) {
			if (user3.isBlackjack(this.player3)) {
				playerTurn = false;
				player3Result = "BLACKJACK!!   ";
			}
			while (this.player3.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user3.hitOrStay(this.player3);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player3);
						if (user3.handBusted(playerUp)) {
							playerTurn = false;
							player3Result = "BUSTED!       ";
							break;
						}
					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;
					}
					}
				}
			}
		} else if (counter == 4) {
			boolean playerTurn = true;
			if (this.player4 != null) {
			if (user4.isBlackjack(this.player4)) {
				playerTurn = false;
				player4Result = "BLACKJACK!!   ";
			}
			while (this.player4.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user4.hitOrStay(this.player4);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player4);
						if (user4.handBusted(playerUp)) {
							playerTurn = false;
							player4Result = "BUSTED!       ";
							break;
						}
					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;
					}
					}
				}
			}
		}

		else if (counter == 5) {
			boolean playerTurn = true;
			if (this.player5 != null) {
			if (user5.isBlackjack(this.player5)) {
				playerTurn = false;
				player5Result = "BLACKJACK!!   ";
			}
			while (this.player5.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user5.hitOrStay(this.player5);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player5);
						if (user5.handBusted(playerUp)) {
							playerTurn = false;
							player5Result = "BUSTED!       ";
							break;
						}
					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;
					}
					}
				}
			}
		} else if (counter == 6) {
			boolean playerTurn = true;
			if (this.player5 != null) {
			if (user6.isBlackjack(this.player6)) {
				playerTurn = false;
				player5Result = "BLACKJACK!!   ";
			}
			while (this.player6.getHandValue() <= 21) {
			while (playerTurn) {
					String choice = user5.hitOrStay(this.player6);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(this.player6);
						if (user6.handBusted(playerUp)) {
							playerTurn = false;
							player6Result = "BUSTED!       ";
							break;
						}
					} else if (choice.equals("stay")) {
						playerTurn = false;
						break;
					} else if (choice.equals("quit")) {
						playerUp = null;
						break;
					}
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
