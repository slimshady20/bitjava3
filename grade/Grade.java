package com.jse.grade;
/*
 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 * * 이름과 국,영,수 세과목점수를 입력받아서() 
 * [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 * 단) 평균은 소수점이하는 절삭합니다
 *  평균점수가 90점 이상 A 
 *  * 80점 이상이면 B 
 *  70점 이상이면 C
 *   60점 이상이면 D 
 *   50점 이상이면 E 
 *   50점 미만이면 F 학점입니다라고 출력되게 해주세요
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
	private int korean;						// <-=--- 속성
	private int english;
	private int math;
	
	public void setName(String name) {   		// 여기부터 기능
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

