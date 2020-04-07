package com.jse.swing;

import java.util.Scanner;

public class Engine {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();  // 아래줄이랑 결과 똑같음
	//	GradeBean[] grades = new GradeBean[3];
		MemberService memberService = new MemberService();
	//	MemberBean[] members = new MemberBean[3];
		while(true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력 3.성적 순위 4. 회원가입 5. 회원 가입 정보 6.회원 나이순 ");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("성적표");
			
			for(int i=0; i< 3;i++) {
				System.out.println("이름,국어,영어,수학  입력");
				gradeService.add(new GradeBean(	scanner.next(),scanner.nextInt(),
								scanner.nextInt(),
								scanner.nextInt()));
			}
			break;
			case 2:	
				GradeBean[] grades = gradeService.getGrades();
				for(int i=0; i<3; i++) {
					GradeBean grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d점, * 평균%d점,학점 : %s]",
							grades[i].getName(), 
							grades[i].total(), 
							grades[i].average(), 
							grades[i].grade()));
				}
				break;
				case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");
				for(int i=0; i<3; i++) {}
				break;
				case 4: 
					System.out.println("회원 가입을 해주세요.");
					for(int i=0; i<3; i++) {
					System.out.println("ID, 비밀번호, 이름, 나이 입력");
					memberService.add(new MemberBean(scanner.next(),scanner.next(),
					scanner.next(),scanner.nextInt()));
			//			members[i] = join(scanner);
					}
				break;
				case 5:
					MemberBean[] members = MemberBean.getMembers();
					for(int i=0; i<3; i++) {
						System.out.println(String.format("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d",
								members[i].getUserid(),
								members[i].getPasswd(),
								members[i].getName(),
								members[i].getAge()));
					}
					break;
				case 6:
					
					break;
				}
			}
		
		}
	
	public static GradeBean input(Scanner scanner) { //Grade 가 return type
		//Grade grade = new Grade(Scanner scanner) {//new Grade(); 는 argument가 필요함 그래서 
			System.out.println("이름, 국어 ,영어 ,수학 입력");
			return new GradeBean(scanner.next(),
					scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		}; 
	//	return grade; // main에 grade값 주려고 return줌
	
	public static MemberBean join(Scanner scanner) {
	//	Member member = new Member();
		System.out.println("ID, 비밀번호, 이름, 나이 입력");
		return new MemberBean(scanner.next(),scanner.next(),scanner.next(),scanner.nextInt());
		
	/*	System.out.println("아이디");
		member.setUserid(scanner.next());
		System.out.println("비밀번호");
		member.setPasswd(scanner.next());
		System.out.println("이름");
		member.setName(scanner.next());
		System.out.println("나이");
		member.setAge(scanner.nextInt());
		return member; */
	}
	 // 파라미터에 넣으면 위에 scanner 데리고옴
		
			}
	/* static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("이름");
		grade.setName(scanner.next());
		System.out.println("국어");
		grade.setKorean(scanner.nextInt());
		System.out.println("영어");
		grade.setEnglish(scanner.nextInt());
		System.out.println("수학");
		grade.setMath(scanner.nextInt());
		return grade; 
	} */



/*			 grade = new Grade();
System.out.println("이름을 입력해주세요" );
String name = scanner.next();
grade.setName(name);
//grade.setName(scanner.next());

System.out.println("국어 점수를 입력해주세요");
int korean = scanner.nextInt();
grade.setKorean(korean);
//grade.setKorean(scanner.nextInt());
System.out.println("영어 점수를 입력해주세요");
int english = scanner.nextInt();
grade.setEnglish(english);
//grade.setEnglish(scanner.nextInt());
System.out.println("수학 점수를 입력해주세요");
int math =scanner.nextInt();
grade.setMath(math);
//	grade.setMath(scanner.nextInt());

//	String gradeResult= grade.score();
//	int totalResult= grade.totalscore();			
System.out.println(grade.getName() + ": 총점  "+ grade.totalscore() +"  평균"+ grade.averagescore() +"점 "+"  학점 : "+grade.score());
//  System.out.println(String.format("[%s총점: %d, 평균: %d, 학점: %s]",grade.getName(),grade.totalscore(),grade.averagescore(),grade.score()));
break;
} */