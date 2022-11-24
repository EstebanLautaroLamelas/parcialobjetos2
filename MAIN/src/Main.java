public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false);
        Shape s2 = new Shape() {
            @Override
            double getArea() {
                return 0;
            }

            @Override
            double getPerimeter() {
                return 0;
            }
        }
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);

    }
}