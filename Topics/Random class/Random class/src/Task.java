// You can experiment here, it won't be checked

import java.util.Random;

public class Task {
  public static void main(String[] args) {
    Random random = new Random ();
    int min = 50;
    int max = 100;
    int range = max - min + 1;
    int randomNumber = random.nextInt(range) + min;
    System.out.println("Random number between 50 and 100: " + randomNumber ) ;
  }
}
