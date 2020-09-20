package com.skilldistillery.common.cards;

public enum Rank {
	TWO(2,"|2 ","_2"), THREE(3,"|3 ", "_3"), FOUR(4,"|4 ","_4"), FIVE(5,"|5 ", "_5"), SIX(6,"|6 ","_6"), SEVEN(7,"|7 ","_7"), EIGHT(8,"|8 ","_8"), NINE(9, "|9 ", "_9"), TEN(10,"|10","10" ), JACK(10, "|J ","_J"), QUEEN(10, "|Q ","_Q"), KING(10, "|K ", "_K"), ACE(11, "|A ", "_A");

private int value;
private String cardIdForTopLeft;
private String cardIdForBottomRight;

Rank (int value, String cardIdTop, String cardIdBottom){
	this.value = value;
	this.cardIdForTopLeft = cardIdTop;
	this.cardIdForBottomRight = cardIdBottom;
}

public String getCardIdForBottom() {
	return cardIdForBottomRight;
}

public int getValue() {
	return value;
}

public String getCardIdForTop() {
	return cardIdForTopLeft;
}


}