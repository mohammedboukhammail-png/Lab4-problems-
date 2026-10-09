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

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount<50){
            students[studentCount] = s;
            studentCount++;
        }
        else{
            System.out.println("this Major is full");
        }
    }
    // Getters
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }

    public Student[] getStudents() {
        return this.students;
    }
    public int getStudentCount() {
        return this.studentCount;
    }


    // Display all students in the major
    public void displayStudents() {
        String major = this.name;
        System.out.println("The list of students in "+ major +" is:");
        for(int i=0;i<studentCount;i++){
            String cne = students[i].getCne();
            String name = students[i].getFullName();
            System.out.println((i+1)+"." +" "+ cne +" " name + "\n");
        }
    }
    public Student findStudentByCne(String cne){
        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        } 
        return null;  
    }
    public int getStudentCount(){
        return this.studentCount;
    }
    public boolean removeStudentByCne(String cne){
        Student s = this.findStudentByCne(cne);
        if(s != null){
            for(int i=0;i<studentCount;i++){
                if(this.students[i].getCne().equals(cne)){
                    for(int j=i;j<studentCount-1;j++){
                        students[j]=students[j+1];
                    }
                    students[studentCount-1]=null;
                    studentCount--;
                    break;
                }
                
            }
            return true;
        }
        else{ return false; }
    }
    public void getOccupancyRate(){
        double s = (double) this.studentCount;
        double p = (s/50)*100;
        String result = String.format("Occupancy rate = %0f %%",p );
        System.out.println(result);
    }
    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<studentCount;i++){
            sb.append(this.students[i].getFirstName());
            sb.append("-");
        }
        return sb.toString();
    }
}
