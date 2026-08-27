import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int testNumbers = scanner.nextInt();
        int sumOfDivisibleBy6 = 0;

        for(int indice = 0; indice < testNumbers; indice++){
            int number = scanner.nextInt();
            if((number % 6) == 0){
                sumOfDivisibleBy6 += number;
            }
        }
        System.out.println(sumOfDivisibleBy6);
        scanner.close();
    }
}