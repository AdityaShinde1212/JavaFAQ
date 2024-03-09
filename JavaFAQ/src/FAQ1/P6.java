package FAQ1;

import java.util.ArrayList;
import java.util.TreeSet;

public class P6 {

	// sort an array using collection Framework

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6, 7, 9, 8, 5, 2, 0 };

		TreeSet tr = new TreeSet();

		for (int num : a) {

			tr.add(num);

		}

		ArrayList<Integer> ar = new ArrayList<Integer>(tr);

		System.out.println("Second larget number " + ar.get(ar.size() - 2));

		System.out.println("Second lowest number " + ar.get(1));

	}

}
