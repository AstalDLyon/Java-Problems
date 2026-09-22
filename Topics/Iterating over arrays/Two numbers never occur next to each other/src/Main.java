import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int [] array = getArrayElements(scanner);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(isNextToEachOther(array, n, m));
    }
    public static int getArraySize(Scanner scanner){
        return scanner.nextInt();
    }
    public static int[] getArrayElements(Scanner scanner){
        int size = getArraySize(scanner);
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return  array;
    }
    public static boolean isNextToEachOther(int[] array, int n, int m){
        for (int i = 0; i < array.length - 1; i++){
            if (((array[i] == n) && (array[i + 1] == m)) || ((array[i] == m) && (array[i + 1] == n))) {
                return false;
            }
        }
        return true;
    }
}