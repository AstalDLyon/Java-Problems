// Java program to Demonstrate that Wrapper Classes
// Can be Used to Swap two Objects

// Class 1
// A car with model and no.
class Car {
  // Attributes associated with car
  int model, no;

  // Constructor of class 1
  Car(int model, int no)
  {
    // This refers to current instance itself
    this.model = model;
    this.no = no;
  }

  // Method
  // To print object details
  void print()
  {
    System.out.println("no = " + no
            + ", model = " + model);
  }
}

// Class 2
// Wrapper over class that is used for swapping
class CarWrapper {
  Car c;

  // Constructor
  CarWrapper(Car c) { this.c = c; }
}

// Class 3
// Uses Car class and swaps objects of Car
// using CarWrapper
class GFG {
  // This method swaps car objects in wrappers
  // cw1 and cw2
  public static void swap(CarWrapper cw1, CarWrapper cw2)
  {
    Car temp = cw1.c;
    cw1.c = cw2.c;
    cw2.c = temp;
  }

  // Main driver method
  public static void main(String[] args)
  {
    Car c1 = new Car(101, 1);
    Car c2 = new Car(202, 2);
    CarWrapper cw1 = new CarWrapper(c1);
    CarWrapper cw2 = new CarWrapper(c2);
    swap(cw1, cw2);
    cw1.c.print();
    cw2.c.print();
  }
}
