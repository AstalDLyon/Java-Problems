import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int temp;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i= 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        if (size > 1) {
            // pega o ultimo elemento
            int last = array[array.length - 1];

            // mover para direita começando pelo final
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            // ultimo elemento na primeira posição
            array[0] = last;
        }
        for (int element : array){
            System.out.printf("%d ",element);
        }
    }
}