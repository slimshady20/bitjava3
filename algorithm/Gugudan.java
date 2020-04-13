package com.jse.algorithm;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		int dan= scanner.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(String.format("%d * %d = %d",dan,i,dan*i));
		}
	*/	
		
	//	int[][] mtx= new int[9][9];
		
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				System.out.print(String.format("%d * %d = %d \t",j,i,i*j ));
			}
		System.out.println();
		}
		System.out.println();
		for(int c=1;c<=9;c++) {
			for(int d=6;d<=9;d++) {
				System.out.print(String.format("%d * %d = %d \t", d,c,d*c));
			}
			System.out.println();
		}
	}
	
}
