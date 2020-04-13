package com.jse.member;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel[] labels;
	JTextField[] textFields; 
	JPanel panel;
	//JTextArea textarea;
	JButton saveButton,listButton,loginButton;
	MemberService memberService;
	
	public JoinView() {
	memberService = new MemberServiceImpl();
	}
	public void open(){ //open()�� method
		this.setSize(600, 600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //static�̶� ���������� ��������� �ȵȴ�???
	panel = new JPanel();
	this.add(panel);
	this.setVisible(true);
	labels = new JLabel[6];
	textFields = new JTextField[6];
	String[] names = {"�̸�","���̵�" ,"�н�����","SSN","�ּ�","�˻����"}; // new String[] {} �������̰ǵ� new String ��������
	for(int i=0; i<names.length;i++) {
		labels[i] = new JLabel(names[i]);
		panel.add(labels[i]);
		textFields[i] = new JTextField();
		panel.add(textFields[i]);
		
	}
 
   saveButton = new JButton("����");
   listButton = new JButton("���");
   loginButton = new JButton("�α���");
   saveButton.addActionListener(this);
   listButton.addActionListener(this);
   
   panel.add(saveButton); 
   panel.add(listButton);
   panel.add(loginButton);
  
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
   loginButton.setBounds(340,400,80,30);
   this.setLocationRelativeTo(null);
  
}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == saveButton) {
			textFields[0].setText("ȫ�浿,������,�̼���,�Ż��Ӵ�,�������");
			textFields[1].setText("Hong, You,Lee,Sin,Sae");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,960101-2,011010-4,020606-3,123456-5"); 
			textFields[4].setText("����,����,����,�λ�,�뱸");
		/*	JOptionPane.showMessageDialog(this, String.format("%s / %s / %s / %s", //notation ��ȣ�� ���ͷ��� ����   Ŭ���� text�� "Ŭ��" �� String  nameField.get
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText()));  */
			
			String data= String.format("%s / %s / %s / %s / %s", 
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText(),
					textFields[4].getText());
		
			
			String[] arr = data.split("/");
			Member[] members= new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwds= arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
		
			for(int i=0;i<5;i++) {
				members[i]= new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwds[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
				
			}
		  }else if(e.getSource()==listButton) {
				JOptionPane.showMessageDialog(this, "Ŭ�� !!");
				 Member[] members = memberService.getMembers();
				 for(int i=0;i<members.length;i++) { 
				System.out.println("ȭ�� ��� ���");
				System.out.println(members[i]);
				
				}	
				 	textFields[0].setText("ȫ�浿,��");
					textFields[1].setText("Hong, e");
					textFields[2].setText("1,1,1,1,1");
					textFields[3].setText("900106-3,123456-5"); 
					textFields[4].setText("����,��,�뱸");
					textFields[5].setText("����,��,�뱸");
				 	
				
			}
		}

	}



		/*	
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<mtx[i].length;j++) {
					System.out.println(mtx[i][j]);
				}
				System.out.println();
			}
			System.out.println("Matrix End");	
			
			String[] names = data[0].split(",");
			String[] userid= data[1].split(",");
			String[] passwd= data[2].split(",");
			String[] ssn= data[3].split(",");
			
			for(int i=0;i<names.length;i++) {
				System.out.print(names[i]+"\t");
			}
			System.out.println();
			for(int i=0;i<userid.length;i++) {
				System.out.print(userid[i]+"\t");
			}
			System.out.println();
			for(int i=0;i<passwd.length;i++) {
				System.out.print(passwd[i]+"\t");
			}
			System.out.println();
			for(int i=0;i<ssn.length;i++) {
				System.out.print(ssn[i]+"\t");
			}
			System.out.println();
			
			
			// �� ���ø��� ���� ��´�.
			Member[] members = memberService.getMembers();
			for(int i=0; i<members.length;i++) {
				Member member = new Member();
				Member member2 = new Member();
				Member member3 = new Member();
				Member member4 = new Member();
				member.setName(names[i]);
				member.setUserid(userid[i]);
				member.setPasswd(passwd[i]);
				member.setSsn(ssn[i]);
				
			}
			for(int i=0; i<members.length;i++) {
				
				System.out.println(members[i].toString());
			}
		//	System.out.println(service.getM);
		} else if(e.getSource() == cancelButton) {
		//	JOptionPane.showMessageDialog(parentComponent, message);*/
	

