import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class Lab7Part4 extends JFrame implements ActionListener,ItemListener
{
	Icon img1 = new ImageIcon("4.jpg");
	Icon img2 = new ImageIcon("3.jpg");
	Icon img3 = new ImageIcon("2.jpg");
	Icon img4 = new ImageIcon("1.jpg");

	JCheckBox check, check2;

	JRadioButton radio,radio2,radio3,radio4,radio5,radio6, radio7, radio8, radio9;

	String resultQ1 = "", resultQ2 = "";

	JLabel labelQ1 = new JLabel();
	JLabel labelQ2 = new JLabel();
	JLabel labelQ3 = new JLabel();

	JPanel displayPanel, q1 = buildFirstSurvey(), q2 = buildSecondSurvey(), q3 = buildThirdSurvey();


	Icon resultQ3;


	Lab7Part4()
	{
		super("Survey GUI");

		Container c = getContentPane();

		displayPanel = new JPanel();
		displayPanel.setLayout(new CardLayout());
		displayPanel.add(q1);
		displayPanel.add(q2);
		displayPanel.add(q3);

			JPanel q4= new JPanel();
			JLabel label = new JLabel("Survey Result");


				q4.setLayout(new GridLayout(4,1));

				q4.add(label);

				q4.add(labelQ1);
				q4.add(labelQ2);
				q4.add(labelQ3);

		displayPanel.add(q4);




		c.add(displayPanel);
		setVisible(true);
		setSize(300, 400);
	}

	//first panel to be added to the card
	public JPanel buildFirstSurvey()
	{
		JPanel panel = new JPanel();

		JLabel label = new JLabel("Question 1");

		JLabel label2 = new JLabel("Are you a human");

		JPanel panel_label = new JPanel();
		panel_label.add(label);
		panel_label.add(label2);

		 check = new JCheckBox("YES");
		 check2 = new JCheckBox("MAYBE");

		//item listener --> event handler
		check.addItemListener(this);
		check2.addItemListener(this);

		//restrict selection
		ButtonGroup bg = new ButtonGroup();
		bg.add(check);
		bg.add(check2);


		JPanel buttonPanel = new JPanel();
		buttonPanel.add(check);
		buttonPanel.add(check2);

			//Jbutton and panel to navigate between Pages
			JButton next = new JButton("Next");
			next.addActionListener(this);

			JPanel nav = new JPanel();
			nav.add(next);


		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(panel_label);
		panel.add(buttonPanel);
		panel.add(nav);


		return panel;
	}

		//Second panel to be added to the card
		public JPanel buildSecondSurvey()
		{
			JPanel panel = new JPanel();

			JLabel label = new JLabel("Question 2");

			JLabel label2 = new JLabel("Choose your character");

			JPanel panel_label =  new JPanel();
			panel_label.add(label);
			panel_label.add(label2);

			 radio = new JRadioButton("IRONMAN");

			 radio2 = new JRadioButton("SPIDERMAN");

			 radio3 = new JRadioButton("THOR");

			 radio4 = new JRadioButton("DRSTRANGE");

			 radio5 = new JRadioButton("CAPTAIN");

			//item listener
			radio.addItemListener(this);
			radio2.addItemListener(this);
			radio3.addItemListener(this);
			radio4.addItemListener(this);
			radio5.addItemListener(this);

			//use buttongroup to restrict
			ButtonGroup bg = new ButtonGroup();
			bg.add(radio);
			bg.add(radio2);
			bg.add(radio3);
			bg.add(radio4);
			bg.add(radio5);



			//panel to organize button
			JPanel panel2 = new JPanel();
			panel2.setLayout(new FlowLayout());
			panel2.add(radio);
			panel2.add(radio2);
			panel2.add(radio3);
			panel2.add(radio4);
			panel2.add(radio5);

			//Jbutton and panel to navigate between Pages
			JButton previous = new JButton("Previous");
			previous.addActionListener(this);

			JButton next = new JButton("Next");
			next.addActionListener(this);

			JPanel nav = new JPanel();
			nav.add(previous);
			nav.add(next);




			panel.setLayout(new GridLayout(4,1));
			panel.add(panel_label);
			panel.add(panel2);
			panel.add(nav);

			return panel;
	}

	//Third panel to be added to the card
	public JPanel buildThirdSurvey()
	{
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Question 3");
		JLabel label2 = new JLabel("Choose your superpower element");



		//JRadioButton Constructor
		 radio6 = new JRadioButton("1", img1);

		 radio7 = new JRadioButton("2", img2);

		 radio8 = new JRadioButton("3", img3);

		 radio9 = new JRadioButton("4", img4);

		//item listener
		radio6.addItemListener(this);
		radio7.addItemListener(this);
		radio8.addItemListener(this);
		radio9.addItemListener(this);

		//buttongroup to restrict
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(radio6);
		bg2.add(radio7);
		bg2.add(radio8);
		bg2.add(radio9);

		//JPanel to organize
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(2,2));
		radioPanel.add(radio6);
		radioPanel.add(radio7);
		radioPanel.add(radio8);
		radioPanel.add(radio9);



		//Jbutton and panel to navigate between Pages
		JButton previous = new JButton("Previous");
		previous.addActionListener(this);

		JButton next = new JButton("Next");
		next.addActionListener(this);

		JPanel nav = new JPanel();
		nav.add(previous);
		nav.add(next);

		panel.add(label);
		panel.add(label2);
		panel.add(radioPanel);
		panel.add(nav);

		return panel;

	}



	public void actionPerformed(ActionEvent e)
	{
		CardLayout c = (CardLayout)displayPanel.getLayout();

		if(e.getActionCommand() == ("Previous"))
		{
			c.previous(displayPanel);
		}
		else if (e.getActionCommand() == ("Next"))
		{
			c.next(displayPanel);
		}
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable() == check)
		{
				resultQ1 = "Yes";
		}

		else if (e.getItemSelectable() == check2)
		{
				resultQ1 = "Maybe";
		}

		else if(e.getItemSelectable() == radio)
		{
			resultQ2 = "IRONMAN";
		}
		else if(e.getItemSelectable() == radio2)
		{
			resultQ2 = "SPIDERMAN";
		}
		else if(e.getItemSelectable() == radio3)
		{
			resultQ2 = "THOR" ;
		}
		else if(e.getItemSelectable() == radio4)
		{
			resultQ2 = "DRSTRANGE";
		}
		else if(e.getItemSelectable() == radio5)
		{
			resultQ2 = "CAPTAIN";
		}
		else if(e.getItemSelectable() == radio6)
		{
			resultQ3 = img1;
		}
		else if(e.getItemSelectable() == radio7)
		{
			resultQ3 = img2;
		}
		else if(e.getItemSelectable() == radio8)
		{
			resultQ3 = img3;
		}
		else if(e.getItemSelectable() == radio9)
		{
			resultQ3 = img4;
		}

		labelQ1.setText("Q1: Are u a human? " + resultQ1);
		labelQ2.setText("Q2: favouite character: " + resultQ2);

		labelQ3.setText("Q3: your superpower: ");
		labelQ3.setIcon(resultQ3);
		labelQ3.setHorizontalTextPosition(JLabel.LEFT);
	}

	public static void main(String[] args)
	{
		Lab7Part4 demo = new Lab7Part4();
	}

}