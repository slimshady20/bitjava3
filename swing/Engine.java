package com.jse.swing;

import java.util.Scanner;

import com.jse.app.Kaup;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		
		
		while (true) {
			System.out.println("0. ����"
					+"  1. ����"
					+" 2. ����ǥ");
		//	int flag = scanner.nextInt();
		//	switch(flag(){ }
			switch(scanner.nextInt()) {
			case 0 : System.out.println("����"); return;
			case 1:  System.out.println("����"); break;
			
			case 2: 
				 grade = new Grade();
				 System.out.println("�̸��� �Է����ּ���" );
				 String name = scanner.next();
				 grade.setName(name);
				//grade.setName(scanner.next());
				 
				 System.out.println("���� ������ �Է����ּ���");
				int korean = scanner.nextInt();
				grade.setKorean(korean);
				//grade.setKorean(scanner.nextInt());
				System.out.println("���� ������ �Է����ּ���");
				int english = scanner.nextInt();
				grade.setEnglish(english);
				//grade.setEnglish(scanner.nextInt());
				System.out.println("���� ������ �Է����ּ���");
				int math =scanner.nextInt();
				grade.setMath(math);
			//	grade.setMath(scanner.nextInt());
			
			//	String gradeResult= grade.score();
			//	int totalResult= grade.totalscore();			
				System.out.println(grade.getName() + ": ����  "+ grade.totalscore() +"  ���"+ grade.averagescore() +"�� "+"  ���� : "+grade.score());
			//  System.out.println(String.format("[%s����: %d, ���: %d, ����: %s]",grade.getName(),grade.totalscore(),grade.averagescore(),grade.score()));
				 break;
			}
			
		}
	} 
}
