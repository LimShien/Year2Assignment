/**
 * @author LimShien Han B00122885
 * 
 * This class will build the main GUI  for the application 
 *  */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import exceptions.InvalidInputException;
import logging.AssignmentLogger;
import internationalization.translate;
import warningsystem.*;

public class BuildGui extends JFrame implements ActionListener{

	 Locale l_en = new Locale("en");
	 Locale l_de = new Locale("de");
	 JComboBox <String> translate_cb;
	 JLabel depth_label , cm_label,empty;
	 JButton button1;
	 JTextField input;
	 JPanel p4;
	 ResourceBundle res = new translate().getRes(l_en);
	 Warning w;
	 Container c;
	 double input_value;
	
	 

	public BuildGui() {
		//set the title of the JFrame
		setTitle(res.getString("title"));
		
		AssignmentLogger.logConstructor(this);	
		
		//set the default locale to english
		Locale.setDefault(l_en);

		
		//labelling
		depth_label = new JLabel(res.getString("label_1"));
		cm_label = new JLabel(res.getString("label_2"));
		empty = new JLabel("");
		
		//take user input
		input = new JTextField(5);
		
		//implementing inner classes
		messageHandler mh = new messageHandler();
		input.addMouseListener(mh);
		
		//button to click
	    button1 = new JButton(res.getString("button_1"));
		button1.addActionListener(this);
		
		//Combo Box for translation
		translate_cb = new JComboBox <String>();
		new methods().initialize(translate_cb, this.res);
		translate_cb.setEditable(true);
		translate_cb.setSelectedIndex(0); //the default to be "select Language"
		translate_cb.addActionListener(this);
		 
		//arrange the gui components in different JPAnel and setting the layout
		JPanel p1 = new JPanel();
		p1.add(depth_label);
		p1.add(input);
		p1.add(cm_label);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
		p2.add(p1);
		p2.add(button1);	
	
		
		JPanel p3 = new JPanel();
		p3.add(translate_cb, BorderLayout.PAGE_END );
		
		p4 = new JPanel();	
		p4.add(empty);
		
		//add into the content pane and layout a little bit
		c = getContentPane();
		
		BorderLayout bl = new BorderLayout();
		bl.setVgap(20);
		c.setLayout(bl);
		c.add(p2, BorderLayout.PAGE_START);
		c.add(p4, BorderLayout.CENTER);
		c.add(p3, BorderLayout.PAGE_END);
		
		setSize(520,300);
		setVisible(true);
		
		//close the GUI when the JFRame window is closed
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AssignmentLogger.logMethodEntry(this) ;
		
		//the button is pressed
		if(e.getSource() == button1) {
			
			try {
				//validate the input 
				input_value = new methods().validateInput(input.getText(), this.res);
				//delay for a while
				Thread.sleep(1500);
				//create the warning 
				new methods().createWarning(this.res, p4, input_value);
				
			} catch (InvalidInputException e1) {
				// TODO Auto-generated catch block
				
				//remove every component and re add the Jlabel named 'empty ' to  display error message
				p4.removeAll();
				p4.repaint();			
				p4.add(empty);
				
				//error message
				empty.setText(e1.getMessage());
			}
			//for debugging
			//System.out.println("button pressed");
			catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
		//the combo box for languages is selected
		else if(e.getSource() == translate_cb) {
				
				//set the ResourceBundle to english when "English" is selected
				if(translate_cb.getSelectedIndex() == 1) {
			
				Locale.setDefault(l_en);
				res = new translate().getRes(l_en);
				
				//for debugging
				//System.out.print("English selected");
				
				}
				//set the ResourceBundle to German when "german" is selected
				else if(translate_cb.getSelectedIndex() == 2) {
				Locale.setDefault(l_de);
				res = new translate().getRes(l_de);
				
				//for debugging
				//System.out.print("German selected");
				}
			
			//set the text for each component upon changing
			depth_label.setText(res.getString("label_1"));
			cm_label.setText(res.getString("label_2"));
			button1.setText(res.getString("button_1"));
			super.setTitle(res.getString("title"));
			
			//re-initialize the combo box  for language selection
			new methods().initialize(translate_cb, this.res);
			
			//only create warning when there is valid input
			if(input_value > 0) {
				new methods().createWarning(this.res, p4, input_value);
			}
			
		}
		
		AssignmentLogger.logMethodExit(this);
	}
	
	/**
	 * 
	 * @author lim Shien Han
	 * inner classes to deal with the mouse listener
	 */
	private class messageHandler implements MouseListener{
		@Override
		// error message prompting the user with invalid input -> will disappear when the user click or press the input field
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == input) {
				empty.setText("");
				input.setText("");
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == input) {
				empty.setText("");
				input.setText("");
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	

}
