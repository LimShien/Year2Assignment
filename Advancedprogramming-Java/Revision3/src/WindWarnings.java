
public class WindWarnings {

	public final static int YELLOW_WIND_WARNING_MIN = 50;
	public final static int ORANGE_WIND_WARNING_MIN = 65;
	public final static int RED_WIND_WARNING_MIN = 80;
	
	public static String getTodaysWindWarning(int todayWindSpeed){
		String x = "";
		
		if(todayWindSpeed >= YELLOW_WIND_WARNING_MIN && todayWindSpeed < ORANGE_WIND_WARNING_MIN) {
			x = "Yellow Warning";
		}
		else if(todayWindSpeed >= ORANGE_WIND_WARNING_MIN && todayWindSpeed < RED_WIND_WARNING_MIN) {
			x = "Orange Warning";
		}
		else if(todayWindSpeed >= RED_WIND_WARNING_MIN ) {
			x = "Red Warning";
		}
		
		return x;
	}
}
