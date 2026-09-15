// You can experiment here, it won't be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    StringBuilder firstBuilder = new StringBuilder(10);
    StringBuilder secondBuilder = new StringBuilder(8);
    firstBuilder = secondBuilder;

    firstBuilder
            .append("J")
            .append("a")
            .append("v")
            .append("a");

    firstBuilder.deleteCharAt(0);

    int currentCapacity = firstBuilder.capacity();
    System.out.println(currentCapacity);
  }
}
