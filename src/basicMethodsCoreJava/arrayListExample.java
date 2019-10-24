package basicMethodsCoreJava;
import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {

		//Collection framework of arraylist:
		ArrayList<String> a= new ArrayList();
		//We can add and delete anytime with this array, its size is dynamic. That is the main difference from array.
		//Very flexible, this is why Java programers like to use it.
		//You can access and insert any value in any index.
		//Accept duplicate objects unlike hashsets.
		a.add("Amihcai");
		a.add("Eliana");
		a.add("Hadassa");
		a.add("baby name");
		System.out.println(a);
		
		a.add(3, "Ezra");
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		System.out.println(a.contains("Eliana"));
		System.out.println(a.contains("Gaya"));
		//place of element:
		System.out.println(a.indexOf("Hadassa"));
		
		//is array empty:
		System.out.println(a.isEmpty());
		//Size of array:
		System.out.println(a.size());
		
	}

	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("hello abc");

	}

}
