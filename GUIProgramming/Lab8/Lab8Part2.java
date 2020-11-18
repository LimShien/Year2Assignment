import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab8Part2 extends JFrame implements ActionListener
{
		JLabel colourFontLabel;
	Lab8Part2()
	{
		Container c = getContentPane();
	 colourFontLabel = new JLabel("Colour chosen will appear here");

		//font constructor((String name, int style, int size))
		colourFontLabel.setFont(new Font("SERIF",Font.BOLD, 15));

		JButton button = new JButton("Change colour of the text");
		button.addActionListener(this);

		JPanel panel =  new JPanel();
		panel.add(colourFontLabel);
		panel.add(button);

		c.add(panel);
		setVisible(true);
		setSize(300,400);
	}

	public void actionPerformed(ActionEvent e)
	{
		//Launch color chooser and store the color selected
		JColorChooser c = new JColorChooser();
		Color co = c.showDialog(colourFontLabel, "choose color", Color.BLACK);

		colourFontLabel.setForeground(co);

	}

	public static void main(String[] args)
	{
		Lab8Part2 demo = new Lab8Part2();
	}
}