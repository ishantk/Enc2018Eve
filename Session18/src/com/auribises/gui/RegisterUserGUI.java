package com.auribises.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RegisterUserGUI implements ActionListener{
	
	// Declare Components and Containers
	JFrame fr;
	JLabel lblTitle, lblName, lblEmail, lblPassword;
	JTextField txtName, txtEmail, txtPassword;
	JButton btnRegister, btnExit;
	JPanel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButton, pnlAll;
	
	//JFileChooser fileChooser;
	
	// Write a Constructor where you initialize all the Components and Containers
	public RegisterUserGUI() {
		fr = new JFrame("Register User");
		//fr.setTitle("Resgiter User");
		
		lblTitle = new JLabel("Please Register Here");
		
		lblName = new JLabel();
		lblName.setText("Enter Your Name");
		
		lblEmail = new JLabel("Enter Your Email");
		lblPassword = new JLabel("Enter Your Password");
		
		txtName = new JTextField(16);
		txtEmail = new JTextField(16);
		txtPassword = new JTextField(16);
		
		
		btnRegister = new JButton("Register");
		btnExit = new JButton("Exit");
		//btnRegister.setLabel("Register");
		
		//MyEventHandler ref = new MyEventHandler();
		
		btnRegister.addActionListener(this);
		btnExit.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlEmail = new JPanel();
		pnlPassword = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
	}
	
	public void showGUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButton.add(btnRegister);
		pnlButton.add(btnExit);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		fr.setSize(300, 300);
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			
			String name = txtName.getText();
			String email = txtEmail.getText();
			String password = txtPassword.getText();
			
			if(!email.contains("@") && !email.contains(".")){
				lblTitle.setText("Please Enter Correct Email");
				lblTitle.setBackground(Color.RED);
			}
			
			System.out.println("Hello "+name+", Your Email : "+email+" and your password: "+password);
		}else{
			fr.dispose();
		}
		
	}

}

/*class MyEventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}*/
