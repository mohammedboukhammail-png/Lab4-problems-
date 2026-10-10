package Problem7;
public class Carpenter extends Person{
    public Carpenter(String s){
        super(s);
    }
    public void display(){
        String n = this.getName();
        String s = String.format("I am %s the Carpenter",n);
        System.out.println(s);
    }
}