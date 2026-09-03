import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        /* vai receber inteiros não negativos, eles devem ser exibidos na tela, com exceção do zero que é para sair
        do programa
         */
        int count = 0;
        while(true){
            int operador = scanner.nextInt();
            if(operador == 0){
                break;
            }
            count += 1;
        }
        System.out.println(count);
    }
}