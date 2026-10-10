package Problem6;
public class Circle extends Forme {
    private double radius;
    public Circle(double s){
        this.radius=s;
    }
    public double getSurface(){
        double s = (this.radius)*(this.radius)*Math.PI;
        return s;
    }
}