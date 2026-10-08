package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom,prenom,telephone,email);
        this.major = major;
        this.cne = cne;
        this.major.addStudent(this); 
        
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, new Major("23", "computer science")); 
    }
    public Student(){
        this.id = nextId;
        nextId++;
    }
    public String getFullName() {
        return String.format("%s, %s", this.secondName, this.firstName);
    }
    public String getCne(){
        return this.cne;
    }


    }

//    // Getters
//
//
//    // Setters
//
//

//
