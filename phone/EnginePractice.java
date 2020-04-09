package com.jse.phone;
import java.util.Scanner;


public class EnginePractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie쓰고 컨트롤 스페이스 다쓰고 phoneService 복붙해서 lin16에 그대로 복사
		
		while(true) {System.out.println(" 0. 종료 1.입력 2. 출력");
		switch(scanner.nextInt()) {
		case 0: return;
		case 1: System.out.println("전화번호, 이름, 회사 입력"); 							// 4. syso 입력
			for(int i=0; i<3;i++) {															// 6. for문 입력
					
				service.add(new Phone(scanner.next(),scanner.next(),scanner.next()));  // 3. add phone 5. 이것을 3번해야하니까
			}
		break;
		case 2:
			Phone[] phones =service.getPhones();		// 12. 출력하기전에 당겨와야하니까 getPhones() 받아야하니까 
														// phone[] = getPhones(); 근데 service에 들어있으므로 servce.getPhones();
			
			for(int i=0;i<3;i++) {															// 11/.for() {} 입력
				System.out.println(String.format("전화번호: %s 이름: %s 회사: %s",				// 13. string.format
						phones[i].getPhoneNumber(), phones[i].getName(),phones[i].getCompany()));
				// 14. phones[i] 쓰고 하나니까 phones[i].getPhoneNumber()
			}
			break;
		}
		}
	}

}
