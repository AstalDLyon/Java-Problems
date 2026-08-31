import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean willCrash = false;
        for(int index = 1; index <= numberOfBridges; index++){
            int bridgeHeight = scanner.nextInt();
            if(busHeight >= bridgeHeight){
                System.out.printf("Will crash on bridge %d", index);
                break;
            } else {

                if(index == (numberOfBridges - 1) && !willCrash){
                    System.out.println("Will not crash");
                }
            }
        }
    }
}