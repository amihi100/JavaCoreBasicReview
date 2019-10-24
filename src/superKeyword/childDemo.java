package superKeyword;

public class childDemo extends parentDemo {
	
	
	
	
	//Iportant: when there is a collision between 2 variables in extends, Java will use the local one.
	//In our case it will print te childDemo name over the parentDemo name String.
	//in order to avoid that, we can use the super keyword and have access to name of parent class.
	String name = "childDemo";
	
	public childDemo() {
		super(); // this should be always first line in order to use the parent class constructor.
		System.out.println("child class constructor");
	}
	
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);	
	}
	
	public void getData() {
		System.out.println("I'm  the child class.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
