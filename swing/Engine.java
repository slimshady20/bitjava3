package com.jse.swing;

import java.util.Scanner;

public class Engine {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[3];
		Member[] members = new Member[3];
		while(true) {
			System.out.println("0. ���� 1.����ǥ�Է� 2. ����ǥ��� 3.���� ���� 4. ȸ������ 5. ȸ�� ���� ���� 6.ȸ�� ���̼� ");
			switch(scanner.nextInt()) {
			case 0: System.out.println("����"); return;
			case 1: System.out.println("����ǥ");
			
			for(int i=0; i<3; i++) {
				grades[i] = input(scanner);
			}
			break;
			case 2:	
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[%s : ���� %d��, * ���%d��,���� : %s]",
							grades[i].getName(), 
							grades[i].total(), 
							grades[i].average(), 
							grades[i].grade()));
				}
				break;
				case 3:
				System.out.println("�������� 1, 2, 3�� �̸� �����ϱ�");
				for(int i=0; i<3; i++) {
					
					}
				break;
				
				case 4: 
					System.out.println("ȸ�� ������ ȯ���մϴ�.");
					for(int i=0; i<3; i++) {
						members[i] = join(scanner);
					}
				break;
				case 5:
					for(int i=0; i<3; i++) {
						System.out.println(String.format("���̵�: %s, ��й�ȣ: %s, �̸�: %s, ����: %d",
								members[i].getUserid(),
								members[i].getPasswd(),
								members[i].getName(),
								members[i].getAge()));
					}
					break;
				}
			}
		
		}
	
	public static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("�̸�");
		grade.setName(scanner.next());
		System.out.println("����");
		grade.setKorean(scanner.nextInt());
		System.out.println("����");
		grade.setEnglish(scanner.nextInt());
		System.out.println("����");
		grade.setMath(scanner.nextInt());
		return grade;
	}
	public static Member join(Scanner scanner) {
		Member member = new Member();
		System.out.println("���̵�");
		member.setUserid(scanner.next());
		System.out.println("��й�ȣ");
		member.setPasswd(scanner.next());
		System.out.println("�̸�");
		member.setName(scanner.next());
		System.out.println("����");
		member.setAge(scanner.nextInt());
		return member;
	}
	 // �Ķ���Ϳ� ������ ���� scanner ��������
		
			}
	/* static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("�̸�");
		grade.setName(scanner.next());
		System.out.println("����");
		grade.setKorean(scanner.nextInt());
		System.out.println("����");
		grade.setEnglish(scanner.nextInt());
		System.out.println("����");
		grade.setMath(scanner.nextInt());
		return grade; 
	} */



/*			 grade = new Grade();
System.out.println("�̸��� �Է����ּ���" );
String name = scanner.next();
grade.setName(name);
//grade.setName(scanner.next());

System.out.println("���� ������ �Է����ּ���");
int korean = scanner.nextInt();
grade.setKorean(korean);
//grade.setKorean(scanner.nextInt());
System.out.println("���� ������ �Է����ּ���");
int english = scanner.nextInt();
grade.setEnglish(english);
//grade.setEnglish(scanner.nextInt());
System.out.println("���� ������ �Է����ּ���");
int math =scanner.nextInt();
grade.setMath(math);
//	grade.setMath(scanner.nextInt());

//	String gradeResult= grade.score();
//	int totalResult= grade.totalscore();			
System.out.println(grade.getName() + ": ����  "+ grade.totalscore() +"  ���"+ grade.averagescore() +"�� "+"  ���� : "+grade.score());
//  System.out.println(String.format("[%s����: %d, ���: %d, ����: %s]",grade.getName(),grade.totalscore(),grade.averagescore(),grade.score()));
break;
} */