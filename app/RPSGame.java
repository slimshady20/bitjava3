package com.jse.app;


	public class RPSGame {
		private int userValue;
		private int computerValue;
		
		public void setUserValue(int userValue) {
			this.userValue= userValue;
		}
		public int getUserValue() {
			return userValue;
		}
		public void setComputerValue(int compuerValue) {
			this.computerValue= computerValue;
		}
		public int getComputerValue() {
			return computerValue;
		}
		
		public String game() {
			
		String result="�����ϴ�.";
			if(userValue==1) {
				switch(computerValue) {
				
				case 2: result= "��ǻ�� �¸�"; break;
				case 3: result= "����� �¸�"; break;
				}
			}  else if(userValue==2) {
				switch(computerValue) {
				case 1: result= "����� �¸�"; break;
				
				case 3: result="��ǻ�� �¸�"; break;
				}
			} else if(userValue==3) {
				switch(computerValue) {
				case 1: result="��ǻ�� �¸�"; break;
				case 2: result="����� �¸�"; break;
				
				}
	
		}
			return result;
	}
	}
	
/* 
 * System.out.println("����1, ����2, ��3 �� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int game1 = scanner.nextInt();
		System.out.println("������� ����" +game1 + "�Դϴ�.");
 * Random random = new Random();
	int game2 = random.nextInt(3)+1;
	System.out.println("��ǻ�ʹ��� ����"+ game2 + "�Դϴ�.");
	//String result="";
	if(game1==1) {
		switch(game2) {
		case 1: System.out.println("�����ϴ�."); break;
		case 2: System.out.println("��ǻ�� �¸�"); break;
		case 3: System.out.println("����� �¸�"); break;
		}
	}  else if(game1==2) {
		switch(game2) {
		case 1: System.out.println("����� �¸�"); break;
		case 2: System.out.println("�����ϴ�."); break;
		case 3: System.out.println("��ǻ�� �¸�"); break;
		}
	} else if(game1==3) {
		switch(game2) {
		case 1: System.out.println("��ǻ�� �¸�"); break;
		case 2: System.out.println("����� �¸�"); break;
		case 3: System.out.println("�����ϴ�."); break;
		}

	*/
