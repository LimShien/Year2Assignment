import javax.swing.*;
import java.awt.*;

class Lab9Part2 extends JFrame
{
	Lab9Part2()
	{
		super("Build a Basic Menu");
		Container c = getContentPane();

		//create a menubar
		JMenuBar mb = new JMenuBar();

		JMenu Fmenu = new JMenu("Functions",false);
		JMenu Lmenu = new JMenu("Languages",false);

		//create menu item
		JMenuItem rename = new JMenuItem("Rename");
		JMenuItem delete = new JMenuItem("Delete");

		Icon pic1 = new ImageIcon("pic1.jpg");
		Icon pic2 = new ImageIcon("pic2.png");

		JMenuItem korean = new JMenuItem("Korean", pic1);
		JMenuItem spanish = new JMenuItem("Spanish",pic2);

		//add menuitem into menu
		Fmenu.add(rename);
		Fmenu.add(delete);

		Lmenu.add(korean);
		Lmenu.add(spanish);


		//add Fmenu and Lmenu into menubar
		mb.add(Fmenu);
		mb.add(Lmenu);

		//add  menubar into frame
		setJMenuBar(mb);

		setVisible(true);
		setSize(300, 300);
	}

	public static void main(String [] args)
	{
		Lab9Part2 demo = new Lab9Part2();
	}
}