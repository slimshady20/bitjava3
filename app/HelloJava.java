package com.jse.app;
import java.util.Scanner;
public class HelloJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� ������?");
		String name = scanner.next();
	//	Ŭ����(�빮��) ���� ���� �޼ҵ�	
		System.out.println("�ȳ��ϼ��� " + name+ "��.");
	//	Ŭ����      ����       �޼ҵ�		���
		
	/*	System.out.println("��� �缼��?");
		String name2 = scanner.next();
		System.out.println("�� " + name2 + " �������̿���");
		int double String�� Ÿ��/ height,weigh,age�� ����
	*/	
		int age = scanner.nextInt();
		System.out.println(age+ "���̳׿�.");
		System.out.println("Ű�� ���̰� , �����Դ� ��  k�Դϱ�?");
		double height= scanner.nextFloat();
		double weight= scanner.nextDouble();
		System.out.println("�������� ������?");
		char bloodType = scanner.nextAt(0);
	
		int a;  // ���� a�� �����ϴ�.
		System.out.println(a);
	
	}	
}
