package com.Calculator.WindowBuilder.JavaProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result; 
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 13));
		frame.setBackground(new Color(39, 40, 42));
		frame.getContentPane().setBackground(new Color(39, 40, 42));
		frame.setResizable(false);
		frame.setBounds(100, 100, 281, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setText("  ");
		textField.setBackground(new Color(39, 40, 42));
		textField.setFont(new Font("Helvetica", Font.BOLD, 20));
		textField.setBounds(10, 10, 265, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("←");
		btnBackspace.setForeground(Color.BLACK);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Helvetica", Font.BOLD, 20));
		btnBackspace.setBounds(75, 88, 65, 54);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.BLACK);
		btn7.setAlignmentX(0.1f);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn7.setBounds(10, 140, 65, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn4.setBounds(10, 191, 65, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn1.setBounds(10, 244, 65, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.RED);
		btn0.setForeground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn0.setBounds(10, 296, 130, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("AC");
		btnClear.setForeground(Color.BLACK);
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Helvetica", Font.PLAIN, 18));
		btnClear.setBounds(10, 88, 65, 54);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn8.setBounds(75, 140, 65, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn5.setBounds(75, 191, 65, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn2.setBounds(75, 244, 65, 54);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.BLACK);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Helvetica", Font.BOLD, 20));
		btnDot.setBounds(141, 296, 65, 54);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(240, 155, 61));
		btnEqual.setForeground(Color.BLACK);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="÷")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			
			}
		});
		btnEqual.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnEqual.setBounds(206, 296, 65, 54);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setForeground(Color.BLACK);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Helvetica", Font.BOLD, 18));
		btnPercent.setBounds(141, 87, 65, 54);
		frame.getContentPane().add(btnPercent);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn3.setBounds(141, 244, 65, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn6.setBounds(141, 191, 65, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btn9.setBounds(141, 140, 65, 54);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(240, 155, 61));
		btnPlus.setForeground(Color.BLACK);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnPlus.setBounds(206, 244, 65, 54);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(240, 155, 61));
		btnSub.setForeground(Color.BLACK);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnSub.setBounds(206, 191, 65, 54);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(new Color(240, 155, 61));
		btnMul.setForeground(Color.BLACK);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnMul.setBounds(206, 140, 65, 54);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("÷");
		btnDivide.setBackground(Color.ORANGE);
		btnDivide.setForeground(Color.BLACK);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="÷";
			}
		});
		btnDivide.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnDivide.setBounds(206, 87, 65, 54);
		frame.getContentPane().add(btnDivide);
	}
}
