import javax.swing.*;
import java.awt.*;

class Lab5Part1 extends JFrame
{
	//constructor
	Lab5Part1()
	{
		//set title of frame
		super("Question 1");

		Container c = getContentPane();

		//three labels
		JLabel label1 = new JLabel("Name:");
		JLabel label2 = new JLabel("Password:");
		JLabel label3 = new JLabel("Email Address:");

		//three fields
		JTextField textName = new JTextField();
			textName.setColumns(20); //set number of columns - from java API
		JPasswordField pass = new JPasswordField(20);
		JTextField textEmail = new JTextField();
			textEmail.setColumns(20);


		//button
		JButton joinButton = new JButton("Join");

		//panels
		JPanel panel1 = new JPanel();
			panel1.add(label1);
			panel1.add(textName);

		JPanel panel2 = new JPanel();
			panel2.add(label2);
			panel2.add(pass);

		JPanel panel3 = new JPanel();
			panel3.add(label3);
			panel3.add(textEmail);

		JPanel panel = new JPanel();
			panel.add(panel1);
			panel.add(panel2);
			panel.add(panel3);
			panel.add(joinButton);

		//add into content pane
		c.add(panel);

		setSize(400,300);
		setVisible(true);
	}

	public static void main(String [] args)
	{
		Lab5Part1 demo = new Lab5Part1();
	}
}