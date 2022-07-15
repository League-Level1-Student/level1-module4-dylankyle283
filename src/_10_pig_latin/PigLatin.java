package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PigLatin implements ActionListener {
	JFrame frame = new JFrame("Pig Latin Converter");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Translate");
	JButton button2 = new JButton("speak");
	JTextField box = new JTextField("enter english here                                           ");
	JTextField box2 = new JTextField("pig will be here                                            ");
	
	public PigLatin() {
		frame.setSize(1000, 100);
		frame.add(panel);
		panel.add(button1);
		panel.add(box);
		panel.add(box2);
		panel.add(button2);
		
		
		
		
		frame.setVisible(true);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
		
	public String Convert(String word){
		String[] words = word.split("\\W+");
		//System.out.println(words[0]);
		String Answer ="";
		
		for( int i = 0; i < words.length; i++){
			
			Answer += words[i].substring(1) + words[i].charAt(0)+ "ay ";
			
		}
		
		
		
	    System.out.println(Answer);
		return Answer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource() == button1) {
			
			box2.setText(Convert(box.getText()));
			
			
			
		}
		
		if( e.getSource() == button2) {
			System.out.println(box2.getText());
			
		}
		
	}
		
	}
	
	
	
	

