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
	public Member[] getMembers() {// ����Ÿ���������Ƿ� Member[] member =�����Ѵٴ� ��
		return members;
	}
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