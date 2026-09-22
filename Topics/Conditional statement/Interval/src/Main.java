import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        System.out.println(isWeirdInterval(number));
        scanner.close();
    }
    static boolean isWeirdInterval(int number){
        boolean isTrue; //alternativamente, da pra criar 3 variaveis, cada um checando a condição e retornar a comparação
        // logica das 3 interval1 || interval 2 || interval 3.
        if ((   (number > -15) && (number <= 12 ) ||
                (number > 14) && (number < 17)    ||
                (number >= 19))){
            isTrue = true;
        } else {
            isTrue = false;
        }
        return isTrue;
    }
}