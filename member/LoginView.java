package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame  implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel[] labels;
	JTextField[] textFields; 
	JPanel panel;
	JButton saveButton,cancelButton;
	MemberService memberService;
	
	public void open(){ //open()은 method
		this.setSize(500, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //static이라 참조변수로 가지고오면 안된다???
	panel = new JPanel();
	this.add(panel);
	
	this.setVisible(true);
	labels = new JLabel[5];
	textFields = new JTextField[5];
	String[] names = {"이름","아이디" ,"패스워드","주민번호","추가사항"}; // new String[] {} 원래는이건데 new String 생략가능
	for(int i=0; i<names.length;i++) {
		labels[i] = new JLabel(names[i]);
		panel.add(labels[i]);
		textFields[i] = new JTextField();
		panel.add(textFields[i]);
		
	}
 
   saveButton = new JButton("저장");
   cancelButton = new JButton("취소");
   saveButton.addActionListener(this);
   cancelButton.addActionListener(this);
   
   panel.add(saveButton); 
   panel.add(cancelButton);
  
   labels[0].setBounds(40,10,40,40);
   labels[1].setBounds(40,50,40,40);
   labels[2].setBounds(40,90,60,40);
   labels[3].setBounds(40,130,40,40);
   labels[4].setBounds(40,170,60,40);
   textFields[0].setBounds(120,10,200,30);
   textFields[1].setBounds(120,50,200,30);
   textFields[2].setBounds(120,90,200,30);
   textFields[3].setBounds(120,130,280,30);
   textFields[4].setBounds(120,180,280,120);
   saveButton.setBounds(125, 330, 80, 30);
   cancelButton.setBounds(240, 330, 80, 30);
   this.setLocationRelativeTo(null);
  
}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		

		}
	

}



	

