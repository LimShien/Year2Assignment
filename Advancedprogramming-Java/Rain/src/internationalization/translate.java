/**
 * @author LimShien Han B00122885
 *
 * This class will run the internalization for the application
 *  */
package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

import logging.AssignmentLogger;


public class translate {

       /**
        * this method will return the resource bundle based on the language selected by user.
        * @param l the locale 
        * @return the Resource Bundle 
        */
        public ResourceBundle getRes(Locale l) {
        	AssignmentLogger.logMethodEntry(this); 

            ResourceBundle res =  null;
            	try {

					if (l.equals(new Locale("en"))) {
		
						res = ResourceBundle.getBundle("internationalization.ProgramProperties_en");
					} else if (l.equals(new Locale("de"))) {
						res = ResourceBundle.getBundle("internationalization.ProgramProperties_de");
					}
            	}catch(Exception e) {
            		e.printStackTrace();
            		System.out.print("error occurred while opening the property files");
            	}
            AssignmentLogger.logMethodExit(this); 
            return res;
        }

}
