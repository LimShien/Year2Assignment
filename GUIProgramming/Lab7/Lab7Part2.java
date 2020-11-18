import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part2 extends JFrame implements ActionListener
{
	String[] car = {"mazda", "Ford", "Honda"};
	JPanel display;
	Lab7Part2()
	{
		super("Simple card Layout");

		Container c = getContentPane();

		JPanel pan1 = new JPanel();

		JPanel pan2 = new JPanel();

		display = new JPanel();	//diplay panel


		//COMPONENTS
		JComboBox <String> com = new JComboBox<String>(car);

		JList <String> lis = new JList<String>(car);

		JButton but1 = new JButton("Click Me");
		but1.addActionListener(this);

		JButton but2 = new JButton("Click Me");
		but2.addActionListener(this);


		//organize using panel
		pan1.add(com);
		pan1.add(but1);

		pan2.add(lis);
		pan2.add(but2);

		//add the panels into display panel
		display.setLayout(new CardLayout());
		display.add(pan1);
		display.add(pan2);

		c.add(display);

		setVisible(true);
		setSize(300, 400);
	}

	public void actionPerformed(ActionEvent e)
	{
	//Get the card layout from the display panel
	CardLayout card = (CardLayout)display.getLayout();

	//next card
	card.next(display);


	}

	public static void main(String[] args)
	{
		Lab7Part2 demo = new Lab7Part2();
	}

}