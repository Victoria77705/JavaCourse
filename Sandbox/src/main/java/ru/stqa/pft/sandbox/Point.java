package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point (double x, double y){
    this.x = x;
    this.y = y;
  }
  public  double distance (Point P1) {
    return Math.sqrt((this.x - P1.x) * (this.x - P1.x) + (this.y - P1.y) * (this.y - P1.y));
  }
}
