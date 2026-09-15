import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int  SECOND = 1;
        final int MINUTE = 60 * SECOND;
        final int HOUR = 60 * MINUTE;
        ArrayList<Integer> firstMoment = new ArrayList<>();
        firstMoment.add(scanner.nextInt());
        firstMoment.add(scanner.nextInt());
        firstMoment.add(scanner.nextInt());
        ArrayList<Integer> secondMoment = new ArrayList<>();
        secondMoment.add(scanner.nextInt());
        secondMoment.add(scanner.nextInt());
        secondMoment.add(scanner.nextInt());


        for (int i = 0; i < firstMoment.size() ; i++ ){
            int multiplicador;
            if (i == 0){
                multiplicador = HOUR;
            } else if(i == 1){
                multiplicador = MINUTE;
            } else {
                multiplicador = SECOND;
            }

            firstMoment.set(i, firstMoment.get(i) * multiplicador);
            secondMoment.set(i, secondMoment.get(i) * multiplicador);
        }
        int firstTotal = firstMoment.get(0) + firstMoment.get(1) + firstMoment.get(2);
        int secondTotal = secondMoment.get(0) + secondMoment.get(1) + secondMoment.get(2);

        int timeDiff = secondTotal - firstTotal;
        System.out.println(timeDiff);
    }
}