package com.jse.app;
import java.util.Scanner;
public class Dd {

	public static void main(String[] args) {
		find();

	}
	static void find() {
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
}
