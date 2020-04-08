package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie쓰고 컨트롤 스페이스 다쓰고 phoneService 복붙해서 lin16에 그대로 복사
	
		String message="";
		while(true) {
			switch(JOptionPane.showInputDialog(" 0. 종료 1.입력 2. 출력 3.휴대전화 입력 4. 휴대전화출력 5.구글 검색 6. 검색 결과 7,사이즈입력 8. 사이즈결과")) {
			case "0": return;
			case "1":										// 4. syso 입력
			
			for(int i=0;i<3;i++) {
			String[] values=JOptionPane.showInputDialog("Write number, Name Company").split(",");	
			service.add(new Phone(values[0],values[1],values[2]));
			}
		break;
		case "2":
			Phone[] phones =service.getPhones();					// 12. 출력하기전에 당겨와야하니까 getPhones() 받아야하니까 						
																	// phone[] = getPhones(); 근데 service에 들어있으므로 servce.getPhones();
		//	String message="";						
			for(int i=0;i<3;i++) {																// 11/.for() {} 입력
				message += String.format("출력: %s,%s,%s \n",								// 13. string.format
						phones[i].getPhoneNumber(), phones[i].getName(),phones[i].getCompany());
				
																						// 14. phones[i] 쓰고 하나니까 phones[i].getPhoneNumber()
			}
			JOptionPane.showMessageDialog(null, message);
			break;
			case "3": 
				for(int i=0;i<3;i++) {
					String[] values2=JOptionPane.showInputDialog("Write Number, Name, Comapany, portable").split(",");
					service.addCellPhone(new CellPhone(values2[0],values2[1],values2[2],true));
				}
				break;
			case "4": 
				CellPhone[] cellPhones = service.getCellPhones();
				
				for(int i=0;i<3;i++) {
					message += String.format("출력: %s,%s,%s,%s\n",
							cellPhones[i].getPhoneNumber(),
							cellPhones[i].getName(),
							cellPhones[i].getCompany(),
							cellPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for(int i=0;i<3;i++) {
					String[] values3=JOptionPane.showInputDialog("입력: Number, Name, Comapany, search").split(",");
					service.addIphone(new Iphone(values3[0],values3[1],values3[2],true,values3[3])); 
				}
				break;
				case "6" :
					Iphone[] iphones = service.getIphones();
					
					for(int i=0; i<3; i++) {
						message += String.format("출력: %s,%s,%s,%s,%s",
								iphones[i].getPhoneNumber(),
								iphones[i].getName(),
								iphones[i].getCompany(),
								iphones[i].getMove(),
								iphones[i].getSerach());
						
					}
					JOptionPane.showMessageDialog(null, message);
					break;
				case "7":
					for(int i=0;i<3;i++) {
						String[] values=JOptionPane.showInputDialog("입력: Number, Name, Comapany, search, size").split(",");
						service.addGalaxyNote(new GalaxyNote(values[0],values[1],values[2],true,values[3],values[4])); 
					}
				break;
				case "8":
					GalaxyNote[] galaxyNotes =service.getGalaxyNotes();
					
					for(int i=0; i<3; i++) {
						message += String.format("출력: %s,%s,%s,%s,%s",
								galaxyNotes[i].getPhoneNumber(),
								galaxyNotes[i].getName(),
								galaxyNotes[i].getCompany(),
								galaxyNotes[i].getMove(),
								galaxyNotes[i].getSerach());
					}
					JOptionPane.showMessageDialog(null, message);
				break;
		}
		}
	}

}
