import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int maxNumber = 0;
        while(scanner.hasNextInt()){
            inputNumber = scanner.nextInt();
            if(maxNumber < inputNumber){
                maxNumber = inputNumber;
            }
        }
        System.out.println(maxNumber);
    }
}