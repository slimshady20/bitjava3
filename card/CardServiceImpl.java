package com.jse.card;

import com.jse.grade.Grade;

public class CardServiceImpl implements CardService {
	private Card[] cards;
	private int count;
	
	
	@Override
	public void add(Card card) {
		cards =new Card[3];
		count = 0;
	}

	@Override
	public Card[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card detail(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		
	}

}
