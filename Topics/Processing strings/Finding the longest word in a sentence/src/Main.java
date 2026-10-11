import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String biggestSentence = "";
        // Your code here
        String[] parts = sentence.split(" ");
        for (int i = 0; i < parts.length; i++){
            if (biggestSentence.length() < parts[i].length()){
                biggestSentence = parts[i];
            }
        }
        System.out.println(biggestSentence);
    }
}