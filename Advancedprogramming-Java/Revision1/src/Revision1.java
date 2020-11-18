import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Revision1 {
	public static void main(String [] args) {
	
		Logger lo = Logger.getLogger(Revision1.class.getName());
		FileHandler fileLog;
		try {
			fileLog = new FileHandler("logFile.log"); 		//log the details into a file named logFile
			lo.addHandler(fileLog);		
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		int[] arr = new int[3];
		
		try {
			arr[3] = 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			
			lo.log(Level.WARNING, e.getMessage());
		}
	}
}
