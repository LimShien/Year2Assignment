import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.io.File;
import java.awt.*;
import java.awt.event.*;

public class Lab8Part4 extends JFrame implements MouseListener, MouseMotionListener
{
	JPanel topLeft, topRight, btmLeft, btmRight, displayPanel;
	JLabel imageLabel = new JLabel("");
	JLabel locationLabel = new JLabel("");
	JLabel infoLabel =  new JLabel("");

	Lab8Part4()
	{
		super("application using mouse events and chooser");


		Container c = getContentPane();

		JPanel displayPanel = buildPanel();
		topLeftPanel();
		topRightPanel();
		btmLeftPanel();
		btmRightPanel();


		c.add(displayPanel);


		setVisible(true);
		setSize(500, 700);
	}

	//method to return the display panels with light black border
	public JPanel buildPanel()
	{
		topLeft = new JPanel();
		topLeft.setBorder(new LineBorder(Color.BLACK));

		topRight = new JPanel();
		topRight.setBorder(new LineBorder(Color.BLACK));

		btmLeft = new JPanel();
		btmLeft.setBorder(new LineBorder(Color.BLACK));

		btmRight = new JPanel();
		btmRight.setBorder(new LineBorder(Color.BLACK));

		displayPanel =  new JPanel();
		displayPanel.setLayout(new GridLayout(2, 2));
		displayPanel.add(topLeft);
		displayPanel.add(topRight);
		displayPanel.add(btmLeft);
		displayPanel.add(btmRight);

		return displayPanel;
	}

	//topLeft --> change image in panel using JFile Chooser
	public void topLeftPanel()
	{
		topLeft.add(imageLabel);
		topLeft.addMouseListener(this);

	}

	//topRight --> change color in panel using JColor Chooser
	public void topRightPanel()
	{
		topRight.addMouseListener(this);

	}

	//btmLeft --> display x, y location
	public void btmLeftPanel()
	{
		btmLeft.add(locationLabel);
		btmLeft.addMouseMotionListener(this);
	}

	//btmRight --> display goodbye message
	public void btmRightPanel()
	{
		btmRight.add(infoLabel);
		btmRight.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource() == topLeft)
		{
			//top Left File Chooser to Change image
			JFileChooser fc =  new JFileChooser ();

			int optionValue = fc.showOpenDialog(topLeft);

			if(optionValue == JFileChooser.APPROVE_OPTION)
			{
				File file = fc.getSelectedFile();
				imageLabel.setIcon(new ImageIcon((file.getName())));
			}
	}
	}
	public void mouseEntered(MouseEvent e)
	{
		//top Right to change bg color
		//open colour Chooser and store the colour
		if(e.getSource() == topRight)
		{
			JColorChooser c = new JColorChooser();

			Color bgColor = c.showDialog(topRight, "choose colour", Color.BLACK);

			topRight.setBackground(bgColor);


		}
	}
	public void mouseExited(MouseEvent e)
	{
		//bottom right display good bye message
		if(e.getSource() == btmRight)
		{
			infoLabel.setText("Luch beannacht!!!");
		}
	}
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseDragged(MouseEvent e)
	{
		//bottom Left get x, y, location
		if(e.getSource() == btmLeft)
		{
			//getLocationOnScreen() --> Returns the absolute x, y position of the event
			locationLabel.setText((e.getLocationOnScreen()).toString());
		}

	}
	public void mouseMoved(MouseEvent e){}


	public static void main(String[] args)
	{
		Lab8Part4 demo = new Lab8Part4();
	}
}