import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Lab6Part3 extends JFrame implements ListSelectionListener
{
	JList list;
	String[] selection ={"subject1","subject2", "subject3","subject4","subject5","subject6","subject7", "subject8","subject9", "subject10"};
	JTextArea ta;
	Lab6Part3()
	{
		super("Lab6Part3");

		Container c = getContentPane();

		JLabel label1 = new JLabel("Please choose your favourite subjects so far!");

		list = new JList <String>(selection);

		list.addListSelectionListener(this);

		ta = new JTextArea("Response will appear here");

		JPanel panel = new JPanel();
		panel.add(label1);
		JPanel panel2 = new JPanel();
		panel2.add(list);
		JPanel panel3 = new JPanel();
		panel3.add(ta);

		c.setLayout(new GridLayout(3,1, 3, 3));
		c.add(panel);
		c.add(panel2);
		c.add(panel3);


		setSize(400,500);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Lab6Part3 demo =new Lab6Part3();
	}

	//event handler
	public void valueChanged(ListSelectionEvent l)
	{
		ta.setText(selection[list.getSelectedIndex()]);
	}
}