package com.jse.app;
import java.util.Scanner;
import java.util.Random;

//�ó�����
public class Dice {
	   private String expect;
	   private int diceNum;		//�ν��Ͻ� ���� expect,dice�� ����. ������ �ν��Ͻ������� ������ ����ؾ���
	   
	   public void setExpect(String expect) {  //set�� �ܺο��� ���̵��;��ϴϱ� String expect
		   this.expect = expect;
	   }
	   public String getExpect() {
		   return expect;
	   }
	   public void setDiceNum(int DiceNum) {
		   this.diceNum= diceNum;
	   }
	   public int getDiceNum() {
		   return diceNum;
	   }
	
	 public String switchDice() {
	/*	System.out.println("�ֻ��� Ȧ¦ ���߱� ����");
		System.out.println(" ����ϴ� �� Ȧ / ¦ �� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("����ڰ� �Է��Ѱ� : %s", expect));
		Random random = new Random() ;
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("��ǻ�Ͱ� ������ �� :%d", dice));
		*/
		String result= "";
		switch(diceNum) {  // if�� ������ switch�� ������ ����
		case 1: case 3:case 5: result = "Ȧ"; break;
		case 2: case 4: case 6: result = "¦"; break;
		}  
		System.out.println(String.format("��ǻ���� ��� : %s", result));
		String result2 ="Ʋ��";
		if(expect.equals(result)) {
			result2= "����"; 
			}
		System.out.println(String.format("���: %s", result2));
		return result2;
	}

	
	 public void ifDice() { //�̰��� �޼ҵ��� ����
	System.out.println("�ֻ��� Ȧ¦  ���߱� ����");
	System.out.println("����ϴ� �� Ȧ/¦�� �Է��� �ּ���.");
	
	Scanner scanner = new Scanner(System.in);
	String expect = scanner.next();
	System.out.println("���� : " + expect );
	
	Random random = new Random();
	int dice = random.nextInt(6);

	System.out.println("�����"+ dice);
	String result = "";
	if(dice == 1) {
		result = "Ȧ";
	} else if (dice ==2) {
		result = "¦";
	} else if(dice == 3) {
		result = "Ȧ";
	}
	else if(dice == 4) {
		result = "¦";
	}
	else if(dice == 5) {
		result = "Ȧ";
	}
	else if(dice == 6) {
		result = "¦";
	} // if end
	System.out.println("Ȧ¦���    " + result);
	if( expect.equals(result)){ //object type �� operation�� method�� ó����.
	System.out.println("��Ī");
} else {
	System.out.println("Ʋ��");
	} // if end

	} 
}
