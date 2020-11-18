import java.util.Arrays;
public class Lab2Part3
{
	public static void main(String[] args)
	{
		char[] name = "Lim Shien Han".toCharArray(); // convert to char array

		System.out.println(calculateMyNameCharacterValue(name));

	}//main end


	public static int calculateMyNameCharacterValue(char[] arr)
	{
		int total = 0;
		for(int i = 0; i < arr.length; i++)
		{

			int x = arr[i] + 0; //return numeric value

			total += x ; //update total

		}
		return total;

	}//method end


}