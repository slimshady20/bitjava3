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
			System.out.println("0. ���� 1. ����ǥ �Է� 2. ����ǥ ���");
			switch(scanner.nextInt()) {
			case 0: System.out.println("����"); return;
			case 1: System.out.println("����ǥ");
			for(int i=0; i<3; i++) {
				grades[i] = input(scanner);
			// grades 3, grades[i]= grade  �ϳ��� �ǹ���.
			}
			break;
			case 2:
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[%s : ���� %d��, * ���%d��,���� : %s]",
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
		System.out.println("�̸�");
		grade.setName(scanner.next());
		System.out.println("����");
		grade.setKorean(scanner.nextInt());
		System.out.println("����");
		grade.setEnglish(scanner.nextInt());
		System.out.println("����");
		grade.setMath(scanner.nextInt());
		return grade;
	}
}
	
*/