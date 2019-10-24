package basicMethodsCoreJava;

public class constructorDemo {

	//will not return values 
	//name of constructor should be only class name:
	// who ever create that class, automatically runs the constructor method.
	
	
	//will not return values 
	//Default constructor:
	public constructorDemo()
	{
		System.out.println("Im in the consturctor");
	}
	
	//will not return values 
	//Parameterized constructor:
	public constructorDemo(int a, int b) 
	{
		System.out.println("Im the paramerterizd consturctor");
	}
	
	//will not return values 
	public constructorDemo(String str) 
	{
		System.out.println("constructorDemo of String has been called");
	}
	
	
	public void getdata() 
	{
		System.out.println("I am the method");
	}
	
	//public void fet
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the constructor block if it defined.
		System.out.println("constructorDemo:");
		constructorDemo cd = new constructorDemo();
		System.out.println("Paramerterizd consturctor:");
		constructorDemo cp = new constructorDemo(5, 6);
		constructorDemo str = new constructorDemo("test");
		//Compiler will call implicit constructor if we have not defined constructor block.
		//Whenever you create an object constructor is called, all variable will be initialized.
		//block of code whenever constructor is called.

	}

}
