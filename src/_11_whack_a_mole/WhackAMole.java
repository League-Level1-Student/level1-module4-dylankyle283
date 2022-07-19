package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	
	
	
	
	public WhackAMole() {
		
		
		
		frame.setVisible(true);
		
		
		
		
		
		
		int ran =  new Random().nextInt(24);
		
		DrawButtons(ran);
		
		frame.setSize(300, 500);
	}
	
	
	public void DrawButtons(int mole) {
		
       for (int i = 0; i < 24; i++) {
		
		
		
		
		if (i == mole) {
			JButton moleButton = new JButton("mole");
			
			
			panel.add(moleButton);
			
			frame.add(panel);
		}
		
		
		
		else {
			
			JButton button = new JButton();
			panel.add(button);
			
			frame.add(panel);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
		
		
		
		
	}

}
