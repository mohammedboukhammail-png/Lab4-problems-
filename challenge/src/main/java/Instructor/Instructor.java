package Instructor;
public class Instructor extends Person {
    private String employeeNumber;
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    public String cleanEmployeeNumber(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.employeeNumber.length();i++){
            if(this.employeeNumber.charAt(i) != ' '){
                sp.append(employeeNumber.charAt(i));
            }
        }
        return sb.toString();
    }
    public String summaryLine(){
        String a = this.getFirstName();
        String b = this.getSecondName();
        String s = String.format("Instructor[employeeNumber = %s, lastName =%s,firstName=%s]",employeeNumber,a,b);
    }
    public String toCard(){
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee:");
        sb.append(this.getEmployeeNumber());
        sb.append("\n");
        sb.append("Name :");
        sb.append(this.getSecondName());
        sb.append(", ");
        sb.append(this.getFirstName());
        sb.append("\n");
        sb.append("Email :");
        sb.append(this.getEmail());
        sb.append("\n");
        sb.append("phone :");
        sb.append(this.getPhone());
        return sb.toString();
    }
    public String displayName() {
        StringBuilder s = new StringBuilder();
        if (this.getFirstName() != null) {
            s.append(this.getFirstName());
        }
        if (this.getSecondName() != null) {
            if (s.length() > 0) {
                s.append(" ");
            }
            s.append(this.getSecondName());
        }
        return s.toString();
    }
}