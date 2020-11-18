import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Lab6Part4 extends JFrame implements ActionListener
{

	int bal = 0;

	JLabel balance, notice;

	Lab6Part4()
	{
		super("mobile top up");

		Container c = getContentPane();


		//button
		JButton topup = new JButton("Top-up");
			topup.setBackground(Color.ORANGE);

		JButton call = new JButton("Make-call");
			call.setBackground(Color.ORANGE);

		JButton send = new JButton ("Send-text");
			send.setBackground(Color.ORANGE);


		//action listener
		topup.addActionListener(this);

		call.addActionListener(this);

		send.addActionListener(this);

		//Label for balance
		JLabel label = new JLabel("Balance:");
		//store the  balance in a string  --> no constructor for int
		 balance = new JLabel(Integer.toString(bal));

		 notice = new JLabel();
		 notice.setForeground(Color.red);



		//Label for guidance
		JLabel guide1 = new JLabel("ADD 5 credits");
		JLabel guide2 = new JLabel("CONSUME 3 credits");
		JLabel guide3 = new JLabel("CONSUME 2 credits");


		//Panel
		JPanel panelGuide = new JPanel();
		JPanel panelButton = new JPanel();
		JPanel panelBalance = new JPanel();

		panelGuide.setLayout(new GridLayout(3,1,0,0));
		panelGuide.setBackground(Color.lightGray);
		panelGuide.add(guide1);
		panelGuide.add(guide2);
		panelGuide.add(guide3);


		panelButton.setLayout(new GridLayout(3,1,0,10));
		panelButton.setBackground(Color.darkGray);
		panelButton.add(topup);
		panelButton.add(call);
		panelButton.add(send);

		panelBalance.setLayout(new GridLayout(6,1,0,-100));
		panelBalance.setBackground(Color.lightGray);
		panelBalance.add(label);
		panelBalance.add(balance);
		panelBalance.add(notice);


		//content pane layout
		c.setLayout(new GridLayout(1,3,40,0));
		c.setBackground(Color.darkGray);
		c.add(panelGuide);
		c.add(panelButton);
		c.add(panelBalance);

		setSize(450,300);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Lab6Part4 demo = new Lab6Part4();
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getActionCommand();

		if(e.getActionCommand().equals("Top-up") && bal >= 0)
		{
			bal += 5;
		}
		else if(source.equals("Make-call") && bal >= 3)
		{
			bal += -3;
		}
		else if(source.equals("Send-text") && bal >= 2)
		{
			bal += -2;
		}
		//balance cannot go lower than 0
		else if((source.equals("Send-text") && bal < 2) ||(source.equals("Make-call") && bal < 3) )
		{
			notice.setText("Please TopUp");
		}
		//notice gone if top up-ed
		if(bal>3)
		{
			notice.setText("");
		}

		balance.setText(Integer.toString(bal));

	}
}