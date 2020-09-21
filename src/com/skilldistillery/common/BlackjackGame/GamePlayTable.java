package com.skilldistillery.common.BlackjackGame;

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
		
		String [] topOfCard = new String[(numCardsinDeck + 4)];
		String [] cardNumUpLeft = new String[(numCardsinDeck + 4)];
		String [] cardSuitMid = new String[(numCardsinDeck + 4)];
		String [] cardNumBotRt = new String[(numCardsinDeck + 4)];
		for (int player1Count = 0; player1Count < topOfCard.length ;player1Count++) {
			if(seat1 != null){ 
			try {	
					topOfCard[player1Count] = " ___ ";
					cardNumUpLeft[player1Count] = seat1.getHand().get(player1Count).getIdTop() + " |" ;
					cardSuitMid[player1Count] = "| " + seat1.getHand().get(player1Count).getSuit() + " |";
					cardNumBotRt[player1Count] = "|_" + seat1.getHand().get(player1Count).getIdBottom() + "|" ;
			} catch (IndexOutOfBoundsException e) {
				topOfCard[player1Count] = "     ";
				cardNumUpLeft[player1Count] = "     ";
				cardSuitMid[player1Count] = "     ";
				cardNumBotRt[player1Count] = "     ";
				}}
		}
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
			if(seat3 != null){ 
				int player3Count = 0;
				for(int c = 24; c < topOfCard.length; c++) {
					try {
						topOfCard[c] = " ___ ";
						cardNumUpLeft[c] =  player3.getHand().get(player3Count).getIdTop() + " |" ;
						cardSuitMid[c] = "| " + player3.getHand().get(player3Count).getSuit() + " |";
						cardNumBotRt[c] = "|_" + player3.getHand().get(player3Count).getIdBottom() + "|" ;
						player3Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[c] = "     ";
						cardNumUpLeft[c] = "     ";
						cardSuitMid[c] = "     ";
						cardNumBotRt[c] = "     ";
						player3Count++;
					}
				}
			}	
			if(seat4 != null){ 
				int player4Count = 0;
				for(int d = 32; d < topOfCard.length; d++) {
					try {
						topOfCard[d] = " ___ ";
						cardNumUpLeft[d] =  player4.getHand().get(player4Count).getIdTop() + " |" ;
						cardSuitMid[d] = "| " + player4.getHand().get(player4Count).getSuit() + " |";
						cardNumBotRt[d] = "|_" + player4.getHand().get(player4Count).getIdBottom() + "|" ;
						player4Count++; 
					} catch (IndexOutOfBoundsException e) {
						topOfCard[d] = "     ";
						cardNumUpLeft[d] = "     ";
						cardSuitMid[d] = "     ";
						cardNumBotRt[d] = "     ";
						player4Count++;
					}
				}
			}	
			if(seat5 != null){ 
				int player5Count = 0;
				for(int g = 40; g < topOfCard.length; g++) {
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
				for(int f = 48; f < topOfCard.length; f++) {
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
						+ "| " + topOfCard[48] + " " + topOfCard[49] + " " + topOfCard[50] + " " + topOfCard[51] + "                " + cardNumUpLeft[8] + " " + cardNumUpLeft[9] + " " + cardNumUpLeft[10] + " " + cardNumUpLeft[11] + "                    " + cardNumUpLeft[3] + " " + cardNumUpLeft[2] + " " + cardNumUpLeft[1] + " " + cardNumUpLeft[0] + " |\n"
						+ "| " + cardNumUpLeft[48] + " " + cardNumUpLeft[49] + " " + cardNumUpLeft[50] + " " + cardNumUpLeft[51] + "                " + cardSuitMid[8] + " " + cardSuitMid[9] + " " + cardSuitMid[10] + " " + cardSuitMid[11] + "                    " + cardSuitMid[3] + " " + cardSuitMid[2] + " " + cardSuitMid[1] + " " + cardSuitMid[0] + " |\n"
						+ "| " + cardSuitMid[48] + " " + cardSuitMid[49] + " " + cardSuitMid[50] + " " + cardSuitMid[51] + "                " + cardNumBotRt[8] + " " + cardNumBotRt[9] + " " + cardNumBotRt[10] + " " + cardNumBotRt[11] + "                    " + cardNumBotRt[3] + " " + cardNumBotRt[2] + " " + cardNumBotRt[1] + " " + cardNumBotRt[0] + " |\n"
						+ "| " + cardNumBotRt[48] + " " + cardNumBotRt[49] + " " + cardNumBotRt[50] + " " + cardNumBotRt[51] + "                                                                                   |\n"
						+ "|                                        " + topOfCard[12] + " " + topOfCard[13] + " " + topOfCard[14] + " " + topOfCard[15] + "                    " + topOfCard[7] + " " + topOfCard[6] + " " + topOfCard[5] + " " + topOfCard[4] + " |\n" 
						+ "| " + topOfCard[52] + " " + topOfCard[53] + " " + topOfCard[54] + " " + topOfCard[55] + "                " + cardNumUpLeft[12] + " " + cardNumUpLeft[13] + " " + cardNumUpLeft[14] + " " + cardNumUpLeft[15] + "                    " + cardNumUpLeft[7] + " " + cardNumUpLeft[6] + " " + cardNumUpLeft[5] + " " + cardNumUpLeft[4] + " |\n"
						+ "| " + cardNumUpLeft[52] + " " + cardNumUpLeft[53] + " " + cardNumUpLeft[54] + " " + cardNumUpLeft[55] + "                " + cardSuitMid[12] + " " + cardSuitMid[13] + " " + cardSuitMid[14] + " " + cardSuitMid[15] + "                    " + cardSuitMid[7] + " " + cardSuitMid[6] + " " + cardSuitMid[5] + " " + cardSuitMid[4] + " |\n"
						+ "| " + cardSuitMid[52] + " " + cardSuitMid[53] + " " + cardSuitMid[54] + " " + cardSuitMid[55] + "                " + cardNumBotRt[12] + " " + cardNumBotRt[13] + " " + cardNumBotRt[14] + " " + cardNumBotRt[15] + "                    " + cardNumBotRt[7] + " " + cardNumBotRt[6] + " " + cardNumBotRt[5] + " " + cardNumBotRt[4] + " |\n"
						+ "| " + cardNumBotRt[52] + " " + cardNumBotRt[53] + " " + cardNumBotRt[54] + " " + cardNumBotRt[55] + "                                                                                   |\n"
						+ "|                                                                                                           |\n"
						+ "|                                                                                                           |\n"
						+ "|    " + player5Result + "                                                                          " + player2Result + " |\n"
						+ "| " + topOfCard[40] + " " + topOfCard[41] + " " + topOfCard[42] + " " + topOfCard[43] + "                                                                                   |\n"
						+ "| " + cardNumUpLeft[40] + " " + cardNumUpLeft[41] + " " + cardNumUpLeft[42] + " " + cardNumUpLeft[43] + "                                                           " + topOfCard[19] + " " + topOfCard[18] + " " + topOfCard[17] + " " + topOfCard[16] + " |\n"
						+ "| " + cardSuitMid[40] + " " + cardSuitMid[41] + " " + cardSuitMid[42] + " " + cardSuitMid[43] + "      " + player4Result + "                   " + player3Result + "      " + cardNumUpLeft[19] + " " + cardNumUpLeft[18] + " " + cardNumUpLeft[17] + " " + cardNumUpLeft[16] + " |\n"
						+ "| " + cardNumBotRt[40] + " " + cardNumBotRt[41] + " " + cardNumBotRt[42] + " " + cardNumBotRt[43] + "                                                           " + cardSuitMid[19] + " " + cardSuitMid[18] + " " + cardSuitMid[17] + " " + cardSuitMid[16] + " |\n"
						+ "|                            " + topOfCard[32] + " " + topOfCard[33] + " " + topOfCard[34] + " " + topOfCard[35] + "        " + topOfCard[24] + " " + topOfCard[25] + " " + topOfCard[26] + " " + topOfCard[27] + " " + cardNumBotRt[19] + " " + cardNumBotRt[18] + " " + cardNumBotRt[17] + " " + cardNumBotRt[16] + " |\n"
						+ "| " + topOfCard[44] + " " + topOfCard[45] + " " + topOfCard[46] + " " + topOfCard[47] + "    " + cardNumUpLeft[32] + " " + cardNumUpLeft[33] + " " + cardNumUpLeft[34] + " " + cardNumUpLeft[35] + "        " + cardNumUpLeft[24] + " " + cardNumUpLeft[25] + " " + cardNumUpLeft[26] + " " + cardNumUpLeft[27] + "                         |\n"
						+ "| " + cardNumUpLeft[44] + " " + cardNumUpLeft[45] + " " + cardNumUpLeft[46] + " " + cardNumUpLeft[47] + "    " + cardSuitMid[32] + " " + cardSuitMid[33] + " " + cardSuitMid[34] + " " + cardSuitMid[35] + "        " + cardSuitMid[24] + " " + cardSuitMid[25] + " " + cardSuitMid[26] + " " + cardSuitMid[27] + " " + topOfCard[23] + " " + topOfCard[22] + " " + topOfCard[21] + " " + topOfCard[20] + " |\n"
						+ "| " + cardSuitMid[44] + " " + cardSuitMid[45] + " " + cardSuitMid[46] + " " + cardSuitMid[47] + "    " + cardNumBotRt[32] + " " + cardNumBotRt[33] + " " + cardNumBotRt[34] + " " + cardNumBotRt[35] + "        " + cardNumBotRt[24] + " " + cardNumBotRt[25] + " " + cardNumBotRt[26] + " " + cardNumBotRt[27] + " " + cardNumUpLeft[23] + " " + cardNumUpLeft[22] + " " + cardNumUpLeft[21] + " " + cardNumUpLeft[20] + " |\n"
						+ "| " + cardNumBotRt[44] + " " + cardNumBotRt[45] + " " + cardNumBotRt[46] + " " + cardNumBotRt[47] + "                                                           " + cardSuitMid[23] + " " + cardSuitMid[22] + " " + cardSuitMid[21] + " " + cardSuitMid[20] + " |\n"
						+ "|                            " + topOfCard[36] + " " + topOfCard[37] + " " + topOfCard[38] + " " + topOfCard[39] + "        " + topOfCard[28] + " " + topOfCard[29] + " " + topOfCard[30] + " " + topOfCard[31] + " " + cardNumBotRt[23] + " " + cardNumBotRt[22] + " " + cardNumBotRt[21] + " " + cardNumBotRt[20] + " |\n"
						+ "|                            " + cardNumUpLeft[36] + " " + cardNumUpLeft[37] + " " + cardNumUpLeft[38] + " " + cardNumUpLeft[39] + "        " + cardNumUpLeft[28] + " " + cardNumUpLeft[29] + " " + cardNumUpLeft[30] + " " + cardNumUpLeft[31] + "                         |\n"
						+ "|                            " + cardSuitMid[36] + " " + cardSuitMid[37] + " " + cardSuitMid[38] + " " + cardSuitMid[39] + "        " + cardSuitMid[28] + " " + cardSuitMid[29] + " " + cardSuitMid[30] + " " + cardSuitMid[31] + "                         |\n"
						+ "|                            " + cardNumBotRt[36] + " " + cardNumBotRt[37] + " " + cardNumBotRt[38] + " " + cardNumBotRt[39] + "        " + cardNumBotRt[28] + " " + cardNumBotRt[29] + " " + cardNumBotRt[30] + " " + cardNumBotRt[31] + "                         |\n"
						+ "|                                                                                                           |\n"
						+ "<===========================================================================================================>");

	}

}
