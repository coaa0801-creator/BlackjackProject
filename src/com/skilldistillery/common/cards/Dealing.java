package com.skilldistillery.common.cards;

import java.util.Scanner;

public class Dealing {
	Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		Dealing deal = new Dealing();
		deal.dealCards();
	}

	private void dealCards() {
		Deck deckOne = new Deck();
		System.out.println(deckOne.checkDeckSize());
		deckOne.shuffle();
		  System.out.println("How many cards?");
		  try {
			int num = kb.nextInt();
			if(num > deckOne.checkDeckSize()) {
				System.out.println("Too many cards");
			} else {
				int value = 0;
				for(int i = 0; i < num; i++) {
					Card c = deckOne.dealCard();
					value = c.getValue();
					System.out.println(c);
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter a number.");
		}
	  }
	}
	
