package com.jse.arr;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			CardService2 service = new CardService2(); //������         			    // 1.
			while(true) {
				System.out.println("0. Exit 1. Get 3 Cards 2. ���2");
				switch(scanner.nextInt()) {
				case 0: return;
				case 1: System.out.println("ī�� 3�� �ޱ� ���, ����");
				
				for(int i=0;i<3;i++) {
					
				service.add(new CardBean(scanner.next(),scanner.nextInt()));
				}
				break;
				case 2: 
					CardBean[] cards = service.getCards();
					for(int i=0; i<3; i++) {
						System.out.println(String.format("ī���� %s ī����� %d",
								cards[i].getKind(),cards[i].getNumber()));
						
					}
				break;
					
	   }
		}
	}
}

