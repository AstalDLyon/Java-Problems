import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int intervalStart = scanner.nextInt();
        int intervalEnd = scanner.nextInt();
        /*Criei uma variavel i para receber o valor do inicio do intervalo, para não perder
        o valor inicial do intervalo,
        * */
        for(int i = intervalStart; i <= intervalEnd; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.printf("O intervalo começa em %d e termina em %d",intervalStart,intervalEnd);
    }
}