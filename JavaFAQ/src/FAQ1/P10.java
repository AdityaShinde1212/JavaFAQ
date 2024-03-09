package FAQ1;

import java.util.HashMap;
import java.util.Set;

public class P10 {

	// Find duplicates in string using Collection and Map

	public static void main(String[] args) {

		// String a = "aadadatrrljlssskkk";

		String a = "addrrrbdabcacbccbaaac";

		char[] ar = a.toCharArray();

		HashMap<Character, Integer> smap = new HashMap<Character, Integer>();

		for (char str1 : ar) {

			if (smap.containsKey(str1)) {

				smap.put(str1, smap.get(str1) + 1);
			} else {

				smap.put(str1, 1);
			}

		}

		Set<Character> keys = smap.keySet();

		System.out.println(keys);

		for (char key : keys) {

			if (smap.get(key) > 1) {

				System.out.println(key + " : " + smap.get(key));

			}
		}

	}

}
