import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(divisibleByN(scanner));
        /*
        *  Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(b / n - (a - 1) / n);
        /* Exemplo
         25 / 5 = 5
         (15 - 1) / 5 = 2,8, porém como é int, ficamos com 2. Então teremos:
         5 - 2 = 3, 3 números no intervalo, são divisiveis por n. Elegante dms essa solução.

        */
        scanner.close();
    }
    public static ArrayList getValues(Scanner scanner){
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0 ; i < 2; i++){
        values.add(scanner.nextInt());
        }
        return  values;
    }
    public static int getN(Scanner scanner){
        return scanner.nextInt();
    }
    public static int divisibleByN(Scanner scanner){
        ArrayList<Integer> values = getValues(scanner);
        int n = getN(scanner);
        int count = 0;
        for (int i = values.get(0); i <= values.get(1); i++){ // pessimo codigo, porém feito intencionalmente para
            if ((i % n == 0)){                                // se acostumar com ArrayList
                count++;
            }
        }
        return count;

    }
}