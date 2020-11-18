import javax.swing.*;
import java.awt.*;

class Lab5Part4
{
	Lab5Part4()
	{
		JFrame frame = new JFrame();

		//create Buttons
		JButton button1 = new JButton("Option1");

		JButton button2 = new JButton("Option2");

		JButton button3 = new JButton("Option3");

		JButton button4 = new JButton("Option4");

		JButton button5 = new JButton("Option5");

		JButton button6 = new JButton("Option6");

		//label
		JLabel label1 = new JLabel("Withdrawal");

		JLabel label2 = new JLabel("Deposit");

		JLabel label3 = new JLabel("BalanceInquiry");

		JLabel label4 = new JLabel("Transfer&Payment");

		JLabel label5 = new JLabel("Set Preferences");

		JLabel label6 = new JLabel("Others...");

		//panel

		JPanel panel1 = new JPanel();
			panel1.add(button1);
			panel1.add(label1);
			panel1.setBackground(Color.LIGHT_GRAY); //set background colour --> java.awt.Color


		JPanel panel2 = new JPanel();
			panel2.add(button2);
			panel2.add(label2);
			panel2.setBackground(Color.orange);

		JPanel panel3 = new JPanel();
			panel3.add(button3);
			panel3.add(label3);
			panel3.setBackground(Color.orange);


		JPanel panel4 = new JPanel();
			panel4.add(button4);
			panel4.add(label4);
			panel4.setBackground(Color.LIGHT_GRAY);

		JPanel panel5 = new JPanel();
			panel5.add(button5);
			panel5.add(label5);
			panel5.setBackground(Color.LIGHT_GRAY);

		JPanel panel6 = new JPanel();
			panel6.add(button6);
			panel6.add(label6);
			panel6.setBackground(Color.orange);

		//add into content pane and use Grid layout with 3 rows, 2 cols and 2 for rows and cols gap
		frame.getContentPane().setLayout(new GridLayout(3, 2, 2, 2));
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(panel3);
		frame.getContentPane().add(panel4);
		frame.getContentPane().add(panel5);
		frame.getContentPane().add(panel6);


		frame.setSize(270,300);
		frame.setVisible(true);
	}

	public static void main(String [] args)
	{
		Lab5Part4 demo = new Lab5Part4();
	}
}