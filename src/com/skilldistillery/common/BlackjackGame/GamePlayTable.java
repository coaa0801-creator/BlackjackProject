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
	public void showCurrentTable(int numCardsinDeck, BlackjackHand player1, BlackjackHand player2, BlackjackHand player3,
			BlackjackHand player4, BlackjackHand player5, BlackjackHand player6, BlackjackHand dealer, boolean dealerNoShow, String player1Result, String player2Result, String player3Result, String player4Result, String player5Result, String player6Result) {
		seat1 = player1;
		seat2 = player2;
		seat3 = player3;
		seat4 = player4;
		seat5 = player5;
		seat6 = player6;
		this.dealer = dealer;
		seat1 = player1;
		
		String [] topOfCard = new String[numCardsinDeck];
		String [] cardNumUpLeft = new String[numCardsinDeck];
		String [] cardSuitMid = new String[numCardsinDeck];
		String [] cardNumBotRt = new String[numCardsinDeck];
		for (int player1Count = 0; player1Count < topOfCard.length ;player1Count++) {
			try {
					if(seat1.getHand().get(player1Count) != null){ 
					topOfCard[player1Count] = " ___ ";
					cardNumUpLeft[player1Count] = "|" + seat1.getHand().get(player1Count).getIdTop() + " |" ;
					cardSuitMid[player1Count] = "| " + seat1.getHand().get(player1Count).getSuit() + " |";
					cardNumBotRt[player1Count] = "|_" + seat1.getHand().get(player1Count).getIdBottom() + "|" ;
					}
			} catch (IndexOutOfBoundsException e) {
				topOfCard[player1Count] = "     ";
				cardNumUpLeft[player1Count] = "    ";
				cardSuitMid[player1Count] = "     ";
				cardNumBotRt[player1Count] = "     ";
				}}
		int dealerCount = 0;
			for(int a = 8; a < topOfCard.length; a++) {
				try {
					if (dealerNoShow && a == 8) {
						topOfCard[a] = " ___ ";
						cardNumUpLeft[a] = "|░░░|" ;
						cardSuitMid[a] = "|░░░|";
						cardNumBotRt[a] = "|░░░|" ;
						dealerCount++;
					}
					else if(this.dealer.getHand().get(dealerCount) != null){ 
				topOfCard[a] = " ___ ";
				cardNumUpLeft[a] = "|" + dealer.getHand().get(dealerCount).getIdTop() + " |" ;
				cardSuitMid[a] = "| " + dealer.getHand().get(dealerCount).getSuit() + " |";
				cardNumBotRt[a] = "|_" + dealer.getHand().get(dealerCount).getIdBottom() + "|" ;
					dealerCount++;
			}
		} catch (IndexOutOfBoundsException e) {
			topOfCard[a] = "     ";
			cardNumUpLeft[a] = "    ";
			cardSuitMid[a] = "     ";
			cardNumBotRt[a] = "     ";
			dealerCount++;
		}
			}	
			
		
		
		
		
		
		System.out.println(
				"\n<==========================================================================================================>\n"
						+ "|                                                                                                           |\n"
						+ "|                                                   DEALER                                                  |\n"
						+ "|    " + player6Result + "                                                                          " + player1Result + " |\n"
						+ "|                                        " + topOfCard[8] + " " + topOfCard[9] + " " + topOfCard[10] + " " + topOfCard[11] + "                    " + topOfCard[3] + " " + topOfCard[2] + " " + topOfCard[1] + " " + topOfCard[0] + " |\n" 
						+ "|                                        " + cardNumUpLeft[8] + " " + cardNumUpLeft[9] + " " + cardNumUpLeft[10] + " " + cardNumUpLeft[11] + "                        " + cardNumUpLeft[3] + " " + cardNumUpLeft[2] + " " + cardNumUpLeft[1] + " " + cardNumUpLeft[0] + " |\n"
						+ "|                                        " + cardSuitMid[8] + " " + cardSuitMid[9] + " " + cardSuitMid[10] + " " + cardSuitMid[11] + "                    " + cardSuitMid[3] + " " + cardSuitMid[2] + " " + cardSuitMid[1] + " " + cardSuitMid[0] + " |\n"
						+ "|                                        " + cardNumBotRt[8] + " " + cardNumBotRt[9] + " " + cardNumBotRt[10] + " " + cardNumBotRt[11] + "                    " + cardNumBotRt[3] + " " + cardNumBotRt[2] + " " + cardNumBotRt[1] + " " + cardNumBotRt[0] + " |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|    " + player5Result + "                                                                          " + player2Result + " |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|                          " + player4Result + "                               " + player3Result + "                      |\n"
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
