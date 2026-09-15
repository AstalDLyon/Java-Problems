// You can experiment here, it won't be checked

import java.util.Random;

public class Task {
  public static void main(String[] args) {
    class MyClass {

      static int field = 10;

      public MyClass() {
        method2(); // (1)
      }

      void method1() {
        method2(); // (2)
      }

      static void method2() {
        this.method3(); // (3)
      }

      void method3() {
        System.out.println(field); // (4)
      }
    }
}
