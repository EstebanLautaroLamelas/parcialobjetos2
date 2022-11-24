public class Circle extends Shape {
 public double radius;

        public Circle(){
        }
        public  Circle(double radius){
            this.radius = radius;
        }
       public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
  return radius;
}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimetro = 2*Math.PI*radius;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

