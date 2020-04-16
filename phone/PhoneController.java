package com.jse.phone;
import java.util.Scanner;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class PhoneController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneServiceImpl();   // 2.PhoneServie쓰고 컨트롤 스페이스 다쓰고 phoneService 복붙해서 lin16에 그대로 복사
		Phone phone = null;
		CellPhone cellPhone = null;
		Iphone iphone =null;
		
		String message="";
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0": return;
			case "1":										// 4. syso 입력
			
			for(int i=0;i<3;i++) {
			String[] values=JOptionPane.showInputDialog(Constants.PHONE_NEMU).split(",");	
			phone = new Phone();
			phone.setPhoneNumber(values[0]);
			phone.setName(values[1]);
			phone.setCompany(values[2]);
			service.add(phone);
			}
		break;
		case "2":
			JOptionPane.showMessageDialog(null, service.list()); break;
			
		case "3": 
				for(int i=0;i<3;i++) {
					String[] values=JOptionPane.showInputDialog(Constants.CELLPHONE_NEMU).split(",");
					cellPhone = new CellPhone();
					cellPhone.setPhoneNumber(values[0]);
					cellPhone.setName(values[1]);
					cellPhone.setCompany(values[2]);
					service.add(cellPhone);
				}
				break;
			case "4": 
				JOptionPane.showMessageDialog(null,service.cList());break;
				
				
			case "5":
				for(int i=0;i<3;i++) {
					String[] values=JOptionPane.showInputDialog(Constants.IPHONE_NEMU).split(",");
					iphone = new Iphone();
					iphone.setPhoneNumber(values[0]);
					iphone.setName(values[1]);
					iphone.setCompany(values[2]);
					iphone.setSearch(values[3]);
					service.add(iphone); 
				}
				break;
				case "6" :
				/*	Iphone[] iphones = service.getIphones();
					message = "";
					for(int i=0; i<3; i++) {
						message += iphones[i].toString()+"\n";
					}*/
					JOptionPane.showMessageDialog(null, service.IphoneList()); break;
				
				case "7":
					for(int i=0;i<3;i++) {
						String[] values=JOptionPane.showInputDialog(Constants.GALAXY_NOTE_menu).split(",");
			//			service.add(new GalaxyNote(values[0],values[1],values[2],true,values[3],values[4])); 
					}
				break;
				case "8":
					JOptionPane.showMessageDialog(null,service.galaxyNotelist());break;
		//		message = "";                         		74~79 수정하기
			//		for(int i=0; i<3; i++) {
			//			message += galaxyNotes[i].toString()+"\n";
			//		}
			//		JOptionPane.showMessageDialog(null, message);
			//	break;
		}
		}
	}

}
