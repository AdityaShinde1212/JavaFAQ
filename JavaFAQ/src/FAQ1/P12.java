package FAQ1;

public class P12 {

	// Re-arrange string in reverse manner

	public static void main(String[] args) {

		String str = "aditya Ram SHAM juice";

		String[] s = str.split("\\s");

		for (int i = s.length - 1; i >= 0; i--) {

			if (s[i].equalsIgnoreCase("sham")) {

				String text = s[i].toLowerCase();

				System.out.print(text + " ");

				continue;
			}

			System.out.print(s[i] + " ");

		}

	}

}
