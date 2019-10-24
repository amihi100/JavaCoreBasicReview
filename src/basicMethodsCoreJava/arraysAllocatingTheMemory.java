package basicMethodsCoreJava;

public class arraysAllocatingTheMemory {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Declare array and allocating memory to values.
		int a [] = new int [5];
		a[0] = 9;
		a[1] = 8;
		a[2] = 7;
		a[3] = 6;
		a[4] = 5;

		//Allocating the memory and directly posing the values:
		//Dynemic creating array by amount inserting.
		int b[] = {24,4252,525,52};	
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

		
	}

}
