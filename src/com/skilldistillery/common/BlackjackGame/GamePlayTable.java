package com.skilldistillery.common.BlackjackGame;

import java.util.List;

public class GamePlayTable {
	private BlackjackHand seat1;
	private BlackjackHand seat2;
	private BlackjackHand seat3;
	private BlackjackHand seat4;
	private BlackjackHand seat5;
	private BlackjackHand seat6;
	private BlackjackHand dealer;

	public GamePlayTable() {

	}

	public void showCurrentTable(BlackjackHand player1, BlackjackHand player2, BlackjackHand player3,
			BlackjackHand player4, BlackjackHand player5, BlackjackHand player6, BlackjackHand dealer) {
		System.out.println("\n<==========================================================================================================>\n" +
						     "|                                                                                                           |\n" +
						     "|                                               DEALER                                                      |\n" +
						     "|      SEAT 6                                                                                  SEAT 1       |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|      SEAT 5                                                                                  SEAT 2       |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
						     "|                            SEAT 4                                    SEAT 3                               |\n" +
						     "|                                                                                                           |\n" +
						     "|                                                                                                           |\n" +
							 "<===========================================================================================================>");

	}

}
