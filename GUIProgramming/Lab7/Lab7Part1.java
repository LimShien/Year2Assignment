import javax.swing.*;
import java.awt.*;


class Lab7Part1 extends JFrame
{
	Lab7Part1()

	{
		super("Box Layout");

		Container c =  getContentPane();



		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();


		//6 components
		JLabel label1 = new JLabel("Vertical Layout");
		JLabel label2 = new JLabel("Vertical Layout");
		JLabel label3 = new JLabel("Horizontal");
		JLabel label4 = new JLabel("Horizontal");
		JButton but1 = new JButton("Click me");
		JButton but2 = new JButton("Click me too!");

		//set vertical for first panel
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(label1);
		panel1.add(but1);
		panel1.add(label2);

		//set Horizontal for second panel
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(label3);
		panel2.add(but2);
		panel2.add(label4);

		c.setLayout(new FlowLayout());
		c.add(panel1);
		c.add(panel2);


		setVisible(true);
		setSize(300, 400);
	}

	public static void main(String[] args)
	{
		Lab7Part1 demo = new Lab7Part1();
	}
}