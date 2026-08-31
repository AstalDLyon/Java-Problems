// You can experiment here, it won't be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    int count = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      count++;
      if (i < 3) {
        continue;
      } else {
        for (int j = 0; j < 5; j++) {
          System.out.println(j);
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
