package Inheritance;

/** Aliquot sum of a given number.
 * Whether the giver number is a Perfect number or not .
 * Perfect number between 1 to 100.
 * @author Hp
 *
 */
public class AliquotSum {
	public static void main(String[] args) {

		int num = 28; // Assigning value to the Integer Variable
		long aliquotSum = findAliquotSum(num); // aliquot sum

		System.out.println("Aliquot Sum of " + num + " is " + aliquotSum + ".");

		if (aliquotSum == num) { // If statement to check whether the number is perfect or not.
									
			System.out.println("\n" + num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}

		System.out.println("\nPerfect Numbers between 1 to 100 are:");
		
		for (int i = 1; i <= 100; i++) { // initializing the number between 1 to 100.
			num = i;
			if (findAliquotSum(i) == num) { // Check the perfect numbers between 1 to 100.
											
				System.out.print(num + ","); // prints the result
			}
		}
	}

	public static long findAliquotSum(int n) { // Creating another method to
												// find the aliquot sum.
		long result = 0;

		for (byte i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				result += i;
			}
		}
		return result;
	}

}
