package com.jse.grade;

import javax.swing.JOptionPane;

//import com.jse.member.Member;
//import com.jse.member.MemberService;
import com.jse.util.Constants;

public class GradeController {
	
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();  // �Ʒ����̶� ��� �Ȱ���
	
		Grade grade =null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":  return;
			case "1":
				for(int i=0; i< 3;i++) {
				String[] values= JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
				grade = new Grade();
				grade.setName(values[0]);
				grade.setKorean(Integer.parseInt(values[1]));			
				grade.setEnglish(Integer.parseInt(values[2]));
				grade.setMath(Integer.parseInt(values[3]));
				gradeService.add(grade);			
			}
			break;
			case "2":	
				JOptionPane.showMessageDialog(null, gradeService.list());
				System.out.println(gradeService.list());break;
			case "3":
				String[] values= JOptionPane.showInputDialog(Constants.GRADE_RANKING).split(",");
				grade = new Grade();
				
				break;
			}
		}

	}
}
	/*public static Grade input(Scanner scanner) { //Grade �� return type
		//Grade grade = new Grade(Scanner scanner) {//new Grade(); �� argument�� �ʿ��� �׷��� 
			System.out.println("�̸�, ���� ,���� ,���� �Է�");
			return new Grade(scanner.next(),
					scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		}; 
	//	return grade; // main�� grade�� �ַ��� return��
	
	public static Member join(Scanner scanner) {
	//	Member member = new Member();
		System.out.println("ID, ��й�ȣ, �̸�, ���� �Է�");
		return new Member(scanner.next(),scanner.next(),scanner.next(),scanner.nextInt());
		
	*/