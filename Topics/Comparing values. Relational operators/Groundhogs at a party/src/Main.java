import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanutQuantity = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println(partyWasSuccessful(peanutQuantity, isWeekend));
        scanner.close();
    }
    static boolean partyWasSuccessful(int peanut, boolean weekend){
        boolean success;
        if(weekend){
            if ((peanut >= 15) && (peanut <= 25)){
                success = true;
            } else {
                success = false;
            }
            return  success;
        } else {
            if ((peanut >= 10) && (peanut <= 20)){
                success = true;
            } else {
                success = false;
            }
            return success;
        }
    }
}