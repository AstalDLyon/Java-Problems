import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        System.out.println(numberOne >= numberTwo && numberOne <= numberThree || numberOne >= numberThree && numberOne <+ numberTwo);
    }
}