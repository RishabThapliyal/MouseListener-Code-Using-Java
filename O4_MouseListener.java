package END;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class O4_MouseListener{

	public static void main(String[] args) {
		
		MouseDemo obj = new MouseDemo();

	}

}

class MouseDemo extends JFrame implements MouseListener
{

	JLabel l;
	
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	
	
	public MouseDemo() {
		
		
		l = new JLabel();
		l.addMouseListener(this);
	
		
		smile = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Desktop\\smile.png");
		nervous = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Desktop\\nervous.png");
		pain = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Desktop\\pain.png");
		dizzy = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Desktop\\dizzy.png");
		
		l.setIcon(smile);
		
		this.add(l);
		this.setLayout(new FlowLayout()); 
		this.pack();
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("You Clicked the mouse...!!");
		
	}

	public void mousePressed(MouseEvent e) {
		l.setIcon(pain);
	}

	public void mouseReleased(MouseEvent e) {
		l.setIcon(dizzy);
	}

	
	public void mouseEntered(MouseEvent e) {
		l.setIcon(nervous);
		
	}

	public void mouseExited(MouseEvent e) {
		l.setIcon(smile);
		
	}
	
	
	
	
}
