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


    private double getSide(){
        return side;
    }
    private void setSide(double side){
        this.side = side;
    }



}
