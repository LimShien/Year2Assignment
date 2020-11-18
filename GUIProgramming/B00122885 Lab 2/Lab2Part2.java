public class Lab2Part2
{
	public static void main(String[] args)
	{
		System.out.println(canVote(17));
		System.out.println(canVote(20));

	}//main

	//Part 2
	public static boolean canVote(int age)
	{
		if(age >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}

	}//canVote method

}