/**
 * 
 * @author limshienhan
 *
 */
public class SportClassifier {

	
	enum Sports{
		SOCCER,RUGBY,BASKETBALL;
	}
	
	/**
	 * 
	 * @param The type of sport to be passed
	 * @return The venue for the sport that is passed as argument
	 */
	public static String getFamousSportVenue(Sports s) {
		String z = "";
		if(s == Sports.BASKETBALL) {
			z= "Carrier Dome";
		}
		else if(s == Sports.RUGBY) {
			z= "FNB Stadium";
		}
		else if(s == Sports.SOCCER){
			z= "Camp Nou";
		}
		
		return z;
	}
	
	
	/**
	 * 
	 * testing the method
	 */
	public static void main(String[] args) {
		
		System.out.println(getFamousSportVenue(Sports.BASKETBALL));
		System.out.println(getFamousSportVenue(Sports.RUGBY));
		System.out.println(getFamousSportVenue(Sports.SOCCER));
	}
}
