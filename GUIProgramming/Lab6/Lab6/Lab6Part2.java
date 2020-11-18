import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Lab6Part2 extends JFrame implements ActionListener
{
	//to be visible for every scope
	JComboBox colourSelector;
	JPanel panel;

	//an array of Colors
	Color[] selection ={Color.BLACK ,Color.GRAY, Color.GREEN};
	Lab6Part2()
	{
		super("Button with listener combined with ComboBox");

		Container c = getContentPane();

		colourSelector = new JComboBox <Color>(selection);


		JButton changeColour = new JButton("Change Colour");

		changeColour.addActionListener(this); //event listener

		panel = new JPanel();

		panel.add(colourSelector);
		panel.add(changeColour);

		c.add(panel);

		setSize(300,400);
		setVisible(true);


	}

	public static void main(String[] args)
	{
		Lab6Part2 demo =new Lab6Part2();
	}

	public  void actionPerformed(ActionEvent e)
	{
		//set background colour of panel based on the index selected in Combo Box
		//selection --> array of colour
		//colourSelector --> JComboBox
		//getSelectedIndex() --> return the index value of selected colors
		panel.setBackground(selection[colourSelector.getSelectedIndex()]);
	}
}