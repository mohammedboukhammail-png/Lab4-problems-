package Problem7;
public class Plumber extends Person{
    public Plumber(String s){
        super(s);
    }
    public void display(){
        String n = this.getName();
        String s = String.format("I am %s the Plumber",n);
        System.out.println(s);
    }
}