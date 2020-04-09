package com.jse.game;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			//infinity loop	
			System.out.println("0. ���� "
					+"1. ���������� "
					+"2. �ֻ��� Ȧ¦ ���߱� ����"
					+"3. 1���� 100���� �����ջ�"
					+"4. ȸ������");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("����"); return;
			case 1: game();break;
			case 2: switchDice();break;
			case 3: sum();
			}
		}
	}
	
	static void switchDice() {
		System.out.println("�ֻ��� Ȧ¦ ���߱� ����");
		System.out.println(" ����ϴ� �� Ȧ / ¦ �� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("����ڰ� �Է��Ѱ� : %s", expect));
		Random random = new Random() ;
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("��ǻ�Ͱ� ������ �� :%d", dice));
		String result= "";
		switch(dice) {  // if�� ������ switch�� ������ ����
		case 1: case 3:case 5: result = "Ȧ"; break;
		case 2: case 4: case 6: result = "¦"; break;
		}  
		System.out.println(String.format("��ǻ���� ��� : %s", result));
		String result2 ="Ʋ��";
		if(expect.equals(result)) {
			result2= "����"; 
			}
		System.out.println(String.format("���: %s", result2));
	}
	static void game(){
		System.out.println("����1, ����2, ��3 �� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int game1 = scanner.nextInt();
		System.out.println("������� ����" +game1 + "�Դϴ�.");
		
		Random random = new Random();
		int game2 = random.nextInt(3)+1;
		System.out.println("��ǻ�ʹ��� ����"+ game2 + "�Դϴ�.");
		
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
		}
	
}
	static void sum() {
		int sum= 0;
		for(int i=1; i<=100; i++) {
		System.out.println(i);
		sum += i;
		
		}
		System.out.println(sum);
	}


}
