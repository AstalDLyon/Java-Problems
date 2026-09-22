import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[][] resultado = manipulation(scanner);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + (j == resultado[i].length - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
    public static int getN(Scanner scanner){
        return scanner.nextInt();
    }
    public static int getM(Scanner scanner){
        return scanner.nextInt();
    }
    public static int getInversor1(Scanner scanner){
        return scanner.nextInt();
    }
    public static int getInversor2(Scanner scanner){
        return scanner.nextInt();
    }

    public static int[][] insertElements(Scanner scanner){
        int N = getN(scanner);
        int M = getM(scanner);
        int[][] array = new int[N][M];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        return  array;
    }
    public  static int[][] manipulation(Scanner scanner){
        int[][] twoDimArray = insertElements(scanner);
        int inversor1 = getInversor1(scanner);
        int inversor2 = getInversor2(scanner);
        for (int i = 0; i < twoDimArray.length; i++) {
            int temp = twoDimArray[i][inversor1];

            twoDimArray[i][inversor1] = twoDimArray[i][inversor2];

            twoDimArray[i][inversor2] = temp;
        }

        return twoDimArray;
    }

}


/* Inputs:
Primeiros inputs são as dimensões N e M // feito
Segundo são os elementos que irão dentro da matriz bidimensional // feito
Terceiro são os indices que serão invertidos // feito
  Logica do Problema:
  Inverter os elmementos no indices I e J // em progresso
 */
