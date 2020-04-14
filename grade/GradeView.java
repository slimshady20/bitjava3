package com.jse.grade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;


public class GradeView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel[] labels;
	JTextField[] textFields; 
	JPanel panel;
	JTextArea textarea;
	JButton saveButton,listButton;
	GradeService gradeService;
	public GradeView() {
		gradeService = new GradeServiceImpl();
	}
	
	public void open(){ //open()은 method
		this.setSize(600, 600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //static이라 참조변수로 가지고오면 안된다???
	panel = new JPanel();
	this.add(panel);
	this.setVisible(true);
	labels = new JLabel[6];
	textFields = new JTextField[6];
	String[] names = {"이름","국어" ,"영어","수학","자바", "검색결과"}; // new String[] {} 원래는이건데 new String 생략가능
	for(int i=0; i<names.length;i++) {
		labels[i] = new JLabel(names[i]);
		panel.add(labels[i]);
		textFields[i] = new JTextField();
		panel.add(textFields[i]);
		
	}
 
   saveButton = new JButton("저장");
   listButton = new JButton("목록");
  
   panel.add(saveButton); 
   panel.add(listButton);
   
   labels[0].setBounds(40,10,40,40);
   labels[1].setBounds(40,50,40,40);
   labels[2].setBounds(40,90,60,40);
   labels[3].setBounds(40,130,40,40);
   labels[4].setBounds(40,170,60,40);
   labels[5].setBounds(40,210,60,40);
   textFields[0].setBounds(120,10,200,30);
   textFields[1].setBounds(120,50,200,30);
   textFields[2].setBounds(120,90,200,30);
   textFields[3].setBounds(120,130,280,30);
   textFields[4].setBounds(120,180,280,30);
   textFields[5].setBounds(120,220,280,150);
   saveButton.setBounds(125,400,80,30);
   listButton.setBounds(240,400,80,30);
   this.setLocationRelativeTo(null); 
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== saveButton) {
			textFields[0].setText("홍길동,유관순,이순신,신사임당,세종대왕");
			textFields[1].setText("60,80,50,90");
			textFields[2].setText("70,90,90,80");
			textFields[3].setText("90,98,77,66,77");
			textFields[4].setText("77,66,88,55");
			
		String data= String.format("%s / %s / %s /%s / %s", 
				textFields[0].getText(),
				textFields[1].getText(),
				textFields[2].getText(),
				textFields[3].getText(),
				textFields[4].getText());
		
		
		String[] arr =data.split("/");
		Grade[] grades = new Grade[5];
		String[] names = arr[0].split(",");
		String[] koreans =arr[1].split(",");
		String[] englishs = arr[2].split(",");
		String[] maths = arr[3].split(",");
		String[] javas = arr[4]	.split(",");
	
		int a = Integer.parseInt(data);
		
		for(int i=0; i<5;i++) {
		//	int num = Integer.parseInt(string);
			grades[i]= new Grade();
			grades[i].setName(names[i]);
			grades[i].setName(names[i]);
			grades[i].setKorean(Integer.parseInt(koreans[i]));
			grades[i].setEnglish(Integer.parseInt(englishs[i]));
			grades[i].setMath(Integer.parseInt(maths[i]));
			grades[i].setJava(Integer.parseInt(javas[i]));
			gradeService.add(grades[i]);
		}
		}else if(e.getSource() == listButton) {
			
		}
		
	}
}
