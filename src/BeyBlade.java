import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeyBlade extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2309616812515166598L;

	int s=100;
	
	public static void main(String[] args) {
		BeyBlade win=new BeyBlade();
		win.init();
	}
	
	public void init() {
		JFrame frame = new JFrame("Bey Blade");
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);

		frame.setBounds(300, 300, 300, 300);
		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.pack();
		frame.setVisible(true);
		this.addMouseListener(new BeyBladeListener());

	}

	@Override
	public void paint(Graphics g) {
		
		if (this.getWidth()<this.getHeight()) {
			s=this.getWidth()/9;
		} else {
			s=this.getHeight()/9;
		}
			
		
		Graphics2D g2= (Graphics2D) g;
		g2.setBackground(Color.WHITE);
		g2.clearRect(0, 0, this.getWidth(),this.getHeight());
		
		g2.setColor(new Color(70,70,70));		
		g2.fillRect(s, s, this.getWidth()-2*s,this.getHeight()-2*s);
		
		for (int i=2;i<7;i++) {
			for (int j=2;j<7;j++) {
			//	System.out.println(i+","+j);
				if (Math.random()>.5) {
					g2.setColor(Color.WHITE);
					g2.fillRect(i*s, j*s, s, s);
				} 
			}
		}
		
	}
}

class BeyBladeListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		e.getComponent().repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
						
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
