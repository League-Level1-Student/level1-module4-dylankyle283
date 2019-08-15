package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySuprise implements ActionListener {

	JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton("Trick");
JButton button2 = new JButton("Treat");
public void Run() {
	frame.setVisible(true);
	panel.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	
	
	
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource().equals(button1)) {
		showPictureFromTheInternet("https://a57.foxnews.com/media2.foxnews.com/BrightCove/694940094001/2019/04/24/931/524/694940094001_6029547251001_6029542798001-vs.jpg?ve=1&tl=1");
	}
	else if (e.getSource().equals(button2)) {
		showPictureFromTheInternet("https://a57.foxnews.com/media2.foxnews.com/BrightCove/694940094001/2019/04/24/931/524/694940094001_6029547251001_6029542798001-vs.jpg?ve=1&tl=1");
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
