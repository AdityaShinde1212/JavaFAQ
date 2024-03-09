package FAQ1;

import java.util.Arrays;

public class P7 {

	// Arrays . sort

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6, 7, 9, 8, 5, 2, 0 };

		Arrays.sort(a);

		System.out.println("Second largest value " + (a.length - 2));
		System.out.println("third lowset value " + a[1]);

	}

}
