package com.jse.arr;

public class CardService2 {
	private CardBean[] cards;
	public CardService2() {
	cards= new CardBean[3];
	}
	public void setCards(CardBean[] cards) {
		this.cards= cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	
}

