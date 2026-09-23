import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxElementBy4(scanner));
        scanner.close();
        // start coding here
    }
    public static int getNumberOfElements(Scanner scanner){
        return scanner.nextInt();
    }
    public static int[] getElements(Scanner scanner){
        int[] array = new int[getNumberOfElements(scanner)];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int maxElementBy4(Scanner scanner){
        int[] array = getElements(scanner);
        int maxBy4 = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] % 4 == 0) && array[i] > maxBy4){
                maxBy4 = array[i];
            }
        }
        return  maxBy4;
    }
}