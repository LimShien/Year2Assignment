public class Lab2Part5
{
	public static void main(String[] args)
	{

		String[] arr = {"Van","Truck","Van","Bus","Car","Motorbike","Car","Bus","Van","Truck"};
		outputTotalTolls(arr);

	}//main end

	//method 1
	public static double getVehicleCharge(String type)
	{
		double charge = 0;

		if(type == "Motorbike")
		{
			charge = 0.1;
		}
		else if(type == "Car")
		{
			charge = 0.2;
		}
		else if(type == "Van")
		{
			charge = 0.3;
		}
		else if(type == "Bus")
		{
			charge = 0.5;
		}
		else if(type == "Truck")
		{
			charge = 1;
		}
		else
		{
			charge = 2; //incase any other type of vehicle
		}

		return charge;
	}//method 1 end

	//method 2
	public static void outputTotalTolls(String[] vehicle)
	{
		double total = 0;
		for(String x : vehicle) //for each element in array
		{

			total += getVehicleCharge(x);
		}

		System.out.printf("%.2f" + " euro" ,total);
	}//method 2 end
}