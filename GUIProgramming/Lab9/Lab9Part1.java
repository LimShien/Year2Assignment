import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Lab9Part1 implements ActionListener
{
	JFrame frame;
	Lab9Part1()
	{
		frame = new JFrame("Input Dialog");

		JButton button  = new JButton("Launch Input Button");
		button.addActionListener(this);

		JPanel panel =  new JPanel();
		panel.add(button);

		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(300, 400);

	}
	public void actionPerformed(ActionEvent e)
	{
		//store the value entered into a String
		String name = JOptionPane.showInputDialog(frame,"enter your name");

		frame.setTitle(name);
	}
	public static void main(String [] args)
	{
		Lab9Part1 demo = new Lab9Part1();
	}

}