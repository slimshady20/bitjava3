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
	
	
	
	
	
	
	
	
	
	
	/*private Phone[] phones;  // �����ϴ°��̱⋚���� Phone[]�ȿ� �������ʴ´�. 
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	public int count;			// 8. count ������ְ�  �ʱ�ȭ�ؾ��ؼ�
	
	public PhoneService() {    
		phones = new Phone[3];		//
		cellPhones= new CellPhone[3];
		iphones= new Iphone[3];
		galaxyNotes= new GalaxyNote[3];
		count=0;					//9. �ʱ�ȭ
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setPhones(Phone[] phones) { //line 22�� �־���
		this.phones=phones;
	}
	public Phone[] getPhones() {       // 12.
		return phones;
	}
	public void add(Phone phone) {  // �� add���ֳ�? setPhones(Phone[] phones)���� Phone phone ���ָ� �ϳ��� �ִ°Ŵ�
		phones[count]= phone;   // 1. line 4�� phones �� �־��ٲ��� phones[0] =phone; ���� ����������𸣴ϱ� 0 ������������ ���� �������� ��
 								// 7. phones[0] =phone; 3�� �ݺ��ؾ��ϴ� �����ؾߵǰڱ��� 
		count++;				// 10. 1�� �����ؾ��ϴ� count++; �߰�
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
/* �����ε�
public void add(Phone phone ) //	add�� �Ȱ��Ƶ� ������� �̸��� �Ȱ��Ƶ� �������.	
	iphones[count]= phone;
	count++;
*/