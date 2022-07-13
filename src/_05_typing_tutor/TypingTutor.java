package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		currentLetter = TutorRunner.generateRandomLetter();
		
		
		label.setText(currentLetter + "");
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		frame.addKeyListener(this);
		
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	label.setText(currentLetter + "");
	
	System.out.println(e.getKeyChar());
	
	if (e.getKeyChar() == currentLetter) {
		System.out.println("correct");
		currentLetter = TutorRunner.generateRandomLetter();
		label.setText(currentLetter + "");
		panel.setBackground(Color.GREEN);
	}
	
	else{
		panel.setBackground(Color.RED);
		
	}
	
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
