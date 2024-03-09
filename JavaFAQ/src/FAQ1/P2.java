package FAQ1;

import java.util.Arrays;

public class P2 {

	
	public static void main(String[] args) {
		
		//Validate given arrays are equal or not 
		
		int [] a = {1,2,3,4};
		int [] b = {2,3,5,4};
		int [] c = {1,2,3,4};
		
		boolean check1 = Arrays.equals(a, b);
		boolean check2 = Arrays.equals(b, c);
		boolean check3 = Arrays.equals(a, c);
		
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(check3);
		
	}
	
}
