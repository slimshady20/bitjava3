package com.jse.member;



public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count= 0;
	}
	
	/*@Override
	public void setMembers(Member[] members) {
		this.members = members;
		
	}
	@Override
	public Member[] getMembers() {// 리턴타입이있으므로 Member[] member =리턴한다는 뜻
		return members;
	} */
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

	@Override
	public Member[] list() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public int count() {
		
		return count;
	}
	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}
	
	@Override
	public Member detail(String userid) {
		Member detail= null;
		for(int i=0;i<members.length;i++) {
			if(userid.equals(members[i].getUserid())) {
				detail = members[i];  // members[i]는 element라 1개 
				break;
			}
		}
		return detail;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[] searchByNames =null;
		int searchCount = count(name);
		if(searchCount !=0) {
			searchByNames = new Member[searchCount];
			int j= 0;
			for(int i=0;i<members.length;i++) {
				if(name.equals(members[i].getName())){
					searchByNames[j] = members[i];
					j++;
					if(searchCount ==j) {
						break;
					}
				}
			}
		}
	
				//	searchByNames[i] = members[i];		
				//  100명 홍길동		100만명 홍길동
				//	searchByName = members;	 값을 하나만 찾아야하는데 전부 다가져온다는뜻 	
		return searchByNames;
	
	
}
	@Override
	public Member[] searchByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Member member) {
		for(int i=0;i<members.length;i++) {
		if(member.getUserid().equals(members[i].getUserid())){
			members[i].setPasswd(member.getPasswd());
			break;
		}
	}
}
	@Override
	public void delete(Member member) {
	//for(int i=0;i<members.length;i++) {			//length는 최대길이일뿐 
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
				&& member.getPasswd().equals(members[i].getPasswd())){
				members[i] = members[count-1];  //맨뒤에거 담는것
				members[count-1]= null;
				count --;
				
			}
		}
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
		