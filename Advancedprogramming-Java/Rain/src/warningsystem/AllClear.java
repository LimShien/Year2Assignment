package warningsystem;

import java.util.ResourceBundle;

import javax.swing.JPanel;

import logging.AssignmentLogger;
/**
 * 
 * @author Lim Shien Han 
 * 
 * subclasses for All Clear
 *
 */
public class AllClear extends Warning {
	//initialize the values for the url and keys 
	private static String url = "src/warningsystem/images/AllClear.png";
	private static String key1="clear_a";
	private static String key2="clear_b";
	private static String key3="clear_c";

	/**
	 * 
	 * @param r, the Resource Bundle
	 * @param display, the JPanel to build on 
	 */
	public AllClear(ResourceBundle r, JPanel display)  {
		super(url, key1, key2, key3, r, display);
		AssignmentLogger.logConstructor(this);

	}
	
}
