package FAQ1;

public class P3 {

	public static void main(String[] args) {

		// ArmStrong Number
		// 153 = 1*1*1 = 1 , 5*5*5 = 125 , 3*3*3 = 27 , 1+125+27 = 153

		int number = 371;
		int temp = number;
		int reminder = 0;
		int result = 0;

		while (temp != 0) {

			reminder = temp % 10;
			result = result + (reminder * reminder * reminder);
			temp = temp / 10;
		}

		if (result == number) {

			System.out.println("Given number " + number + " is an Armstrong Number");
		} else {

			System.out.println("Given number" + number + "is not an Armstrong Number");
		}
	}

}
