package warningsystem;

import java.util.ResourceBundle;

import javax.swing.JPanel;

import logging.AssignmentLogger;
/**
 * 
 * @author Lim Shien Han 
 * 
 * subclasses for yellow warning
 *
 */
public class YellowWarning extends Warning {
	//initialize the values for the url and keys 
	private static String url = "src/warningsystem/images/RainYellow.png";
	private static String key1="yellow_a";
	private static String key2="yellow_b";
	private static String key3="yellow_c";

	/**
	 * 
	 * @param r, the Resource Bundle
	 * @param display, the JPanel to build on 
	 */
	public YellowWarning(ResourceBundle r, JPanel display)  {
		super(url, key1, key2, key3, r, display);
		AssignmentLogger.logConstructor(this);

	}
	
}
