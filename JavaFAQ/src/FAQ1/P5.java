package FAQ1;

public class P5 {

	
	//Bubble Sort
	
	public static void main(String[] args) {
		
		
		int[] a = { 1, 11, 23, 45, 86, 47, 21, 94, 101, 0, 13 };

		int temp = 0;

		outerloop: for (int i = 0; i <= a.length - 1; i++) {

			innerloop: for (int j = i + 1; j <= a.length - 1; j++) {

				if (a[i] > a[j]) { //asc always right 

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

			System.out.println(a[i]);
		}
		
		
	}
	
	
}
