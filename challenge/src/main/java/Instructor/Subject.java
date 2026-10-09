package Instructor;
public class Subject{
    int id;
    String code;
    String title;
    public String normalizedCode(){
        StringBuilder resultat = new StringBuilder();
        for(int i=0;i<this.code.length();i++){
            if(code.charAt(i) != ' '){
                String x = String.valueOf(this.code.charAt(i));
                resultat.append(x.toUpperCase());
            }
        }
        return resultat.toString();
    }
    public String properTitle(){
        StringBuilder s = new StringBuilder();
        boolean f = false;
        for(int i =0;i<title.length();i++){
            char c = title.charAt(i);
            if (c == ' ') {
                s.append(c);
                f = true;
            } 
            else {
                if (f) {
                    s.append(Character.toUpperCase(c));
                    f = false;
                } else {
                    s.append(c);
                }
            }
        }
        return s.toString();
    }
    public boolean isIntroCourse() {
        boolean titreContient = false;
        char[] c1 = {'I', 'N', 'T', 'R', 'O'};
        
        if (this.title.length() >= 5) {
            for (int i = 0; i <= this.title.length() - 5; i++) {
                int compteur = 0;
                for (int j = 0; j < 5; j++) {
                    char s = this.title.charAt(i + j);
                    if (Character.toUpperCase(s) == c1[j]) {
                        compteur++;
                    }
                }
                if (compteur == 5) {
                    titreContient = true;
                    break; 
                }
            }
        }

        boolean codeCommence = false;
        char[] c2 = {'I', 'N', 'T', 'R', 'O', '-'};
        
        if (this.code.length() >= 6) {
            int compteur2 = 0;
            for (int i = 0; i < 6; i++) {
                if (this.code.charAt(i) == c2[i]) {
                    compteur2++;
                }
            }
            if (compteur2 == 6) {
                codeCommence = true;
            }
        }

        return titreContient || codeCommence;
    }
    public String syllabusLine(Instructor I) {
        StringBuilder result = new StringBuilder();
        
        result.append(this.code);
        result.append(" - ");
        result.append(this.title);
        result.append(" (Instructor: ");
        result.append(I.getLastName());
        result.append(" ");
        result.append(I.getFirstName());
        result.append(")");
        
        return result.toString();
    }
}