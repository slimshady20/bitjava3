package com.jse.swing;

import java.util.Scanner;

public class Engine2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeBean[] grades = new GradeBean[3];
		
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
	

	public static GradeBean input(Scanner scanner) {
		GradeBean grade = new GradeBean();
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
