package com.jse.card;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jse.util.Constants;
public class CardController {
	public static void main(String[] args) {
	//	Scanner scanner = new Scanner(System.in);
		CardService service = new CardServiceImpl();		//CardService Ÿ�� Ŭ������x Ŭ������ CardController �̴�.
		Card card= null;			//Card �� Ÿ��
		
		while(true) {
			
			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0": return;
			case "1":   
			for(int i=0;i < 3;i++) {		//for �� statement
				String[] values= JOptionPane.showInputDialog(Constants.CARD_INPUT).split(",");
				card =new Card();
				card.setKind(values[0]);
				card.setNumber(Integer.parseInt(values[1]));
				service.add(card);
			}
			break;
			case "2": 
				JOptionPane.showMessageDialog(null,service.list());	// service �ν��Ͻ����� getcards() �ν��Ͻ��żҵ�
			//	Card[] cards = service.getCards();
				break;
			}
			
		}
	}
}