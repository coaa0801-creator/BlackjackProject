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

	// _______ ___
	// |4 | |4 |
	// | | | ♥ |
	// | ♥ |__4|
	public void showCurrentTable(BlackjackHand player1, BlackjackHand player2, BlackjackHand player3,
			BlackjackHand player4, BlackjackHand player5, BlackjackHand player6, BlackjackHand dealer) {
		seat1 = player1;
		seat2 = player2;
		seat3 = player3;
		seat4 = player4;
		seat5 = player5;
		seat6 = player6;
		this.dealer = dealer;
		seat1 = player1;
		
		String [] topOfCard = new String[72];
		String [] cardNumUpLeft = new String[72];
		String [] cardSuitMid = new String[72];
		String [] cardNumBotRt = new String[72];
		for (int i = 0; i < topOfCard.length ;i++) {
//			System.out.println(seat1.getHand().get(i));
			try {
				if(seat1.getHand().get(i) != null){ 
					topOfCard[i] = " ___ ";
					cardNumUpLeft[i] = "|" + seat1.getHand().get(i).getIdTop() + " |" ;
					cardSuitMid[i] = "| " + seat1.getHand().get(i).getSuit() + " |";
					cardNumBotRt[i] = "|_" + seat1.getHand().get(i).getIdBottom() + "|" ;
				}
				
			
			
			
			
			
			
			
			
			
			
			} catch (IndexOutOfBoundsException e) {
				topOfCard[i] = "     ";
				cardNumUpLeft[i] = "    ";
				cardSuitMid[i] = "     ";
				cardNumBotRt[i] = "     ";
				}
				}
		
		
		
		
		
		System.out.println(
				"\n<==========================================================================================================>\n"
						+ "|                                                                                                           |\n"
						+ "|                                                   DEALER                                                  |\n"
						+ "|      SEAT 6                                                                                  SEAT 1       |\n"
						+ "|                                                                                   " + topOfCard[3] + " " + topOfCard[2] + " " + topOfCard[1] + " " + topOfCard[0] + " |\n" 
						+ "|                                                                                     " + cardNumUpLeft[3] + " " + cardNumUpLeft[2] + " " + cardNumUpLeft[1] + " " + cardNumUpLeft[0] + " |\n"
						+ "|                                                                                   " + cardSuitMid[3] + " " + cardSuitMid[2] + " " + cardSuitMid[1] + " " + cardSuitMid[0] + " |\n"
						+ "|                                                                                   " + cardNumBotRt[3] + " " + cardNumBotRt[2] + " " + cardNumBotRt[1] + " " + cardNumBotRt[0] + " |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|      SEAT 5                                                                                  SEAT 2       |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                            SEAT 4                                    SEAT 3                               |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "<===========================================================================================================>");

	}

}
