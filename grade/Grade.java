package com.jse.grade;
/*
 * Ŭ���̾�Ʈ���� ���α׷� ���� ��û�� �Խ��ϴ�. 
 * * �̸��� ��,��,�� ������������ �Է¹޾Ƽ�() 
 * [ȫ�浿 : ���� ***��, * ���***��,���� : F] �� ����ϴ� ���α׷��� ����� �ּ���. 
 * ��) ����� �Ҽ������ϴ� �����մϴ�
 *  ��������� 90�� �̻� A 
 *  * 80�� �̻��̸� B 
 *  70�� �̻��̸� C
 *   60�� �̻��̸� D 
 *   50�� �̻��̸� E 
 *   50�� �̸��̸� F �����Դϴٶ�� ��µǰ� ���ּ���
 */
import lombok.Data;


@Data
	public class Grade{
	private String name;
	private int korean,english,math, java;
	
	
	
	public String toString() {
		return "korean"+ this.korean+ "english"+ this.english+ 
				"math"+ this.math+ "java"+ this.java;
	}
//	String koreans = Integer.toString(korean);
//	String englishs = Integer.toString(english);
//	String maths = Integer.toString(math);
//	String javas = Integer.toString(java);
}
/*public class Grade {
	private String name; 
	private int korean;						// <-=--- �Ӽ�
	private int english;
	private int math;
	
	public void setName(String name) {   		// ������� ���
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setKorean(int korean) {
		this.korean= korean;
	}
	public int getKorean() {
		return korean;
	}
	public void setEnglish(int english) {
		this.english= english;
	}
	public int getEnglish() {
		return english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public int total() {
		//	int total= korean + english + math;
		//	return total;
			 return korean + english + math;
		}
	public int average() {
		//	int average2=  (korean + english + math)/3;
		//	return average2;
			return total()/3;  
		}
	
	
} */

