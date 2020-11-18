import javax.swing.*;
import java.awt.*;

class Lab5Part3
{
	//constructor
	Lab5Part3()
	{
		JFrame frame = new JFrame("ComboBox demo");

		//String and COmbo Box
		String[] car = {"Opel", "Ford", "Honda", "Toyota"};
		JComboBox <String> box1 = new JComboBox<String>(car);

		String [] artist = {"Taylor Swift", "Eminem", "Slipknot", "Beyond"};
		JComboBox <String> box2 = new JComboBox<String>(artist);

		//editable combo box2
		box2.setEditable(true);
		box2.setMaximumRowCount(10);

		//add into content pane and position the layout
		frame.getContentPane().add(box1, BorderLayout.NORTH);

		frame.getContentPane().add(box2, BorderLayout.SOUTH);

		frame.setSize(400,300);
		frame.setVisible(true);
	}

	public static void main(String [] args)
	{
		Lab5Part3 demo = new Lab5Part3();
	}
}