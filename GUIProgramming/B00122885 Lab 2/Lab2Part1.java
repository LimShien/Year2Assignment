public class Lab2Part1
{
	public static void main(String[] args)
	{
		checkAge(20); //Part 1


	}//main

	//Part 1
	public static void checkAge(int age)
	{
		//actual age
		final int actual = 18;

		//output message decision
		if(age < actual)
		{
			System.out.println(age + " less than " + actual );
		}
		else if(age == actual)
		{
			System.out.println(age + " equals to " + actual );
		}
		else
		{
			System.out.println(age + " greater than "+ actual );
		}

	}//checkAge method

}