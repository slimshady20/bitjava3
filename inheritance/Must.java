package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie���� ��Ʈ�� �����̽� �پ��� phoneService �����ؼ� lin16�� �״�� ����
	
		String message="";
		while(true) {
			switch(JOptionPane.showInputDialog(" 0. ���� 1.�Է� 2. ��� 3.�޴���ȭ �Է� 4. �޴���ȭ��� 5.���� �˻� 6. �˻� ��� 7,�������Է� 8. ��������")) {
			case "0": return;
			case "1":										// 4. syso �Է�
			
			for(int i=0;i<3;i++) {
			String[] values=JOptionPane.showInputDialog("Write number, Name Company").split(",");	
			service.add(new Phone(values[0],values[1],values[2]));
			}
		break;
		case "2":
			Phone[] phones =service.getPhones();					// 12. ����ϱ����� ��ܿ;��ϴϱ� getPhones() �޾ƾ��ϴϱ� 						
																	// phone[] = getPhones(); �ٵ� service�� ��������Ƿ� servce.getPhones();
		//	String message="";						
			for(int i=0;i<3;i++) {																// 11/.for() {} �Է�
				message += String.format("���: %s,%s,%s \n",								// 13. string.format
						phones[i].getPhoneNumber(), phones[i].getName(),phones[i].getCompany());
				
																						// 14. phones[i] ���� �ϳ��ϱ� phones[i].getPhoneNumber()
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
					message += String.format("���: %s,%s,%s,%s\n",
							cellPhones[i].getPhoneNumber(),
							cellPhones[i].getName(),
							cellPhones[i].getCompany(),
							cellPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for(int i=0;i<3;i++) {
					String[] values3=JOptionPane.showInputDialog("�Է�: Number, Name, Comapany, search").split(",");
					service.addIphone(new Iphone(values3[0],values3[1],values3[2],true,values3[3])); 
				}
				break;
				case "6" :
					Iphone[] iphones = service.getIphones();
					
					for(int i=0; i<3; i++) {
						message += String.format("���: %s,%s,%s,%s,%s",
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
						String[] values=JOptionPane.showInputDialog("�Է�: Number, Name, Comapany, search, size").split(",");
						service.addGalaxyNote(new GalaxyNote(values[0],values[1],values[2],true,values[3],values[4])); 
					}
				break;
				case "8":
					GalaxyNote[] galaxyNotes =service.getGalaxyNotes();
					
					for(int i=0; i<3; i++) {
						message += String.format("���: %s,%s,%s,%s,%s",
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
