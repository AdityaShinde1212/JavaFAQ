package FAQ1;

public class P4 {

	public static void main(String[] args) {

		// find second largest element in array

		int[] a = { 1, 11, 23, 45, 86, 47, 21, 94, 101, 0, 13 };

		int temp = 0;

		outerloop: for (int i = 0; i <= a.length - 1; i++) {

			innerloop: for (int j = i + 1; j <= a.length - 1; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println("Second largest number " + a[1]);

	}

}
