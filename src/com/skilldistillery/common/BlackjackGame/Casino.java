package com.skilldistillery.common.BlackjackGame;

public class Casino {

	public String runBlackjackGame() {
		BlackjackGame table1 = new BlackjackGame();
		String menu = table1.startGame();
		return menu;
		
	}

}
