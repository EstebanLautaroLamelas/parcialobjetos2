public class Rectangle extends Shape {
 public double width;
 public double lenght;

 Rectangle(double width, double lenght, String color, boolean filled){
  super(color, filled);
  this.width = width;
  this.lenght = lenght;
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

}
