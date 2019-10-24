package basicMethodsCoreJava;

public class dontForgetToBreak {

	public static void placeOfNum(int [] arr,int num){
		for(int i = 0; i<arr.length-1; i++) {
			if(num == arr[i]) {
				System.out.println("place: "+ i);
				//Dont forget to break when found / do
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,8,6,2,6,3,7,25,627,14,72};
		placeOfNum(arr,627);
		



	}

}
