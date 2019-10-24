package basicMethodsCoreJava;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class multiDemsionalArrayMatrix {
	
	
	//Print all numbers of matrix:
	public static void printMatNum(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ "," );
			}
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int [3][3];
		a[0][0] = 0;
		a[0][1] = 1;
		a[0][2] = 2;
		
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		
		a[2][0] = 6;
		a[2][1] = 7;
		a[2][2] = 8;
		
		int b[][] = {{0,1,2},{3,4,5},{6,7,8}};
		
		printMatNum(a);
		printMatNum(b);
	
	}

}
