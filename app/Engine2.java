package com.jse.app;
import java.util.Random;
import java.util.Scanner;
//import com.jse.app.Member; 		같은 패키지에 있는건 안적어도됨.
//import com.jse.app.Calculator; 	같은 패키지에 있는건 안적어도됨.
//import com.jse.app.Dice;			같은 패키지에 있는건 안적어도됨.
import com.jse.app.RPSGame;

public class Engine2 {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in); //갈색 scanner , member는 instance(=객체)
			Member member= null;
			Calculator calculator = null;
			Dice dice = null;
			RPSGame rpsGame= null;
			
			Kaup kaup = null;
			
			while(true) {	
				//infinity loop	
				System.out.println("0. 종료 "
						+"1. 회원가입 "
						+"2. 로그인 "
						+"5. 1부터 100까지 숫자합산 "
						+"4. 가위바위보 "
						+"3. 계산기 "
						+"6  주사위 홀/ 짝 맞추기게임"
						+ "7. 카우푸지수 구하기");
				int flag = scanner.nextInt();
				switch(flag) {
				case 0: System.out.println("종료"); return;
				case 1:
					member= new Member();
					System.out.println("회원가입");
					System.out.println("아이디 입력");
					String userid = scanner.next();
					member.setId(userid);
					
					break;
				case 2: 
					member= new Member();
					System.out.println("로그인");
					System.out.println("아이디 입력");
					String id2 =scanner.next();
					String returnid = member.getId();
					System.out.println("로그인된 아이디"+ returnid);
					if(id2.equals(returnid)) {
						System.out.println("로그인 성공");
					}  else {
						System.out.println("로그인 실패");
					}
					break;
				
				case 3:
					calculator = new Calculator();
					System.out.println("계산기" );
					System.out.println("첫 번째 수 입력");
					int a = scanner.nextInt();
					calculator.setNum1(a);
					System.out.println("두 번째 수 입력");
					int b = scanner.nextInt();
					calculator.setNum2(b);
					int c= calculator.calculate();//calculate에 c값 있음
					System.out.println("두 수의 합은 " +c);
					
					break;
				
				case 4:
					rpsGame= new RPSGame();
					System.out.println("가위는 1, 바위는 2, 보는 3 을 입력하세요");
					int userValue = scanner.nextInt();
					System.out.println("사용자의 값은" + userValue + "입니다.");
					rpsGame.setUserValue(userValue);
					Random random = new Random();
					int computerValue = random.nextInt(3)+1;
					System.out.println("컴퓨터는의 값은"+ computerValue + "입니다.");
					rpsGame.setComputerValue(computerValue);
					
					String result=rpsGame.game();
					System.out.println(result);
					break;
					
					
		/*		
				case 6:
					dice = new Dice();
					System.out.println("주사위 홀짝 맞추기 게임");
					System.out.println(" 기대하는 값 홀 / 짝 을 입력해 주세요.");
					String expect = scanner.next();
					System.out.println(String.format("사용자가 입력한값 : %s", expect));
					dice.setExpect(expect);
					
				
					System.out.println(String.format("컴퓨터가 생성한 값 :%d", dice));
					dice.setDiceNum(diceNum);
					String result2 = dice.switchDice();
					System.out.println(result2);
					break;
				*/
				case 7:
					kaup = new Kaup();
					System.out.println("몸무게를 입력해주세요");
					double weight = scanner.nextDouble();
					kaup.setWeight(weight);
					
					System.out.println("키를 입력해주세요");
					double height= scanner.nextDouble();
					kaup.setHeight(height);
				//	String kaupResult = kaup.estimate();
				//	System.out.println("카우푸 지수는 "+  weight/(height*height));
					System.out.println("결과 당신은 "+ kaup.estimate());
					break;
					
					
				
			
			} 
		}
		}
}
