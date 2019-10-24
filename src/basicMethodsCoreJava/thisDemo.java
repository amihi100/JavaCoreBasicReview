package basicMethodsCoreJava;

public class thisDemo {

	int a=2;
	public void getData() {
		System.out.println("int of function:");
		int a=3;
		
		System.out.println(a);
		System.out.println("This is the class level print because of this.a:");
		System.out.println(this.a);
		int b = a +this.a;
		System.out.println("This is sum of: int a function + int a local class:");
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo cd = new thisDemo();
		cd.getData();
	}
}
