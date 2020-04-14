package com.jse.member;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
	}
	
	@Override
	public void setMembers(Member[] members) {
		this.members = members;
		
	}
	@Override
	public Member[] getMembers() {// 리턴타입이있으므로 Member[] member =리턴한다는 뜻
		return members;
	}
	@Override
	public void add(Member member) {
	//	System.out.println("서비스로 들어온 멤버");
	//	System.out.println(member);
		members[count] = member;
		count++;
		
	}

	@Override
	public Member login(Member member) { //member에 id와 pw 가 담겨있다.
	//	Member returnMember = new Member();
		Member returnMember = null;
		for(int i=0;i<members.length;i++) {
			if(member.getUserid().equals(members[i].getUserid())
			&& member.getPasswd().equals(members[i].getPasswd())) {
			//	members[count] = member; 그대로 가져와서
			//	returnMember = members[count];  
				returnMember = members[i];   
				break;
			}
		}
		return returnMember;
	}
	
}
// 새문제: 회원이 1만명일때 홍길동이 2번째에있었다. 이미돌았는데도 9998번을 돌음 쓸데없이 돌기때문에
// break; 넣ㅇ주면됨

/*
for(int i=0;i<members.length;i++) { // 불러와야하므로 위에있는members 가져옴
if(member.getUserid().equals(members[i].getUserid()) 
	&& member.getPasswd().equals(members[i].getPasswd())) {
	ok =true;
	}
	
} 
System.out.println("결과: " + ok);
// else { } 기본값이 false니까 굳이 안써도됨.

return ok; */