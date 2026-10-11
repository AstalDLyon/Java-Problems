import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        char[] charFromString = input.toCharArray();
        int[] intFromChar = new int[charFromString.length];
        for (int i = 0; i < intFromChar.length; i++){
            intFromChar[i] = Character.getNumericValue(charFromString[i]);
        }
        int sum1 = intFromChar[0] + intFromChar[1] + intFromChar[2];
        int sum2 = intFromChar[3] + intFromChar[4] + intFromChar[5];
        if (sum1 == sum2){
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}