import javax.swing.*;
import java.awt.*;

public class Lab8Part1 extends JFrame
{

	Lab8Part1()
	{
		super("Simple single internal frame");
		Container c = getContentPane();

			//internal frame here
			JDesktopPane desktop = new JDesktopPane();
			//create internal frame
			JInternalFrame frame =  new JInternalFrame("Internal Window",
														true, //resizable
														true, //closable
														true, //maximizable
														true);//iconifiable
			JPanel panel = new JPanel();
			JButton button = new JButton("Button in Internal Frame");
			JLabel label = new JLabel("Label in Internal FRame");
			panel.add(label);
			panel.add(button);

			frame.add(panel);

			frame.setSize(200, 300);
			frame.setVisible(true);
        desktop.add(frame);

		setContentPane(desktop);



		setVisible(true);
		setSize(300,400);
	}

	public static void main(String [] args)
	{
		Lab8Part1 demo = new Lab8Part1();
	}
}
