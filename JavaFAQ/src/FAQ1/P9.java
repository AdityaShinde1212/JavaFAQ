package FAQ1;

public class P9 {

	// Duplicates in String

	public static void main(String[] args) {

		String a = "aaaaslkjjljfkkkhhhooo";

		char[] ar = a.toCharArray();

		for (int i = 0; i <= ar.length - 1; i++) {

			for (int j = i + 1; j <= ar.length - 1; j++) {

				if (ar[i] == ar[j]) {

					System.out.println(ar[j]);
				}

			}
		}

	}

}
