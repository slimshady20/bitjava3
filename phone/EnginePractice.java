package com.jse.phone;
import java.util.Scanner;


public class EnginePractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie���� ��Ʈ�� �����̽� �پ��� phoneService �����ؼ� lin16�� �״�� ����
		
		while(true) {System.out.println(" 0. ���� 1.�Է� 2. ���");
		switch(scanner.nextInt()) {
		case 0: return;
		case 1: System.out.println("��ȭ��ȣ, �̸�, ȸ�� �Է�"); 							// 4. syso �Է�
			for(int i=0; i<3;i++) {															// 6. for�� �Է�
					
				service.add(new Phone(scanner.next(),scanner.next(),scanner.next()));  // 3. add phone 5. �̰��� 3���ؾ��ϴϱ�
			}
		break;
		case 2:
			Phone[] phones =service.getPhones();		// 12. ����ϱ����� ��ܿ;��ϴϱ� getPhones() �޾ƾ��ϴϱ� 
														// phone[] = getPhones(); �ٵ� service�� ��������Ƿ� servce.getPhones();
			
			for(int i=0;i<3;i++) {															// 11/.for() {} �Է�
				System.out.println(String.format("��ȭ��ȣ: %s �̸�: %s ȸ��: %s",				// 13. string.format
						phones[i].getPhoneNumber(), phones[i].getName(),phones[i].getCompany()));
				// 14. phones[i] ���� �ϳ��ϱ� phones[i].getPhoneNumber()
			}
			break;
		}
		}
	}

}
