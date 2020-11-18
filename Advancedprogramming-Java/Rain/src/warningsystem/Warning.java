package warningsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ResourceBundle;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logging.AssignmentLogger;

/***
 * 
 * @author Lim Shein HAn
 * 
 *         this is the base class for the warnings it builds a JPanel which
 *         displays the warning based on the guidelines
 *
 */
public class Warning {

	/**
	 * 
	 * @param url     the String to the image
	 * @param key1    the message /string to be displayed
	 * @param key2    the message /string to be displayed
	 * @param key3    the message /string to be displayed
	 * @param r       The resourcebundle
	 * @param display the JPanel(display) where this class is going to build on
	 */
	public Warning(String url, String key1, String key2, String key3, ResourceBundle r, JPanel display) {
		AssignmentLogger.logConstructor(this);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.setLayout(new GridLayout(3, 1));

		try {
			// retrieve the string / value form the properties file (internationalization)
			p1.add(new JLabel(r.getString(key1)));
			p1.add(new JLabel(r.getString(key2)));
			p1.add(new JLabel(r.getString(key3)));

			p1.setPreferredSize(new Dimension(350, 180));

			// import the image
			JLabel l1 = new JLabel(new ImageIcon(url));

			l1.setPreferredSize(new Dimension(110, 110));
			p2.add(l1, BorderLayout.CENTER);

			// create a background color for the output
			p1.setBackground(Color.LIGHT_GRAY);
			p2.setBackground(Color.LIGHT_GRAY);

			display.setLayout(new BoxLayout(display, BoxLayout.X_AXIS));
			display.add(p1);
			display.add(p2);

		} catch (Exception e) {
			System.out.print(e.getMessage());
			e.printStackTrace();
		}

	}

}
