package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId;
        nextId++;
        this.firstName = firstName;
        // add others
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }
    public Person(){
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getEmail() {
        return this.email;
    }
}

