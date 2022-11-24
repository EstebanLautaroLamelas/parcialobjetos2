public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false);
        
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);

        Shape s4 = new Square(6.6);

        System.out.println("El area del circulo es " + s1.getArea());
        System.out.println("El perimetro del circulo es " + s1.getPerimeter());

        System.out.println("El area del rectangulo es " + s3.getArea());
        System.out.println("El perimetro del rectangulo es " + s3.getPerimeter());
    }
}