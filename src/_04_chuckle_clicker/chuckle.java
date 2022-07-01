package _04_chuckle_clicker;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class chuckle implements ActionListener{
	JFrame frame = new JFrame();	
	JButton button = new JButton();
	JButton button2 = new JButton();
	
public void main(String[] args) {
	
	new chuckle();
	
	
	button.setBounds(10, 0, 95,30);
	frame.add(button);
	
	button2.setBounds(100,0,95,30);
	frame.add(button2);
	
	
	
	button.setText("Trick");
	button.addActionListener(this);
	
	button2.setText("Treat");
	frame.setSize(250,200);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
}


public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	

if (buttonPressed == button ) {
System.out.println("button1 clicked");
}
if (buttonPressed == button2) {
 System.out.println("button2 clicked");
}
}



private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

}
