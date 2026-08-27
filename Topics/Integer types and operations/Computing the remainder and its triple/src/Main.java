import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int remainder = input % 2;
        // The second operation goes here
        int finalResult = remainder * 3;

        System.out.printf("%d\n%d",remainder, finalResult);

        scanner.close();
    }
}