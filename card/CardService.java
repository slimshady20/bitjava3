package com.jse.card;

public class CardService {
	private Card[] cards; // initiailize ������ go to line 6 and make cards=new CardBean[52];
	private int count;   			//6
	public CardService() {	
	 cards= new Card[3];   // Main���� 6��°���� ����
	 count=0;						//7.
	}
	public void setCards(Card[] cards) {
		this.cards=cards;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int getCount() {
		return count;
	}
	public void add(Card card) { 					// 2. 
		cards[count] = card;
		count++;						//9.
	}
}
