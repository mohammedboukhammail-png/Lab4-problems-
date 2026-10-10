package Problem7;
public abstract class Person{
    private String name;
    public Person(String s){
        this.name=s;
    }
    public String getName(){
        return this.name;
    }
    public abstract void display();

}