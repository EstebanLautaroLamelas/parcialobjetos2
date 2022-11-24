public class Circle extends Shape {
 private double radius;
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
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
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

