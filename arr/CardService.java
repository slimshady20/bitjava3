package com.jse.arr;

public class CardService {
	private CardBean[] cards; // initiailize ������ go to line 6 and make cards=new CardBean[52];
	private int count;   			//6
	public CardService() {	
	 cards= new CardBean[3];   // Main���� 6��°���� ����
	 count=0;						//7.
	}
	public void setCards(CardBean[] cards) {
		this.cards=cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int getCount() {
		return count;
	}
	public void add(CardBean card) { 					// 2. 
		cards[count] = card;
		count++;						//9.
	}
}
