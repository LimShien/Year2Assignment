import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Lab7Part3 extends JFrame implements ChangeListener
{

	JLabel volLabel, balLabel;
	JSlider volume, balance;

	Lab7Part3()
	{
		super("JSlider with Listener");
		Container c = getContentPane();

		volume = new JSlider();
		volume.setMaximum(30);
		volume.setMinimum(0);
		volume.addChangeListener(this);


		balance = new JSlider();
		balance.setMaximum(5);
		balance.setMinimum(-5);
		balance.addChangeListener(this);

		volLabel = new JLabel("Volume:	" + volume.getValue());
		balLabel = new JLabel("Balance:	" + balance.getValue());


		JPanel panel = new JPanel();
		panel.add(volLabel);
		panel.add(balLabel);


		c.setLayout(new FlowLayout());
		c.add(volume);

		c.add(balance);
		c.add(panel);


		setVisible(true);
		setSize(300, 400);
	}



	public void stateChanged(ChangeEvent e)
	{
		volLabel.setText("Volume:	" + volume.getValue());
		balLabel.setText("Balance:	" + balance.getValue());
	}

	public static void main(String[] args)
	{
		Lab7Part3 demo = new Lab7Part3();
	}

}