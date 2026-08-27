import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Create Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		// Read float value from user and assign it to floatVariable
		float floatVariable = scanner.nextFloat();

		// Divide the float variable by 2 and round down the result
		// Here you need to write the code to perform the division and the type cast operation
		// The result should be of integer type
		float floatResult = floatVariable / 2;
		int intResult = (int) floatResult;


		// Print the integer result
		System.out.println(intResult);
		// Here again, you need to write the code part

		// Close the Scanner
		scanner.close();
	}
}