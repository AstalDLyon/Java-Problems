import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the input
        String integerStr = reader.readLine();
        int integer = Integer.parseInt(integerStr);

        // Read a string from the input
        String string = reader.readLine();

        // Check if the integer is greater than 0
        while (true){
            if (integer <= 0){
                System.out.println("Invalid input!");
                break;
            } else {
                for (int i = 0; i < integer; i++){
                    System.out.println(string);
                }
                break;
            }
        }
        // If so, print the string that many times
        // Otherwise, print "Invalid input!"

    }
}