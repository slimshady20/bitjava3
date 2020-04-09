package com.jse.phone;
import java.util.Scanner;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class PhoneController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie쓰고 컨트롤 스페이스 다쓰고 phoneService 복붙해서 lin16에 그대로 복사
		
		String message="";
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0": return;
			case "1":										// 4. syso 입력
			
			for(int i=0;i<3;i++) {
			String[] values=JOptionPane.showInputDialog(Constants.PHONE_NEMU).split(",");	
			service.add(new Phone(values[0],values[1],values[2]));
			}
		break;
		case "2":
			Phone[] phones = service.getPhones();					// 12. 출력하기전에 당겨와야하니까 getPhones() 받아야하니까 						
			message = "";												// phone[] = getPhones(); 근데 service에 들어있으므로 servce.getPhones();
		//	String message="";						
			for(int i=0;i<3;i++) {																// 11/.for() {} 입력
				message += phones[i].toString()+ "\n";								// 13. string.format
						
				
																						// 14. phones[i] 쓰고 하나니까 phones[i].getPhoneNumber()
			}
			JOptionPane.showMessageDialog(null, message);
			break;
			case "3": 
				for(int i=0;i<3;i++) {
					String[] values2=JOptionPane.showInputDialog(Constants.CELLPHONE_NEMU).split(",");
					service.add(new CellPhone(values2[0],values2[1],values2[2],true));
				}
				break;
			case "4": 
				CellPhone[] cellPhones = service.getCellPhones();
				message = "";
				for(int i=0;i<3;i++) {
					message += cellPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for(int i=0;i<3;i++) {
					String[] values3=JOptionPane.showInputDialog(Constants.IPHONE_NEMU).split(",");
					service.add(new Iphone(values3[0],values3[1],values3[2],true,values3[3])); 
				}
				break;
				case "6" :
					Iphone[] iphones = service.getIphones();
					message = "";
					for(int i=0; i<3; i++) {
						message += iphones[i].toString()+"\n";
						
					}
					JOptionPane.showMessageDialog(null, message);
					break;
				case "7":
					for(int i=0;i<3;i++) {
						String[] values=JOptionPane.showInputDialog(Constants.GALAXY_NOTE_menu).split(",");
						service.add(new GalaxyNote(values[0],values[1],values[2],true,values[3],values[4])); 
					}
				break;
				case "8":
					GalaxyNote[] galaxyNotes =service.getGalaxyNotes();
					message = "";
					for(int i=0; i<3; i++) {
						message += galaxyNotes[i].toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, message);
				break;
		}
		}
	}

}
