package com.skilldistillery.common.BlackjackGame;

import java.util.Scanner;

public class CasinoApp {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		CasinoApp run = new CasinoApp();
		run.runCasino();

	}

	private void runCasino() {
		printWelcomeMenu();
		chooseGameSwitch();
		printGoodbye();
	}

	private void chooseGameSwitch() {
		boolean keepGoing = true;
		while (keepGoing) {
			String userChoice = kb.nextLine().toLowerCase();
			switch (userChoice) {
			case "1":
			case "blackjack":
				Casino mysticLake = new Casino();
				String menu = mysticLake.runBlackjackGame();
				if (menu.equals("main menu")) {
					printWelcomeMenu();
					break;
				}
				if (menu.equals("quit")) {
					keepGoing = false;
					break;
				}
				break;
			case "2":
			case "quit":
				keepGoing = false;
				break;
			default:
				System.out.println("Please choose a game from the list");
			}

		}

	}

	private void printGoodbye() {
		System.out.println("\n<===========================>");
		System.out.println("|       _____               |\n" + "|      |\\ ~ /|              |\n"
				+ "|      |}}:{{|              |\n" + "|      |}}:{{|  _____       |\n"
				+ "|      |}}:{{| |Joker|      |\n" + "|      |/_~_\\| |==%, |      |\n"
				+ "|              | \\/>\\|      |\n" + "|              | _>^^|      |\n"
				+ "|              |/_\\/_|      |");
		System.out.println("|                           |");
		System.out.println("|         GOODBYE           |");
		System.out.println("|   COME PLAY AGAIN SOON    |");
		System.out.println("|                           |");
		System.out.println("<===========================>");

	}

	private void printWelcomeMenu() {
		System.out.println("\n<==========================================>");
		System.out.println("|         _____                            |\n"
				+ "|        |A .  | _____                     |\n" + "|        | /.\\ ||A ^  | _____              |\n"
				+ "|        |(_._)|| / \\ ||A _  | _____       |\n" + "|        |  |  || \\ / || ( ) ||A_ _ |      |\n"
				+ "|        |____V||  .  ||(_'_)||( v )|      |\n" + "|               |____V||  |  || \\ / |      |\n"
				+ "|                      |____V||  .  |      |\n" + "|                             |____V|      |");
		System.out.println("|                                          |");
		System.out.println("|        CASINO GAMES EXTRAVAGANZA         |");
		System.out.println("|                                          |");
		System.out.println("|         CHOOSE YOUR GAME TO PLAY         |");
		System.out.println("|                                          |");
		System.out.println("|              1: BLACKJACK                |");
		System.out.println("|           QUIT: QUIT                     |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("<==========================================>");

	}
}
