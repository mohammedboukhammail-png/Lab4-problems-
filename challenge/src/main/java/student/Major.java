package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        studentCount=0;
    }
    public Major() {
        this.id = nextId++;
        this.code = "23";
        this.name = "computer science";
        this.students = new Student[50];
        this.studentCount = 0;
    }

//    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount<50){
            students[studentCount] = s;
            studentCount++;
        }
        else{
            System.out.println("this Major is full");
        }
        
    

    }

//    // Getters
//
//
//    // Display all students in the major
    public void displayStudents() {
        String major = this.name;
        System.out.println("The list of students in "+ major +" is:");
        for(int i=0;i<studentCount;i++){
            String cne = students[i].getCne();
            String name = students[i].getFullName();
            System.out.println((i+1)+"."+ cne + name +"\n");
            
        }

    }


}
