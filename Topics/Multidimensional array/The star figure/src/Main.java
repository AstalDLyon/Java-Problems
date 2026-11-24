import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[][] array = new String[n][n];

        for (int i= 0; i < array.length; i++ ){
            Arrays.fill(array[i], ".");
        }

        int meio = n / 2;

        for (int i = 0; i < n; i++) {
            array[meio][i] = "*";       // Linha do meio
            array[i][meio] = "*";       // Coluna do meio
            array[i][i] = "*";          // Diagonal principal
            array[i][n - 1 - i] = "*";  // Diagonal secundária
        }

        for (int i = 0; i < n; i++){
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < n; j++){
                linha.append(array[i][j]);
                if(j< n - 1){
                    linha.append(" ");
                }
            }
            System.out.println(linha.toString());
        }
        scanner.close();
    }
}