package com.jse.swing;
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
public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public void setName(String name) {
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
	public String score() {
		String result="";
		int average= (korean + english + math)/3;
	//  int average= 	averagescore();
		
		if(average>=90) {
			result="A .";	
		} else if(average>=80) {
			result="B ";
		} else if(average>=70) {
			result="C ";
		} else if(average>=60) {
			result="D ";
		} else if(average>=50) {
			result="E ";
		} else if(average<50) {
			result="F";
		} else {
			result="잘못 입력된 값입니다.";
		}
		return result;
	}
	public int totalscore() {
		int total= korean + english + math;
		return total;
	//	 return korean + english + math;
	}
	public int averagescore() {
		int average2=  (korean + english + math)/3;
		return average2;
	//	return totalscore()/3;  
	}
	
}


