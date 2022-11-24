public class Circle extends Shape {
 private double radius;
    public double getRadius(){
  return radius;
}
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color);
        this.radius = radius;
    }


}

