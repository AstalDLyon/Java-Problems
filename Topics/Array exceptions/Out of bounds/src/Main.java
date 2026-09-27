import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.hasNextLine() ? scanner.nextLine() : "";

        int index = scanner.hasNextInt()  ? scanner.nextInt() : 0;
        try {
                System.out.println(string.charAt(index));

        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds!");
        }
    }
}