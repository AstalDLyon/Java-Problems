import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double area;
        double a,b,c,r;
        String shapeInput = scanner.nextLine();
        switch (shapeInput){
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                System.out.println(area);
                break;
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double semiperimeter = (a+b+c) / 2; // Fórmula de Heron, onde primeiro se descobre o semiperimetro.
                area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
                System.out.println(area);
                break;
            case "circle":
                r = scanner.nextDouble();
                area = 3.14 * (r * r);
                System.out.println(area);
                break;
            default:
                System.out.println("Shape not available on Malevia");
        }
    }
}