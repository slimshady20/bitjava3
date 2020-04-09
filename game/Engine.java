package com.jse.game;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			//infinity loop	
			System.out.println("0. 종료 "
					+"1. 가위바위보 "
					+"2. 주사위 홀짝 맞추기 게임"
					+"3. 1부터 100까지 숫자합산"
					+"4. 회원가입");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: game();break;
			case 2: switchDice();break;
			case 3: sum();
			}
		}
	}
	
	static void switchDice() {
		System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println(" 기대하는 값 홀 / 짝 을 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한값 : %s", expect));
		Random random = new Random() ;
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("컴퓨터가 생성한 값 :%d", dice));
		String result= "";
		switch(dice) {  // if와 차이점 switch에 변수가 들어옴
		case 1: case 3:case 5: result = "홀"; break;
		case 2: case 4: case 6: result = "짝"; break;
		}  
		System.out.println(String.format("컴퓨터의 결과 : %s", result));
		String result2 ="틀림";
		if(expect.equals(result)) {
			result2= "맞음"; 
			}
		System.out.println(String.format("결과: %s", result2));
	}
	static void game(){
		System.out.println("가위1, 바위2, 보3 을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int game1 = scanner.nextInt();
		System.out.println("사용자의 값은" +game1 + "입니다.");
		
		Random random = new Random();
		int game2 = random.nextInt(3)+1;
		System.out.println("컴퓨터는의 값은"+ game2 + "입니다.");
		
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
