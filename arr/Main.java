package com.jse.arr;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService(); //������         			    // 1.
		while(true) {
			System.out.println("0. Exit 1. Get 3 Cards 2. ���");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: System.out.println("ī�� 3�� �ޱ� ���, ����");
			for(int i=0; i<3; i++) {										// 5
		//		CardBean card = new CardBean(scanner.next(),scanner.nextInt());	// 3.
						
		//		service.add(card); 											//4.
				service.add(new CardBean(scanner.next(),
						scanner.nextInt())); //8.
			}
			break;
			
			case 2:
				CardBean[] cards = service.getCards();						//10.
				for(int i=0;i<3;i++) {										//11.
					System.out.println(String.format("ī���� %s ī����� %d",  //12
							cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			
			}
		}
	}
	
}


	
