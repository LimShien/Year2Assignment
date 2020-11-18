import javax.swing.*;
import java.awt.*;

public class Lab4Part4
{
	public static void main(String []  args)
	{
		//create theframe
		JFrame frame = new JFrame("Pictures");

		//picture icon
		Icon monkey = new ImageIcon("images.jpg");
		Icon monkey2 = new ImageIcon("images2.jpg");
		Icon monkey3 = new ImageIcon("images3.png");



		//create three labels
		JLabel picLabel_1 = new JLabel("Champion!!");
		JLabel picLabel_2 = new JLabel("NO 2");
		JLabel picLabel_3 = new JLabel("Monkey No 3");

		//create Label for pic
		JLabel picture = new JLabel(monkey);

		JLabel picture2 = new JLabel(monkey2);

		JLabel picture3 = new JLabel(monkey3);

		//create textarea
		JTextArea picDes_1 = new JTextArea("Description: Picture of first Monkey");
		JTextArea picDes_2 = new JTextArea("Description: Picture of another Monkey");
		JTextArea picDes_3 = new JTextArea("Description: Picture of my last Monkey");

		//create Panel
		JPanel panel_1 = new JPanel();
		panel_1.add(picLabel_1);
		panel_1.add(picture);
		panel_1.add(picDes_1);

		JPanel panel_2 = new JPanel();
		panel_2.add(picLabel_2);
		panel_2.add(picture2);
		panel_2.add(picDes_2);

		JPanel panel_3 = new JPanel();
		panel_3.add(picLabel_3);
		panel_3.add(picture3);
		panel_3.add(picDes_3);

		//set layout
		frame.getContentPane().setLayout(new GridLayout(3,1, 2, 2));
		frame.getContentPane().add(panel_1);
		frame.getContentPane().add(panel_2);
		frame.getContentPane().add(panel_3);

		frame.setSize(300, 280);
		frame.setVisible(true);

	}
}