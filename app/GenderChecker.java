package com.jse.app;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		find();

	}
	static void find() {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		 String IdNum= scanner.next();
		 System.out.println(IdNum);
		char gender= IdNum.charAt(7);
		switch(gender) {
			case '1': case '3': System.out.println("�����Դϴ�."); break;
			case '2': case '4': System.out.println("�����Դϴ�."); break;
			case '5': case '6': System.out.println("�ܱ����Դϴ�."); break; 
			case '0': case '7': 
			case '8': case '9': System.out.println("�߸� �Է��Ͽ����ϴ�."); break;
		}
	
	
		
		//String ssn= "910101-123456";
		
		//char ch = ssn.charAt(7); // 0���� ����
		
		// String a = "";
		// char c= '';
		// case '1'
		// 	System.out.println("����");  // 1, 3
		// 	System.out.println("����");  // 2,4
		// 	System.out.println("�ܱ���"); // 5,6
		// 	System.out.println("�߸� �Էµ� ��"); // 0,7,8,9
	}
}

/*
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		 String ssn= scanner.next();
		System.out.println(ssn);
		char ch= ssn.charAt(7);
		String result ="";
		switch(ch) {
			case '1': case '3': result ="����"; break;
			case '2': case '4': result ="����"; break;
			case '5': case '6': result ="�ܱ���"; break; 
			default: result= "�ܱ���"; break;	
			}
			System.out.println(result);
			}	
*/
