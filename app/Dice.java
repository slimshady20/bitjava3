package com.jse.app;
import java.util.Scanner;
import java.util.Random;

//시나리오
public class Dice {
	   private String expect;
	   private int diceNum;		//인스턴스 변수 expect,dice를 만듬. 무엇을 인스턴스변수로 만들지 고민해야함
	   
	   public void setExpect(String expect) {  //set은 외부에서 값이들어와야하니까 String expect
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
	/*	System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println(" 기대하는 값 홀 / 짝 을 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한값 : %s", expect));
		Random random = new Random() ;
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("컴퓨터가 생성한 값 :%d", dice));
		*/
		String result= "";
		switch(diceNum) {  // if와 차이점 switch에 변수가 들어옴
		case 1: case 3:case 5: result = "홀"; break;
		case 2: case 4: case 6: result = "짝"; break;
		}  
		System.out.println(String.format("컴퓨터의 결과 : %s", result));
		String result2 ="틀림";
		if(expect.equals(result)) {
			result2= "맞음"; 
			}
		System.out.println(String.format("결과: %s", result2));
		return result2;
	}

	
	 public void ifDice() { //이것이 메소드의 형태
	System.out.println("주사위 홀짝  맞추기 게임");
	System.out.println("기대하는 값 홀/짝을 입력해 주세요.");
	
	Scanner scanner = new Scanner(System.in);
	String expect = scanner.next();
	System.out.println("예상값 : " + expect );
	
	Random random = new Random();
	int dice = random.nextInt(6);

	System.out.println("결과값"+ dice);
	String result = "";
	if(dice == 1) {
		result = "홀";
	} else if (dice ==2) {
		result = "짝";
	} else if(dice == 3) {
		result = "홀";
	}
	else if(dice == 4) {
		result = "짝";
	}
	else if(dice == 5) {
		result = "홀";
	}
	else if(dice == 6) {
		result = "짝";
	} // if end
	System.out.println("홀짝결과    " + result);
	if( expect.equals(result)){ //object type 의 operation은 method로 처리함.
	System.out.println("매칭");
} else {
	System.out.println("틀림");
	} // if end

	} 
}
