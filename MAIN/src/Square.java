public class Square extends Rectangle{
public double side;

public Square(){
}
public Square(double side){
    this.side = side;
}
public Square(double side, String color, boolean filled){
    this.side = side;
    this.color = color;
    this.filled = filled;
}


    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getSide() +
                ", lenght=" + getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
