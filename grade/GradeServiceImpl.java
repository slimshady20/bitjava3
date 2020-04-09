package com.jse.grade;



public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades= new Grade[3];
		count=0;		
	}
	@Override
	public void setGrades(Grade[] grades) {
			this.grades = grades;
		
	}
	@Override
	public Grade[] getGrades() {
		return grades;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
		
	}
	@Override
	public void setCount(int count) {
		this.count = count;
		
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public int total(Grade grade) {
		
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}
	@Override
	public int average(Grade grade) {
		return total(grade) / 3;
	}
	@Override
	public String record(Grade grade) {
		String result="";
		//int average= (korean + english + math)/3;
		 int average= 	average(grade);
			
			if(average>=90) {
				result="A .";	
			} else if(average>=80) {
				result="B ";
			} else if(average>=70) {
				result="C ";
			} else if(average>=60) {
				result="D ";
			} else if(average>=50) {
				result="E ";
			} else if(average<50) {
				result="F";
			} else {
				result="�߸� �Էµ� ���Դϴ�.";
			}
			return result;
	}
	@Override
	public String printGrades() {
		String result = "";
		
		for(int i=0;i<3;i++) {
						result += String.format("[%s : ���� %d ��, ��� %d ��,���� : %s] \n",
					grades[i].getName(),
					total(grades[i]),
					average(grades[i]),
					record(grades[i]));
		}
		return result;
	}
	@Override
	public String ranking() {
	//	grades = getGrades();
		int a = total(grades[0]);
		int y = total(grades[1]);
		int z = total(grades[2]);
		if (a > y && a>z) {
			if (y > z ) {
				System.out.println("1�� :" + grades[0].getName() + " 2��:" + grades[1].getName() + " 3��:"
						+ grades[2].getName());
			} else if (z > y) {
				System.out.println("1�� :" + grades[0].getName() + " 2��:" + grades[2].getName() + " 3��:"
						+ grades[1].getName());
			}
		} else if (y > a && y>z) {
			if (a > z) {
				System.out.println("1�� :" + grades[1].getName() + " 2��:" + grades[0].getName() + " 3��:"
						+ grades[2].getName());
			} else if (z > a) {
				System.out.println("1�� :" + grades[1].getName() + " 2��:" + grades[2].getName() + " 3��:"
						+ grades[0].getName());
			}
		} else if (z > y && z>a) {
			if (y > a) {
				System.out.println("1�� :" + grades[2].getName() + " 2��:" + grades[1].getName() + " 3��:"
						+ grades[0].getName());
			} else if (a > y) {
				System.out.println("1�� :" + grades[2].getName() + " 2��:" + grades[0].getName() + " 3��:"
						+ grades[1].getName());
			}
		}
		
		return null;
	}
	
}

