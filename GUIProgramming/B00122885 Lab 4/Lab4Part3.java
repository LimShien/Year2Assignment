import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Lab4Part3
{
	public static void main(String[] args)
	{
		//create Label
		JLabel submitLabel = new JLabel("Push the button");

		//create button
		JButton submitButton = new JButton("Push me!");

		//create panel
		JPanel submitPanel = new JPanel();
		submitPanel.add(submitLabel);
		submitPanel.add(submitButton);

		//frame
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(450, 350);
		frame.setContentPane(submitPanel);

	}
}