package warningsystem;

import java.util.ResourceBundle;

import javax.swing.JPanel;

import logging.AssignmentLogger;
/**
 * 
 * @author Lim Shien Han 
 * 
 * subclasses for orange warning
 *
 */
public class OrangeWarning extends Warning {
	//initialize the values for the url and keys 
	private static String url = "src/warningsystem/images/RainOrange.png";
	private static String key1="orange_a";
	private static String key2="orange_b";
	private static String key3="orange_c";

	/**
	 * 
	 * @param r, the Resource Bundle
	 * @param display, the JPanel to build on 
	 */
	public OrangeWarning(ResourceBundle r, JPanel display)  {
		super(url, key1, key2, key3, r, display);
		AssignmentLogger.logConstructor(this);

	}
	
}
