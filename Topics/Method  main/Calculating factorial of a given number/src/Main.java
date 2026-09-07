import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        int number = scanner.nextInt();
        int fatorial = 1;

        // TODO: 2. Print the factorial of 'n'
        for(int i = 1; i <= number; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);

        // OU

        /*
        IntStream.rangeClosed(1, number): Cria uma lista de números que vai de 1 até o número digitado
         (ex: se number for 5, ele gera 1, 2, 3, 4, 5).
         .reduce(1, (a, b) -> a * b):
          Começa com o valor 1 e vai multiplicando cada número da lista pelo resultado anterior
           (1 * 1 * 2 * 3 * 4 * 5).
         */
        int fatorial1 = java.util.stream.IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        System.out.println(fatorial1);

        scanner.close(); // Always close the scanner when done
    }

}