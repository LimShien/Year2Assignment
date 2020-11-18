import javax.swing.*;
import java.awt.*;

class Lab5Part2
{
	Lab5Part2()
	{
		JFrame frame = new JFrame("JLIST DEMO");

		String[] shops = {"Tesco", "Lidl", "Aldi" , "Dunnes" , "M&S", "AppleGreen", "SuperValu", "Iceland"};

		JList <String>  list = new JList <String>(shops);



		frame.getContentPane().add(list, BorderLayout.NORTH);

			frame.setSize(400,300);
			frame.setVisible(true);

	}

	public static void main(String[] args)
	{
		Lab5Part2 demo = new Lab5Part2();

	}

}