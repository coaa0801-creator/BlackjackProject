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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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
				menu = playFullTableHand(player1, player2, player3, player4, player5, player6);
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

	private String playFullTableHand(boolean player1, boolean player2, boolean player3, boolean player4, boolean player5,
			boolean player6) {
		blackJackDeck.shuffle();
		blackJackDeck.dealCard(); // burn card in BlackJack
		table1Dealer.dealStartHands(player1, player2, player3, player4, player5, player6);
		this.dealer = table1Dealer.getDealer();
		this.player1 = table1Dealer.getPlayer1();
		if (player2) {
			this.player2 = table1Dealer.getPlayer2();
		}
		if (player3) {
			this.player3 = table1Dealer.getPlayer3();
		}
		if (player4) {
			this.player4 = table1Dealer.getPlayer4();
		}
		if (player5) {
			this.player5 = table1Dealer.getPlayer5();
		}
		if (player6) {
			this.player6 = table1Dealer.getPlayer6();
		}
		boolean dealerNoShow = true;
		int startNumCards = blackJackDeck.checkDeckSize();
		String quit = ""; 
		int counter = 1;
		boolean playOneHandNotComplete = true;
		
		
		
		
//		System.out.println(this.player2.getHand().toString());
//		System.out.println(blackJackDeck.checkDeckSize()); check card amount


		while (playOneHandNotComplete) {
			boolean dealerBlackjack = table1Dealer.checkBlackjack(this.dealer);
			if (dealerBlackjack == true) {
				dealerNoShow = false;
				dealerHasBlackjack(player2, player3, player4, player5, player6);
				playOneHandNotComplete = false;
				table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
						this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
						player5Result, player6Result, dealerName);
				break;
			}
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			
			
			
			this.player1 = gameMoves(this.player1, counter, user1);
			counter++;
			if (this.player1 == null) {
				quit = "quit";
				playOneHandNotComplete = false;
				break;
			}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			
			if (player2) {
				this.player2 = gameMoves(this.player2, counter, user2);
				counter++;
				if (this.player2 == null) {
					quit = "quit";
					playOneHandNotComplete = false;
					break;
				}

			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			}
			
			if (player3) {
				this.player3 = gameMoves(this.player3, counter, user3);
				counter++;
				if (this.player3 == null) {
					quit = "quit";
					playOneHandNotComplete = false;
					break;
				}
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			}
			
			if (player4) {
				this.player4 = gameMoves(this.player4, counter, user4);
				counter++;
				if (this.player4 == null) {
					quit = "quit";
					playOneHandNotComplete = false;
					break;
				}
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			}
			
			if (player5) {
				this.player5 = gameMoves(this.player5, counter, user5);
				counter++;
				if (this.player5 == null) {
					quit = "quit";
					playOneHandNotComplete = false;
					break;
				}
			table.showCurrentTable(startNumCards, this.player1, this.player2, this.player3, this.player4, this.player5,
					this.player6, dealer, dealerNoShow, player1Result, player2Result, player3Result, player4Result,
					player5Result, player6Result, dealerName);
			}
			
			if (player6) {
				this.player6 = gameMoves(this.player6, counter, user6);
				if (this.player6 == null) {
					quit = "quit";
					playOneHandNotComplete = false;
					break;
				}
			}

			dealerNoShow = false;
		
			this.dealer = table1Dealer.Play(dealer);
			if (this.dealer.getHandValue() > 21) {
				dealerName = "DEALER BUSTED!";
			}
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
					playOneHandNotComplete = false;
				}
			}
			playOneHandNotComplete = false;
		}
		return quit;

	}

	private void dealerHasBlackjack(boolean player2, boolean player3, boolean player4, boolean player5, boolean player6) {
        dealerName = "   BLACKJACK  "; 
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

	private BlackjackHand gameMoves(BlackjackHand playerUp, int counter, BlackjackPlayer user) {
		if (playerUp != null) {
			boolean playerTurn = true;
			while (playerTurn) {
			if (user.isBlackjack(playerUp)) {
				playerTurn = false;
				if (counter == 1) {
					player1Result = "BLACKJACK!!   ";
				}else if (counter == 2) {
				player2Result = "BLACKJACK!!   ";
				}else if (counter == 3) {
					player3Result = "BLACKJACK!!   ";
				}else if (counter == 4) {
					player4Result = "BLACKJACK!!   ";
				}else if (counter == 5) {
					player5Result = "BLACKJACK!!   ";
				}else if (counter == 6) {
				player5Result = "BLACKJACK!!   ";
			}}
			boolean noStayQuitOrHasBusted = true;
		    while (noStayQuitOrHasBusted) {
				if (playerUp.getHandValue() <= 21) {
					String choice = user.hitOrStay(playerUp,counter);
					if (choice.equals("hit")) {
						playerUp = table1Dealer.dealOneCard(playerUp);
						if (user.handBusted(playerUp)) {
							playerTurn = false;
							noStayQuitOrHasBusted = false;
							if (counter == 1) {
								player1Result = "BUSTED!       ";
							}else if (counter == 2) {
								player2Result = "BUSTED!       ";
							}else if (counter == 3) {
								player3Result = "BUSTED!       ";
							}else if (counter == 4) {
								player4Result = "BUSTED!       ";
							}else if (counter == 5) {
								player5Result = "BUSTED!       ";
							}else if (counter == 6) {
								player6Result = "BUSTED!       ";
							break;
							}
						}

					}if (choice.equals("stay")) {
						playerTurn = false;
						noStayQuitOrHasBusted = false;
						break;
					}if (choice.equals("quit")) {
						playerTurn = false;
						noStayQuitOrHasBusted = false;
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
