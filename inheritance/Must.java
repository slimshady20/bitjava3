package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();   // 2.PhoneServie���� ��Ʈ�� �����̽� �پ��� phoneService �����ؼ� lin16�� �״�� ����
		
		while(true) {System.out.println(" 0. ���� 1.�Է� 2. ���");
			switch(JOptionPane.showInputDialog(" 0. ���� 1.�Է� 2. ���")) {
			case "0": return;
			case "1": System.out.println("��ȭ��ȣ, �̸�, ȸ�� �Է�"); 							// 4. syso �Է�
			for(int i=0;i<3;i++) {
			String[] values=JOptionPane.showInputDialog("Write number, Name Company").split(",");	
			service.add(new Phone(values[0],values[1],values[2]));
			}
		break;
		case "2":
			Phone[] phones =service.getPhones();					// 12. ����ϱ����� ��ܿ;��ϴϱ� getPhones() �޾ƾ��ϴϱ� 									// phone[] = getPhones(); �ٵ� service�� ��������Ƿ� servce.getPhones();
			String message="";						
			for(int i=0;i<3;i++) {																// 11/.for() {} �Է�
				message += String.format("���: %s,%s,%s \n",								// 13. string.format
						phones[i].getPhoneNumber(), phones[i].getName(),phones[i].getCompany());
				
																						// 14. phones[i] ���� �ϳ��ϱ� phones[i].getPhoneNumber()
			}
			JOptionPane.showMessageDialog(null, message);
			break;
		}
		}
	}

}

