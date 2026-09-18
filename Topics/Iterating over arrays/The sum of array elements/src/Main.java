import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        // put your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = getArraySize(bufferedReader);
        int[] elements = elementInput(size, bufferedReader);
        System.out.println(arraySum(elements));
        bufferedReader.close();
    }
    public static int getArraySize(BufferedReader bufferedReader) {
        while (true){
            try {
                String line = bufferedReader.readLine();
                if (line == null){
                    return 0;
                }
                return Integer.parseInt(line.trim());
            } catch (IOException e) {
                System.out.println("Error reading the input");

            }
        }
    }
    public static int arraySum(int[] elements){
        while (true){
            try {
                int sum = 0;
                for ( int element : elements){
                  sum += element;
                }
                return sum;
            } catch (NumberFormatException e) {
                System.out.println("Must be a int number");
            }
        }
    }
    public static int[] elementInput(int size,BufferedReader bufferedReader){
        while (true){
            try {
                int[] elements = new int[size];
                String line = bufferedReader.readLine();

                if (line != null) {
                    // Divide a linha usando um ou mais espaços como separador
                    String[] tokens = line.trim().split("\\s+");
                    for (int i = 0; i < Math.min(size, tokens.length); i++) {
                        elements[i] = Integer.parseInt(tokens[i]);
                    }
                }
                return elements;
            } catch (IOException e) {
                System.out.println("Error reading the input");
            }
        }
    }
}