package com.jse.app;
import java.util.Random;
import java.util.Scanner;
//import com.jse.app.Member; 		���� ��Ű���� �ִ°� �������.
//import com.jse.app.Calculator; 	���� ��Ű���� �ִ°� �������.
//import com.jse.app.Dice;			���� ��Ű���� �ִ°� �������.
import com.jse.app.RPSGame;

public class Engine2 {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in); //���� scanner , member�� instance(=��ü)
			Member member= null;
			Calculator calculator = null;
			Dice dice = null;
			RPSGame rpsGame= null;
			
			Kaup kaup = null;
			
			while(true) {	
				//infinity loop	
				System.out.println("0. ���� "
						+"1. ȸ������ "
						+"2. �α��� "
						+"5. 1���� 100���� �����ջ� "
						+"4. ���������� "
						+"3. ���� "
						+"6  �ֻ��� Ȧ/ ¦ ���߱����"
						+ "7. ī��Ǫ���� ���ϱ�");
				int flag = scanner.nextInt();
				switch(flag) {
				case 0: System.out.println("����"); return;
				case 1:
					member= new Member();
					System.out.println("ȸ������");
					System.out.println("���̵� �Է�");
					String userid = scanner.next();
					member.setId(userid);
					
					break;
				case 2: 
					member= new Member();
					System.out.println("�α���");
					System.out.println("���̵� �Է�");
					String id2 =scanner.next();
					String returnid = member.getId();
					System.out.println("�α��ε� ���̵�"+ returnid);
					if(id2.equals(returnid)) {
						System.out.println("�α��� ����");
					}  else {
						System.out.println("�α��� ����");
					}
					break;
				
				case 3:
					calculator = new Calculator();
					System.out.println("����" );
					System.out.println("ù ��° �� �Է�");
					int a = scanner.nextInt();
					calculator.setNum1(a);
					System.out.println("�� ��° �� �Է�");
					int b = scanner.nextInt();
					calculator.setNum2(b);
					int c= calculator.calculate();//calculate�� c�� ����
					System.out.println("�� ���� ���� " +c);
					
					break;
				
				case 4:
					rpsGame= new RPSGame();
					System.out.println("������ 1, ������ 2, ���� 3 �� �Է��ϼ���");
					int userValue = scanner.nextInt();
					System.out.println("������� ����" + userValue + "�Դϴ�.");
					rpsGame.setUserValue(userValue);
					Random random = new Random();
					int computerValue = random.nextInt(3)+1;
					System.out.println("��ǻ�ʹ��� ����"+ computerValue + "�Դϴ�.");
					rpsGame.setComputerValue(computerValue);
					
					String result=rpsGame.game();
					System.out.println(result);
					break;
					
					
		/*		
				case 6:
					dice = new Dice();
					System.out.println("�ֻ��� Ȧ¦ ���߱� ����");
					System.out.println(" ����ϴ� �� Ȧ / ¦ �� �Է��� �ּ���.");
					String expect = scanner.next();
					System.out.println(String.format("����ڰ� �Է��Ѱ� : %s", expect));
					dice.setExpect(expect);
					
				
					System.out.println(String.format("��ǻ�Ͱ� ������ �� :%d", dice));
					dice.setDiceNum(diceNum);
					String result2 = dice.switchDice();
					System.out.println(result2);
					break;
				*/
				case 7:
					kaup = new Kaup();
					System.out.println("�����Ը� �Է����ּ���");
					double weight = scanner.nextDouble();
					kaup.setWeight(weight);
					
					System.out.println("Ű�� �Է����ּ���");
					double height= scanner.nextDouble();
					kaup.setHeight(height);
				//	String kaupResult = kaup.estimate();
				//	System.out.println("ī��Ǫ ������ "+  weight/(height*height));
					System.out.println("��� ����� "+ kaup.estimate());
					break;
					
					
				
			
			} 
		}
		}
}
