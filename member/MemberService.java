package com.jse.member;

public interface MemberService {
//	public void setMembers(Member[] members);  
//	public Member[] getMembers();
//	public void setCount(int count);
//	public int getCount();
	public void add(Member member);
	public Member[] list();		//line 5랑 똑같음 
	public Member[] searchByName(String keyword);     // search 는 ㅁ
	public Member[] searchByGender(String gender); 
	public Member detail(String userid);								// line 8~12CRUD 의 Create
	public int count();   
	public int count(String name);
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);  // 아이디버번넘겨줘야하니  Member mebmber
	
	

}