abstract class Shape {
  Point p;

  Shape() {
    this(new Point(0, 0));
  }

  Shape(Point p) {
    this.p = p;
  }

  abstract double calcArea();

  Point getPosition() {
    return p;
  }

  void setPosition(Point p) {
    this.p = p;
  }

}

class Point {
  int x;
  int y;

  Point() {
    this(0, 0);
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[" + x + "," + y + "]";
  }
}

class Circle extends Shape{
  double r;

  Circle(double radius){
    this.r = radius;
  }

  double calcArea() {
    return 3.14 * r * r;
  }
}

class Rectangle extends Shape{
  double width;
  double height;

  Rectangle(double w, double h){
    this.width = w;
    this.height = h;
  }

  double calcArea() {
    return width * height;
  }

  boolean isSquare(){
    return width == height;
  }
}

public class Exercise7_22{
  public static void main(String[] args) {
    Circle c = new Circle(4);
    System.out.println(c.calcArea()); 

    Rectangle rec = new Rectangle(4, 5);
    System.out.println(rec.isSquare());
  }
}