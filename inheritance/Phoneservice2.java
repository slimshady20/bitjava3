package com.jse.inheritance;

public class Phoneservice2 {
	private Phone[] phones;  // 선언하는것이기떄문에 Phone[]안에 값넣지않는다. 
	public int count;			// 8. count 만들어주고  초기화해야해서
	public Phoneservice2() {    
		phones = new Phone[3];		//
		count=0;					//9. 초기화
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setPhones(Phone[] phones) { //line 22에 넣어줌
		this.phones=phones;
	}
	public Phone[] getPhones() {       // 12.
		return phones;
	}
	public void add(Phone phone) {  // 왜 add를넣냐? setPhones(Phone[] phones)에서 Phone phone 써주면 하나만 넣는거다
		phones[count]= phone;   // 1. line 4에 phones 로 넣어줄꺼라 phones[0] =phone; 아직 몇번넣을지모르니까 0 오류방지위해 이제 엔진으로 ㄱ
 								// 7. phones[0] =phone; 3번 반복해야하니 증가해야되겠구나 
		count++;				// 10. 1씩 증가해야하니 count++; 추가
	}
}
