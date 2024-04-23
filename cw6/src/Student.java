import java.util.ArrayList;
import java.util.Date;
public class Student {
    private static ArrayList<Student> allStudents = new ArrayList();

    private String imie;
    private String nazwisko;
    private String email;
    private String adres;
    private String nrTel;
    private Date dataUrodzenia;
    private String numerIndeksu;
    private StatusStudenta statusStudenta;
    private StudyProgramme studyProgramme;
    private int itnCount;
    private ArrayList<Grade> grades = new ArrayList();
    private static int studentCount = 0;
    private int semestr;

    public Student(String imie, String nazwisko, String email, String adres, String nrTel, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.nrTel = nrTel;
        this.dataUrodzenia = dataUrodzenia;
        this.itnCount = 0;
        studentCount++;
        this.numerIndeksu = "s" + String.valueOf(studentCount);
        this.statusStudenta = StatusStudenta.KANDYDAT;
        allStudents.add(this);
    }
    public static void promoteAllStudents(){
        for (Student s : allStudents){
            if (s.studyProgramme == null) continue;
            if (s.itnCount > s.studyProgramme.itn) continue;
            if (s.semestr == s.studyProgramme.ileSemestrów){
                s.statusStudenta = StatusStudenta.ABSOLWENT;
                continue;
            }
            if (s.semestr != 0)s.semestr++;

        }
    }
    public void enrollStudent(StudyProgramme sp){
        this.studyProgramme = sp;
        this.semestr = 1;
        this.statusStudenta = StatusStudenta.STUDENT;
    }

    public void addGrade(int grade, String subject){
        this.grades.add(new Grade(grade, subject));
    }

    @java.lang.Override
    public String toString() {
        String gradesString = "";
        for (Grade g : grades){
            gradesString += g.toString();
        }

        return "DANE: \n" +
                "IMIE='" + imie + '\'' +
                ", NAZWISKO='" + nazwisko + '\'' +
                ", EMAIL='" + email + '\'' +
                ", ADRES='" + adres + '\'' +
                ", NUMER TELEFONU='" + nrTel + '\'' +
                ", DATA URODZENIA=" + dataUrodzenia +
                "\nDANE STUDENTA: \n" +
                "es='" + numerIndeksu + '\'' +
                ", STATUS STUDENTA=" + statusStudenta +
                ", SEMESTR=" + semestr +
                ", studyProgramme=" + studyProgramme +
                ", itnCount=" + itnCount +
                ", grades=" + grades + "\n";
    }
}
