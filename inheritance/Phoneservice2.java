package com.jse.inheritance;

public class Phoneservice2 {
	private Phone[] phones;  // �����ϴ°��̱⋚���� Phone[]�ȿ� �������ʴ´�. 
	public int count;			// 8. count ������ְ�  �ʱ�ȭ�ؾ��ؼ�
	public Phoneservice2() {    
		phones = new Phone[3];		//
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
}
