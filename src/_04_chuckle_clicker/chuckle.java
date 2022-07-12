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
	JFrame frame; 
	JPanel panel;
	JButton button;
	JButton button2;
	public chuckle() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();

		button2 = new JButton();

		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		button.setText("trick");
		button2.setText("treat");
		
		frame.pack();

	}
public static void main(String[] args) {
	
chuckle c = new chuckle();
	
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
@Override
public void actionPerformed(ActionEvent arg0) {
	if (arg0.getSource() == button) {
	
	} 
	if (arg0.getSource() == button2) {
		showPictureFromTheInternet("https://allhdwallpapers.com/wp-content/uploads/2016/07/Chocolate-7.jpg");
	} 
}

}
