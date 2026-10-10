package Problem6;
public class Square extends Forme {
    private double side;
    public Square(double x){
        this.side=x;
    }
    public double getSurface(){
        return side*side;
    }
}