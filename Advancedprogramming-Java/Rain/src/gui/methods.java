package gui;

import java.util.ResourceBundle;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import exceptions.InvalidInputException;
import logging.AssignmentLogger;
import warningsystem.AllClear;
import warningsystem.OrangeWarning;
import warningsystem.RedRainWarning;
import warningsystem.YellowWarning;

/**
 * 
 * @author Lim Shien Han
 * 
 * this class contains the methods used in BuildGui class
 *
 */
public class methods {

	/**
	 * this method will check the input if it is a double which is greater than 0
	 * exception will be thrown if the input is invalid
	 * 
	 * @param s the string input from user
	 * @param r resource bundle -> for internationalization purposes
	 * @return return the value in double format 
	 * @throws InvalidInputException when the value invalid. eg: empty, negative or alphabet 
	 */
	public double validateInput(String s ,ResourceBundle r) throws InvalidInputException {
		AssignmentLogger.logMethodEntry(this) ;
		try {
			//try to convert the input into a double
			double i = Double.parseDouble(s);
			
			if(i <= 0 ) {
				 //throw new exception
				throw new InvalidInputException(r.getString("warning_1") + ":" + i + " "+ r.getString("warning_1b"));
			}else {
				AssignmentLogger.logMethodExit(this);
				return i;
			}
		
		}catch(NumberFormatException e) {
			
			//exception is thrown when the input is not a double
			throw new InvalidInputException(r.getString("warning_1") + r.getString("warning_1c"));
		}
	}
	
	/**
	 * this method initialize the value in comboBox for language selection 
	 * this method is called each time the language changes
	 * 
	 * @param translate_cb the combo box containing selection for languages
	 * @param res resource bundle -> for internationalization purposes
	 */
	public void initialize(JComboBox translate_cb, ResourceBundle res) {
		AssignmentLogger.logMethodEntry(this) ;
		if(translate_cb.getItemAt(0) == null) {			
			translate_cb.addItem(res.getString("combo_0"));
			translate_cb.addItem(res.getString("combo_1"));
			translate_cb.addItem(res.getString("combo_2"));
		}else{
			translate_cb.removeAllItems();
			translate_cb.addItem(res.getString("combo_0"));
			translate_cb.addItem(res.getString("combo_1"));
			translate_cb.addItem(res.getString("combo_2"));
		}
		AssignmentLogger.logMethodExit(this);
	}
	
	/**
	 * this method will check the input value and create corresponding warning
	 * 
	 * @param res resource bundle -> for internationalization purposes
	 * 	@param p the panel component that build the warning messages
	 * @param i the input value
	 */
	public void createWarning(ResourceBundle res, JPanel p, double i) {
		AssignmentLogger.logMethodEntry(this) ;
		
		//clear all the component after a new input is entered
		p.revalidate();
		p.removeAll();
		
		if(i < 3.0) {
			new AllClear(res,p);
		}
		else if (i >= 3.0 && i < 5.0) {
			new YellowWarning(res,p);			
		}
		else if (i >= 5.0 && i < 7.0) {
			new OrangeWarning(res,p);
		}
		else {
			new RedRainWarning(res,p);
		}
		AssignmentLogger.logMethodExit(this);
	}


}
