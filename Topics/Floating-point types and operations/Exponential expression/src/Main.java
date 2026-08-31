import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double number = scanner.nextDouble();
        double result = Math.pow(number,3) + Math.pow(number,2) + number + 1;
        System.out.printf("%f",result);
    }
}