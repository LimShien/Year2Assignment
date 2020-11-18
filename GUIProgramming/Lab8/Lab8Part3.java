import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

class Lab8Part3 extends JFrame implements MouseInputListener, MouseListener
{
	JLabel label = new JLabel("");

	Lab8Part3()
	{
		super("MOUSE INPUT LISTENER");
		Container c = getContentPane();

		label.setText("output");
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);

		panel.add(label);

		c.add(panel);

		setVisible(true);
		setSize(300, 400);
	}

	public void mouseClicked(MouseEvent e)
	{
		label.setText("Mouse Click Detected");
	}

	public void mouseEntered(MouseEvent e)
	{
		label.setText("Mouse Entered Detected");
	}
	public void mouseExited(MouseEvent e)
	{
		label.setText("Mouse Exited Detected");
	}

	public void mousePressed(MouseEvent e)
	{
		label.setText("Mouse Pressed Detected");
	}

	public void mouseReleased(MouseEvent e)
	{
		label.setText("Mouse Released Detected");
	}

	//mouse motion

	public void mouseDragged(MouseEvent e)
	{
		label.setText("Mouse Dragged Detected");
	}

	public void mouseMoved(MouseEvent e)
	{
		label.setText("Mouse Moved Detected");
	}


	public static void main(String[] args)
	{
		Lab8Part3 demo = new Lab8Part3();
	}
}