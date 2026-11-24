import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int temp;
        for (int i = 0; i < steps; i++){
            if (arr.length > 1) {
                // pega o ultimo elemento
                int last = arr[arr.length - 1];

                // mover para direita começando pelo final
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }

                // ultimo elemento na primeira posição
                arr[0] = last;
            }
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}