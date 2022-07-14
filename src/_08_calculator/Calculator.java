package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
public class Calculator implements ActionListener {
	JFrame frame = new JFrame("calculator");
	JPanel panel = new JPanel();
	
	JButton addB = new JButton("+");
	JButton subB = new JButton("-");
	JButton multB = new JButton("*");
	JButton divB = new JButton("/");
	
	JTextArea ans = new JTextArea("answer here");
	
	
	
	
	JTextField num1 = new JTextField("1000000");
	JTextField num2 = new JTextField("1000000");
	
	public Calculator() {
		
		
		addB.addActionListener(this);
		subB.addActionListener(this);
		multB.addActionListener(this);
		divB.addActionListener(this);
		
		frame.add(panel);
		panel.add(addB);
		panel.add(subB);
		panel.add(multB);
		panel.add(divB);
		panel.add(num1);
		panel.add(num2);
		panel.add(ans);
		frame.setVisible(true);
		frame.pack();
	}
	
	
	
	
	
	
	
public static String add(String number1, String number2) {
		
		int real1 = Integer.parseInt(number1);
		int real2 = Integer.parseInt(number2);
	
		int answer;
		answer = real1 += real2;
		String realAnswer = Integer.toString(answer);
		return realAnswer;
		
		
		
	}
	
public static String sub(String number1, String number2) {
	
	int real1 = Integer.parseInt(number1);
	int real2 = Integer.parseInt(number2);

	int answer;
	answer = real1 -= real2;
	String realAnswer = Integer.toString(answer);
	return realAnswer;
	
	
	
}

public static String mult(String number1, String number2) {
	
	int real1 = Integer.parseInt(number1);
	int real2 = Integer.parseInt(number2);

	int answer;
	answer = real1 *= real2;
	String realAnswer = Integer.toString(answer);
	return realAnswer;
	
	
	
}

public static String div(String number1, String number2) {
	
	int real1 = Integer.parseInt(number1);
	int real2 = Integer.parseInt(number2);

	int answer;
	answer = real1 /= real2;
	String realAnswer = Integer.toString(answer);
	return realAnswer;
	
	
	
}







@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == addB) {
		System.out.println("add clicked");
		ans.setText(add(num1.getText(), num2.getText()));
	}
	if(e.getSource() == subB) {
		System.out.println("add clicked");
		ans.setText(sub(num1.getText(), num2.getText()));
	}
	if(e.getSource() == multB) {
		System.out.println("add clicked");
		ans.setText(mult(num1.getText(), num2.getText()));
	}
	if(e.getSource() == divB) {
		System.out.println("add clicked");
		ans.setText(div(num1.getText(), num2.getText()));
	}
	
}
	
	
	
	
	
}
