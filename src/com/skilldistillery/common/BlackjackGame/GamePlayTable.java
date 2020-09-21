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
			BlackjackHand player4, BlackjackHand player5, BlackjackHand player6, BlackjackHand dealer, boolean dealerNoShow, String player1Result, String player2Result, String player3Result, String player4Result, String player5Result, String player6Result, String dealerName) {
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
					cardNumUpLeft[player1Count] = seat1.getHand().get(player1Count).getIdTop() + " |" ;
					cardSuitMid[player1Count] = "| " + seat1.getHand().get(player1Count).getSuit() + " |";
					cardNumBotRt[player1Count] = "|_" + seat1.getHand().get(player1Count).getIdBottom() + "|" ;
					}
			} catch (IndexOutOfBoundsException e) {
				topOfCard[player1Count] = "     ";
				cardNumUpLeft[player1Count] = "     ";
				cardSuitMid[player1Count] = "     ";
				cardNumBotRt[player1Count] = "     ";
				}}
		int dealerCount = 0;
			for(int a = 8; a < topOfCard.length; a++) {
				try {
					if (dealerNoShow && a == 8) {
						topOfCard[a] = " ___ ";
						cardNumUpLeft[a] = "|░░░|";
						cardSuitMid[a] = "|░░░|";
						cardNumBotRt[a] = "|░░░|" ;
						dealerCount++;
					}
					else if(this.dealer.getHand().get(dealerCount) != null){ 
				topOfCard[a] = " ___ ";
				cardNumUpLeft[a] =  dealer.getHand().get(dealerCount).getIdTop() + " |" ;
				cardSuitMid[a] = "| " + dealer.getHand().get(dealerCount).getSuit() + " |";
				cardNumBotRt[a] = "|_" + dealer.getHand().get(dealerCount).getIdBottom() + "|" ;
					dealerCount++;
			}
		} catch (IndexOutOfBoundsException e) {
			topOfCard[a] = "     ";
			cardNumUpLeft[a] = "     ";
			cardSuitMid[a] = "     ";
			cardNumBotRt[a] = "     ";
			dealerCount++;
		}
			}	
			if(seat2 != null){ 
			int player2Count = 0;
			for(int b = 16; b < topOfCard.length; b++) {
				try {
						topOfCard[b] = " ___ ";
						cardNumUpLeft[b] =  player2.getHand().get(player2Count).getIdTop() + " |" ;
						cardSuitMid[b] = "| " + player2.getHand().get(player2Count).getSuit() + " |";
						cardNumBotRt[b] = "|_" + player2.getHand().get(player2Count).getIdBottom() + "|" ;
						player2Count++; 
				} catch (IndexOutOfBoundsException e) {
					topOfCard[b] = "     ";
					cardNumUpLeft[b] = "     ";
					cardSuitMid[b] = "     ";
					cardNumBotRt[b] = "     ";
					player2Count++;
				}
				}
			}	
			if(seat2 != null){ 
				int player2Count = 0;
				for(int b = 16; b < topOfCard.length; b++) {
					try {
						topOfCard[b] = " ___ ";
						cardNumUpLeft[b] =  player2.getHand().get(player2Count).getIdTop() + " |" ;
						cardSuitMid[b] = "| " + player2.getHand().get(player2Count).getSuit() + " |";
						cardNumBotRt[b] = "|_" + player2.getHand().get(player2Count).getIdBottom() + "|" ;
						player2Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[b] = "     ";
						cardNumUpLeft[b] = "     ";
						cardSuitMid[b] = "     ";
						cardNumBotRt[b] = "     ";
						player2Count++;
					}
				}
			}	
			if(seat2 != null){ 
				int player2Count = 0;
				for(int b = 16; b < topOfCard.length; b++) {
					try {
						topOfCard[b] = " ___ ";
						cardNumUpLeft[b] =  player2.getHand().get(player2Count).getIdTop() + " |" ;
						cardSuitMid[b] = "| " + player2.getHand().get(player2Count).getSuit() + " |";
						cardNumBotRt[b] = "|_" + player2.getHand().get(player2Count).getIdBottom() + "|" ;
						player2Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[b] = "     ";
						cardNumUpLeft[b] = "     ";
						cardSuitMid[b] = "     ";
						cardNumBotRt[b] = "     ";
						player2Count++;
					}
				}
			}	
			if(seat5 != null){ 
				int player5Count = 0;
				for(int g = 56; g < topOfCard.length; g++) {
					try {
						topOfCard[g] = " ___ ";
						cardNumUpLeft[g] =  player5.getHand().get(player5Count).getIdTop() + " |" ;
						cardSuitMid[g] = "| " + player5.getHand().get(player5Count).getSuit() + " |";
						cardNumBotRt[g] = "|_" + player5.getHand().get(player5Count).getIdBottom() + "|" ;
						player5Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[g] = "     ";
						cardNumUpLeft[g] = "     ";
						cardSuitMid[g] = "     ";
						cardNumBotRt[g] = "     ";
						player5Count++;
					}
				}
			}	
			if(seat6 != null){ 
				int player6Count = 0;
				for(int f = 64; f < topOfCard.length; f++) {
					try {
						topOfCard[f] = " ___ ";
						cardNumUpLeft[f] =  player6.getHand().get(player6Count).getIdTop() + " |" ;
						cardSuitMid[f] = "| " + player6.getHand().get(player6Count).getSuit() + " |";
						cardNumBotRt[f] = "|_" + player6.getHand().get(player6Count).getIdBottom() + "|" ;
						player6Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[f] = "     ";
						cardNumUpLeft[f] = "     ";
						cardSuitMid[f] = "     ";
						cardNumBotRt[f] = "     ";
						player6Count++;
					}
				}
			}	
			
		
		
		
		
		
		System.out.println(
				"\n<==========================================================================================================>\n"
						+ "|                                                                                                           |\n"
						+ "|                                             " + dealerName + "                                                |\n"
						+ "|    " + player6Result + "                                                                          " + player1Result + " |\n"
						+ "|                                        " + topOfCard[8] + " " + topOfCard[9] + " " + topOfCard[10] + " " + topOfCard[11] + "                    " + topOfCard[3] + " " + topOfCard[2] + " " + topOfCard[1] + " " + topOfCard[0] + " |\n" 
						+ "| " + topOfCard[64] + " " + topOfCard[65] + " " + topOfCard[66] + " " + topOfCard[67] + "                " + cardNumUpLeft[8] + " " + cardNumUpLeft[9] + " " + cardNumUpLeft[10] + " " + cardNumUpLeft[11] + "                    " + cardNumUpLeft[3] + " " + cardNumUpLeft[2] + " " + cardNumUpLeft[1] + " " + cardNumUpLeft[0] + " |\n"
						+ "| " + cardNumUpLeft[64] + " " + cardNumUpLeft[65] + " " + cardNumUpLeft[66] + " " + cardNumUpLeft[67] + "                " + cardSuitMid[8] + " " + cardSuitMid[9] + " " + cardSuitMid[10] + " " + cardSuitMid[11] + "                    " + cardSuitMid[3] + " " + cardSuitMid[2] + " " + cardSuitMid[1] + " " + cardSuitMid[0] + " |\n"
						+ "| " + cardSuitMid[64] + " " + cardSuitMid[65] + " " + cardSuitMid[66] + " " + cardSuitMid[67] + "                " + cardNumBotRt[8] + " " + cardNumBotRt[9] + " " + cardNumBotRt[10] + " " + cardNumBotRt[11] + "                    " + cardNumBotRt[3] + " " + cardNumBotRt[2] + " " + cardNumBotRt[1] + " " + cardNumBotRt[0] + " |\n"
						+ "| " + cardNumBotRt[64] + " " + cardNumBotRt[65] + " " + cardNumBotRt[66] + " " + cardNumBotRt[67] + "                                                                                   |\n"
						+ "|                                                                                   " + topOfCard[7] + " " + topOfCard[6] + " " + topOfCard[5] + " " + topOfCard[4] + " |\n"
						+ "| " + topOfCard[68] + " " + topOfCard[69] + " " + topOfCard[70] + " " + topOfCard[71] + "                                                           " + cardNumUpLeft[7] + " " + cardNumUpLeft[6] + " " + cardNumUpLeft[5] + " " + cardNumUpLeft[4] + " |\n"
						+ "| " + cardNumUpLeft[68] + " " + cardNumUpLeft[69] + " " + cardNumUpLeft[70] + " " + cardNumUpLeft[71] + "                                                           " + cardSuitMid[7] + " " + cardSuitMid[6] + " " + cardSuitMid[5] + " " + cardSuitMid[4] + " |\n"
						+ "| " + cardSuitMid[68] + " " + cardSuitMid[69] + " " + cardSuitMid[70] + " " + cardSuitMid[71] + "                                                           " + cardNumBotRt[7] + " " + cardNumBotRt[6] + " " + cardNumBotRt[5] + " " + cardNumBotRt[4] + " |\n"
						+ "| " + cardNumBotRt[68] + " " + cardNumBotRt[69] + " " + cardNumBotRt[70] + " " + cardNumBotRt[71] + "                                                                                   |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|    " + player5Result + "                                                                          " + player2Result + " |\n"
						+ "| " + topOfCard[56] + " " + topOfCard[57] + " " + topOfCard[58] + " " + topOfCard[59] + "                                                                                   |\n"
						+ "| " + cardNumUpLeft[56] + " " + cardNumUpLeft[57] + " " + cardNumUpLeft[58] + " " + cardNumUpLeft[59] + "                                                           " + topOfCard[19] + " " + topOfCard[18] + " " + topOfCard[17] + " " + topOfCard[16] + " |\n"
						+ "| " + cardSuitMid[56] + " " + cardSuitMid[57] + " " + cardSuitMid[58] + " " + cardSuitMid[59] + "      " + player4Result + "                   " + player3Result + "      " + cardNumUpLeft[19] + " " + cardNumUpLeft[18] + " " + cardNumUpLeft[17] + " " + cardNumUpLeft[16] + " |\n"
						+ "| " + cardNumBotRt[56] + " " + cardNumBotRt[57] + " " + cardNumBotRt[58] + " " + cardNumBotRt[59] + "                                                           " + cardSuitMid[19] + " " + cardSuitMid[18] + " " + cardSuitMid[17] + " " + cardSuitMid[16] + " |\n"
						+ "|                                                                                   " + cardNumBotRt[19] + " " + cardNumBotRt[18] + " " + cardNumBotRt[17] + " " + cardNumBotRt[16] + " |\n"
						+ "| " + topOfCard[60] + " " + topOfCard[61] + " " + topOfCard[62] + " " + topOfCard[63] + "                                                                                   |\n"
						+ "| " + cardNumUpLeft[60] + " " + cardNumUpLeft[61] + " " + cardNumUpLeft[62] + " " + cardNumUpLeft[63] + "                                                           " + topOfCard[23] + " " + topOfCard[22] + " " + topOfCard[21] + " " + topOfCard[20] + " |\n"
						+ "| " + cardSuitMid[60] + " " + cardSuitMid[61] + " " + cardSuitMid[62] + " " + cardSuitMid[63] + "                                                           " + cardNumUpLeft[23] + " " + cardNumUpLeft[22] + " " + cardNumUpLeft[21] + " " + cardNumUpLeft[20] + " |\n"
						+ "| " + cardNumBotRt[60] + " " + cardNumBotRt[61] + " " + cardNumBotRt[62] + " " + cardNumBotRt[63] + "                                                           " + cardSuitMid[23] + " " + cardSuitMid[22] + " " + cardSuitMid[21] + " " + cardSuitMid[20] + " |\n"
						+ "|                                                                                   " + cardNumBotRt[23] + " " + cardNumBotRt[22] + " " + cardNumBotRt[21] + " " + cardNumBotRt[20] + " |\n"
						+ "<===========================================================================================================>");

	}

}
