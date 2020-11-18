import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class Lab6Part1 implements ActionListener
{
	JLabel label1;

	Lab6Part1()
	{
		JFrame frame = new JFrame("A simple button with a listener");

		JPanel panel1 = new JPanel();

		label1 = new JLabel("Hello");

		panel1.add(label1); //add into panel

		JButton button1 = new JButton("Change Label");

		button1.addActionListener(this); //event

		panel1.add(button1); //add into panel

		frame.getContentPane().add(panel1);

		frame.setSize(300,400);
		frame.setVisible(true);
	}

	public static void main(String [] args)
	{
		Lab6Part1 demo = new Lab6Part1();
	}

	public void actionPerformed(ActionEvent e)
	{
	   label1.setText("Hello World. My listener works!");

	}

}