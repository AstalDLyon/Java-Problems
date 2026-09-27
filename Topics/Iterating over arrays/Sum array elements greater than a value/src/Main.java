import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sumBiggerThanN = 0;
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int N = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (array[i] > N){
                sumBiggerThanN += array[i];
            }
        }
        System.out.println(sumBiggerThanN);
    }
}