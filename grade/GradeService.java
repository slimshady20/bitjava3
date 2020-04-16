package com.jse.grade;

public interface GradeService {
	public void add(Grade grade);
//	public void setGrades(Grade[] grades);
//	public Grade[] getGrades();
//	public void setCount(int count);
//	public int getCount();
	public Grade[] list();
	public Grade detail(Grade grade);  //login ´ë½Å¿¡
	
	public int total(Grade grade);
	public int average(Grade grade);
	public String record(Grade grade);
//	public String printGrades();
	public String ranking();
	public void update(Grade grade);
	public void delete(Grade grade);
	
}
