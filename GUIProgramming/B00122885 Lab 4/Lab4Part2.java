import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Lab4Part2
{
	public static void main(String [] args)
	{
		//create frame  & set Title
		JFrame frame = new JFrame("My Label Frame");
		frame.setSize(450, 350);
		frame.setVisible(true);

		//create JLabel
		JLabel myNameLabel = new JLabel("Lim Shien Han");

		JLabel myAgeLabel = new JLabel("19");

		//create JPanel
		JPanel labelPanel = new JPanel();

		//add label to the panel
		labelPanel.add(myNameLabel);
		labelPanel.add(myAgeLabel);

		//add panel to content pane
		frame.setContentPane(labelPanel);
	}
}