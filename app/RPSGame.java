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
			
		String result="비겼습니다.";
			if(userValue==1) {
				switch(computerValue) {
				
				case 2: result= "컴퓨터 승리"; break;
				case 3: result= "사용자 승리"; break;
				}
			}  else if(userValue==2) {
				switch(computerValue) {
				case 1: result= "사용자 승리"; break;
				
				case 3: result="컴퓨터 승리"; break;
				}
			} else if(userValue==3) {
				switch(computerValue) {
				case 1: result="컴퓨터 승리"; break;
				case 2: result="사용자 승리"; break;
				
				}
	
		}
			return result;
	}
	}
	
/* 
 * System.out.println("가위1, 바위2, 보3 을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int game1 = scanner.nextInt();
		System.out.println("사용자의 값은" +game1 + "입니다.");
 * Random random = new Random();
	int game2 = random.nextInt(3)+1;
	System.out.println("컴퓨터는의 값은"+ game2 + "입니다.");
	//String result="";
	if(game1==1) {
		switch(game2) {
		case 1: System.out.println("비겼습니다."); break;
		case 2: System.out.println("컴퓨터 승리"); break;
		case 3: System.out.println("사용자 승리"); break;
		}
	}  else if(game1==2) {
		switch(game2) {
		case 1: System.out.println("사용자 승리"); break;
		case 2: System.out.println("비겼습니다."); break;
		case 3: System.out.println("컴퓨터 승리"); break;
		}
	} else if(game1==3) {
		switch(game2) {
		case 1: System.out.println("컴퓨터 승리"); break;
		case 2: System.out.println("사용자 승리"); break;
		case 3: System.out.println("비겼습니다."); break;
		}

	*/
