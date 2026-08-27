import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int inputTemperature;
        // Add your while loop or do-while loop here to process input temperatures
        do{
            inputTemperature = scanner.nextInt();

            if((inputTemperature > maxTemperature) && (inputTemperature < 100)){
                maxTemperature = inputTemperature;
            }
        } while (inputTemperature < 100);
        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);
        scanner.close(); // Close the scanner
    }
}