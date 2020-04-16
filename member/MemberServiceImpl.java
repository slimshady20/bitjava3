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
	public Member[] getMembers() {// ����Ÿ���������Ƿ� Member[] member =�����Ѵٴ� ��
		return members;
	} */
	@Override
	public void add(Member member) {
	//	System.out.println("���񽺷� ���� ���");
	//	System.out.println(member);
		members[count] = member;
		count++;
		
	}

	@Override
	public Member login(Member member) { //member�� id�� pw �� ����ִ�.
	//	Member returnMember = new Member();
		Member returnMember = null;
		for(int i=0;i<members.length;i++) {
			if(member.getUserid().equals(members[i].getUserid())
			&& member.getPasswd().equals(members[i].getPasswd())) {
			//	members[count] = member; �״�� �����ͼ�
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
				detail = members[i];  // members[i]�� element�� 1�� 
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
				//  100�� ȫ�浿		100���� ȫ�浿
				//	searchByName = members;	 ���� �ϳ��� ã�ƾ��ϴµ� ���� �ٰ����´ٴ¶� 	
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
	//for(int i=0;i<members.length;i++) {			//length�� �ִ�����ϻ� 
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
				&& member.getPasswd().equals(members[i].getPasswd())){
				members[i] = members[count-1];  //�ǵڿ��� ��°�
				members[count-1]= null;
				count --;
				
			}
		}
	}

	}
// ������: ȸ���� 1�����϶� ȫ�浿�� 2��°���־���. �̵̹��Ҵµ��� 9998���� ���� �������� ���⶧����
// break; �֤��ָ��

/*
for(int i=0;i<members.length;i++) { // �ҷ��;��ϹǷ� �����ִ�members ������
if(member.getUserid().equals(members[i].getUserid()) 
	&& member.getPasswd().equals(members[i].getPasswd())) {
	ok =true;
	}
	
} 
System.out.println("���: " + ok);
// else { } �⺻���� false�ϱ� ���� �Ƚᵵ��.

return ok; */
		