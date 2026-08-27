import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result;
        if(N >= 0 && N <= 1000000){
            result = (N/ 10) % 10;
            System.out.println(result);
        }
    }
}