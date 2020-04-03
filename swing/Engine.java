package com.jse.swing;

import java.util.Scanner;

import com.jse.app.Kaup;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		
		
		while (true) {
			System.out.println("0. 종료"
					+"  1. 진행"
					+" 2. 성적표");
		//	int flag = scanner.nextInt();
		//	switch(flag(){ }
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1:  System.out.println("진행"); break;
			
			case 2: 
				 grade = new Grade();
				 System.out.println("이름을 입력해주세요" );
				 String name = scanner.next();
				 grade.setName(name);
				//grade.setName(scanner.next());
				 
				 System.out.println("국어 점수를 입력해주세요");
				int korean = scanner.nextInt();
				grade.setKorean(korean);
				//grade.setKorean(scanner.nextInt());
				System.out.println("영어 점수를 입력해주세요");
				int english = scanner.nextInt();
				grade.setEnglish(english);
				//grade.setEnglish(scanner.nextInt());
				System.out.println("수학 점수를 입력해주세요");
				int math =scanner.nextInt();
				grade.setMath(math);
			//	grade.setMath(scanner.nextInt());
			
			//	String gradeResult= grade.score();
			//	int totalResult= grade.totalscore();			
				System.out.println(grade.getName() + ": 총점  "+ grade.totalscore() +"  평균"+ grade.averagescore() +"점 "+"  학점 : "+grade.score());
			//  System.out.println(String.format("[%s총점: %d, 평균: %d, 학점: %s]",grade.getName(),grade.totalscore(),grade.averagescore(),grade.score()));
				 break;
			}
			
		}
	} 
}
