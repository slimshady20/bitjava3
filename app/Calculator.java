package com.jse.app;

public class Calculator {
		private int num1; // �ν��Ͻ� ���� num1�� ����
		private int num2; 
		
		public void setNum1(int num1) {
			this.num1 = num1;	
		}
		public int getNum1() {
			return num1;
		}
		
		
		public void setNum2(int num2) {
			this.num2 = num2;
		}
		public int getNum2() {
			return num2;
		}
		
		public int calculate() {
			
		int c = this.num1 + this.num2;
		return c; 
		}
		
		
		/*
		ù���� �� �Է� <---���
		�ι��� �� �Է�
		�� ���� ����?
		System.out.println("ù ��° �� �Է�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("�� ��° �� �Է�");
		Scanner scanner2 = new Scanner(System.in);
		int a = scanner2.nextInt();
		int c = a + b ;
		
		System.out.println("�� ���� ����" + c);
*/
	}

