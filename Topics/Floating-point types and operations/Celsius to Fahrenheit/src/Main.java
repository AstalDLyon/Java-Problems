import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%f",fahrenheit);

    }
    public static double celsiusToFahrenheit(double celsius){
            return celsius * 1.8 + 32;
        }
}