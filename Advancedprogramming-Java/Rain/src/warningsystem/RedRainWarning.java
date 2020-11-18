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
public class RedRainWarning extends Warning {
	//initialize the values for the url and keys 
	private static String url = "src/warningsystem/images/RainRed.png";
	private static String key1="red_a";
	private static String key2="red_b";
	private static String key3="red_c";
	
	/**
	 * 
	 * @param r, the Resource Bundle
	 * @param display, the JPanel to build on 
	 */
	public RedRainWarning(ResourceBundle r, JPanel display)  {
		super(url, key1, key2, key3, r, display);
		AssignmentLogger.logConstructor(this);

	}
	
}
