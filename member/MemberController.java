package com.jse.member;

public class MemberController {

}

/*
import java.util.Scanner;

import com.jse.grade.Grade;

public class MemberController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[3];
	
		
		while(true) {
			System.out.println("0. 종료 1. 성적표 입력 2. 성적표 출력");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("성적표");
			for(int i=0; i<3; i++) {
				grades[i] = input(scanner);
			// grades 3, grades[i]= grade  하나를 의미함.
			}
			break;
			case 2:
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[%s : 총점 %d점, * 평균%d점,학점 : %s]",
						grades[i].getName(),
						grades[i].total(),
						grades[i].average(),
						grades[i].grade()));				
				}
				break;
			
			}
		}
	}
	

	public static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("이름");
		grade.setName(scanner.next());
		System.out.println("국어");
		grade.setKorean(scanner.nextInt());
		System.out.println("영어");
		grade.setEnglish(scanner.nextInt());
		System.out.println("수학");
		grade.setMath(scanner.nextInt());
		return grade;
	}
}
	
*/