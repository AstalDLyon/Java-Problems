import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int numero = N + 1; // ja que é pedido o primeiro quadrado perfeito maior que N, ignoramos N na busca.
        while (true) {
            double raiz = Math.sqrt(numero); // verifica se a raiz quadrada tem resto

            if (raiz == (int) raiz) { // compara a raiz com sua versão inteira, pra ver se tem casas decimais ou não.
                // caso não tenha, deu bom.

                System.out.println(numero);
                break;
            }
            numero++;
        }
        scanner.close();
    }
}