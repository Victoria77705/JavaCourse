package ru.stqa.pft.sandbox;

public class MyFirstHomeWork {
  public static void main(String[] args) {
    Point P1 = new Point(3, 5);
    Point P2 = new Point(5, 7);
    System.out.println("Distance between point P1(" + P1.x + ", " + P1.y + ") and Point P2(" + P2.x + ", " + P2.y + ") = " + P1.distance(P2));

  }

}
