import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int unitsNumber = scanner.nextInt();
        if(unitsNumber < 1){
            System.out.println("no army");
        } else if (unitsNumber <= 19) {
            System.out.println("pack");
        } else if (unitsNumber <= 249) {
            System.out.println("throng");
        } else if (unitsNumber <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}