package student;

public class Test {
    public static void main(String[] args) {
        Major a = new Major();
        Major b = new Major("1","physics engineering");
        Student s = new Student("Ricardo","Martinez","phone","Ricardo@gmail.com","cne", a);
        Student x = new Student("Alfredo","Gonzalez","phone","Alfredo@gmail.com","cne", b);
        // Display computer science students
        a.displayStudents();

    }
}

