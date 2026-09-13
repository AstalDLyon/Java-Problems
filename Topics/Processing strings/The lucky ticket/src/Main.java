import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        char[] charFromString = input.toCharArray();
        int[] intFromChar = new int[charFromString.length]; // garantindo que o tamanho seja dinamico com o array em cima.
        for (int i = 0; i < intFromChar.length; i++){ // pegando os valores e os convertendo para int.
            intFromChar[i] = Character.getNumericValue(charFromString[i]);
        }
        /*
        O jeito certo de pegar o valor sempre vai ser:
        char charValue = '2';
        int intValue = Character.getNumericValue(charValue); // 2
        Caso tente fazer do jeito abaixo com casting: (irá ser pego o valor da tabela ASCII do simbolo)
        int intValue = (int) charValue; // 50, which is the ASCII code for character ‘2’
        * */
        int sum1 = intFromChar[0] + intFromChar[1] + intFromChar[2];
        int sum2 = intFromChar[3] + intFromChar[4] + intFromChar[5];
        if (sum1 == sum2){
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}