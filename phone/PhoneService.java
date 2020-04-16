package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public Phone list();
	public Phone detail(Phone phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
	
	
	public void add(CellPhone cellphone);
	public CellPhone cList();
	public CellPhone detail(CellPhone cellphone);
	public void update(CellPhone cellphone);
	public void delete(CellPhone cellphone);
	
	
	public void add(Iphone iphone);
	public Iphone IphoneList();
	public Iphone detail(Iphone iphone);
	public void update(Iphone iphone);
	public void delete(Iphone iphone);
	
	public void add(GalaxyNote galaxynote);
	public GalaxyNote galaxyNotelist();
	public GalaxyNote detail(GalaxyNote galaxynote);
	public void update(GalaxyNote galaxynote);
	public void delete(GalaxyNote galaxynote);
	
}
	
	
	
	
	
	
	
	
	
	
	/*private Phone[] phones;  // 선언하는것이기떄문에 Phone[]안에 값넣지않는다. 
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	public int count;			// 8. count 만들어주고  초기화해야해서
	
	public PhoneService() {    
		phones = new Phone[3];		//
		cellPhones= new CellPhone[3];
		iphones= new Iphone[3];
		galaxyNotes= new GalaxyNote[3];
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
	
	
	public CellPhone[] getCellPhones() {
		return cellPhones;
	}
	public void setCellPhones(CellPhone[] cellPhones) {
		this.cellPhones = cellPhones;
	}
	
	
	
	
	public Iphone[] getIphones() {
		return iphones;
	}
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	
	
	
	public void add(Iphone phone ) {
		iphones[count]= phone;
		count++;
	}

	public void add(GalaxyNote phone) {
		galaxyNotes[count]= phone;
		count++;
	}
	public void add(CellPhone phone) {
		cellPhones[count]=phone;
		count++;
	}
	
}*/
/* 오버로딩
public void add(Phone phone ) //	add는 똑같아도 상관없다 이름도 똑같아도 상관없다.	
	iphones[count]= phone;
	count++;
*/