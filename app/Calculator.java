package com.jse.app;

public class Calculator {
		private int num1; // 인스턴스 변수 num1을 만듬
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
		첫번쨰 수 입력 <---상수
		두번쨰 수 입력
		두 수의 합은?
		System.out.println("첫 번째 수 입력");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("두 번째 수 입력");
		Scanner scanner2 = new Scanner(System.in);
		int a = scanner2.nextInt();
		int c = a + b ;
		
		System.out.println("두 수의 합은" + c);
*/
	}

