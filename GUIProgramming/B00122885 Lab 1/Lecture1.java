import java.util.Arrays;
public class Lecture1{

	//alphabet shift for part 5
	final static int shift_0= 0;
	final static int shift_left = -3;
	final static int shift_right = 35;

	public static void main(String[] args){


		//Part 1 - Basic array
		//create an array with CHAR type
		char [] arr = new char[13];

		//fill in array with LIM SHIEN HAN
	 	arr[0] = 'L';
	 	arr[1] = 'I';
	 	arr[2] = 'M';
	 	arr[3] = ' ';
	 	arr[4] = 'S';
	 	arr[5] = 'H';
	 	arr[6] = 'I';
	 	arr[7] = 'E';
	 	arr[8] = 'N';
	 	arr[9] = ' ';
	 	arr[10] = 'H';
	 	arr[11] = 'A';
	 	arr[12] = 'N';

		//print out the array - to check
		for(char x : arr){

			System.out.print(x);

		};

		System.out.println();


		//Part 2
		//create an array with INT type
		int[] intArr = {12,10,2000};


		//print out the array - to check
		for(int z : intArr){

			System.out.print(z + " ");

		};

		System.out.println();


		//Part 3
		//create an array with DOUBLE type
		//resources- https://www.met.ie/weather-forecast/dublin-city
		double [] rainArr = {1.8, 0.1 ,0.4 , 0.1, 1.6, 3.2, 1.4, 5.1, 7.7, 6.5 };

		//print out the array
		for(int i = 0; i < rainArr.length; i++){

			System.out.println("Day " + (i+1) + ": " + rainArr[i] + "mm");
		}

		System.out.println();


		//Part 4
		//create an array with DOUBLE type
		double[][] tdArr = {{1.8,16,12},
							{0.1,15,19},
							{0.3,14,22},
							{0.1,13,20},
							{1.6,12,5},
							{3.2,12,12},
							{1.4,12,20},
							{5.1,12,22},
							{7.7,11,24},
							{6.5,11,29}};

		//print out the array
		for(int i = 0; i < tdArr.length; i++){

			System.out.print("Day " + (i+1) + ": " );

			//inner loop j<1 -> to assign different unit
			for(int j=0; j < 1; j++){

				System.out.print(tdArr[i][j] + "mm" +"\t" + tdArr[i][j+1] + "C"+"\t"+ tdArr[i][j+2] + "kmh");
			}
			System.out.println();

		}

		System.out.println();



		//Part 5
		//create alpha shift array A-Z
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alArr = alpha.toCharArray();


		//return the decoded message using method "coded"
		//shift = 0
		char [] deArr = coded(shift_0, alArr, 0,1,2,3,4);

		for(char al : deArr){

			System.out.print(al);
		}

		System.out.println();


		//shift = -3
		char [] deArr2 = coded(shift_left, alArr, 0,1,2,3,4);

		for(char al : deArr2){

			System.out.print(al);
		}

		System.out.println();


		//shift = 35
		char [] deArr3 = coded(shift_right, alArr, 0,1,2,3,4);

		for(char al : deArr3){

			System.out.print(al);
		}

		System.out.println();


	}//main



	//a method that takes in the shift (-26 <= x <= 50) , alpha array and the coded message to return the decoded message
	public static char[] coded(int shift, char[] arr,int... index){

		//create an array with length of coded message
		char [] newArr = new char[index.length];

		//change the value of the shift
		for(int i = 0; i< index.length; i++){

			int position = index[i]+shift; //the shifted index

			//to modify the the shift that ranged between -26 to 50
			if (position >= 25 && position <= 50){

				position = position - 25; //this will not work if the shift >50

			}else if (position < 0 && position >= -26){

				position = position + 26; //this will not work if the shift < -26

			}


			//index of input array add into new array
			newArr[i] = arr[position];
		}

		return newArr;

	}//coded method

}//class