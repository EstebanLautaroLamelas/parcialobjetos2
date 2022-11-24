public class Rectangle extends Shape {
 public double width;
 public double lenght;

 public Rectangle(){}

 public Rectangle(double width, double lenght) {
  this.width = width;
  this.lenght = lenght;
 }
 public Rectangle(double width, double lenght, String color, boolean filled){
  this.width = width;
  this.lenght = lenght;
  this.color = color;
  this.filled = filled;
 }


 public double getLenght() {
  return lenght;
 }

 public double getWidth() {
  return width;
 }

 public void setLenght(double lenght) {
  this.lenght = lenght;
 }

 public void setWidth(double width) {
  this.width = width;
 }

 @Override
 double getArea() {
  double area = width * lenght;
  return area;
 }

 @Override
 double getPerimeter() {
  double perimetro = width * 2 + lenght * 2;
  return perimetro;
 }

 @Override
 public String toString() {
  return "Rectangle{" +
          "width=" + width +
          ", lenght=" + lenght +
          ", color='" + color + '\'' +
          ", filled=" + filled +
          '}';
 }
}
