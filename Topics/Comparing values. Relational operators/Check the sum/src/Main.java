import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        boolean is20check = true;
        if((numberOne + numberTwo == 20) || (numberOne + numberThree == 20) || (numberTwo + numberThree == 20)){
            System.out.println(is20check);
        } else{
            is20check = false;
            System.out.println(is20check);
        }
    }
}