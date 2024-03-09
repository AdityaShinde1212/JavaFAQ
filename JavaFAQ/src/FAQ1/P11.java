package FAQ1;

import java.util.HashMap;
import java.util.Set;

public class P11 {

	public static void main(String[] args) {

		String[] ar = { "Aditya", "Java", "SDET", "Aditya", "Java", "Aditya", "Java", "Aditya", "SDET", "SDET",
				"Testng" };

		HashMap<String, Integer> smap = new HashMap();

		for (String name : ar) {

			if (smap.containsKey(name)) {

				smap.put(name, smap.get(name) + 1);
			} else {

				smap.put(name, 1);
			}

		}

		Set<String> keys = smap.keySet();

		System.out.println(keys);

		for (String key : keys) {

			if (smap.get(key) > 1) {

				System.out.println(key + " : " + smap.get(key));
			}

		}

	}

}
