package com.jse.member;

public interface MemberService {
//	public void setMembers(Member[] members);  
//	public Member[] getMembers();
//	public void setCount(int count);
//	public int getCount();
	public void add(Member member);
	public Member[] list();		//line 5�� �Ȱ��� 
	public Member[] searchByName(String keyword);     // search �� ��
	public Member[] searchByGender(String gender); 
	public Member detail(String userid);								// line 8~12CRUD �� Create
	public int count();   
	public int count(String name);
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);  // ���̵�����Ѱ�����ϴ�  Member mebmber
	
	

}