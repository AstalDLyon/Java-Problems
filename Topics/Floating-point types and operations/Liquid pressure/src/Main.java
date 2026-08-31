import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double gravity = 9.8;
        double liquidDensity = scanner.nextDouble();
        double columnHeight = scanner.nextDouble();
        double liquidPressure = liquidDensity * gravity * columnHeight;
        System.out.println(liquidPressure);
    }
}