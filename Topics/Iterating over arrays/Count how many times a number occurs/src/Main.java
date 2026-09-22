import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberCount(scanner));
        scanner.close();
    }
    public static int getNumber(Scanner scanner){
        return scanner.nextInt();
    }
    public static int[] getArray(Scanner scanner){
        int size = getNumber(scanner);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int getN(Scanner scanner){
        return scanner.nextInt();
    }
    public static int numberCount(Scanner scanner){
        int count = 0;
        int[] elements = getArray(scanner);
        int n = getN(scanner);
        for (int element : elements){
            if (n == element){
                count++;
            }
        }
        return count;
    }
}