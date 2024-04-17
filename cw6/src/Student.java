import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Student {
    static ArrayList<Student> s = new ArrayList<Student>();

    private String imie;
    private String nazwisko;
    private String email;
    private String adres;
    private String nrTel;
    private Date dataUrodzenia;
    private String numerIndeksu;
    private HashMap<Integer, String>oceny = new HashMap<>();
    private int semestr;
    private String statusStudenta;

    public Student(String imie, String nazwisko, String email, String adres, String nrTel, Date dataUrodzenia,String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.nrTel = nrTel;
        this.dataUrodzenia = dataUrodzenia;
        this.numerIndeksu=numerIndeksu;

        this.s = new ArrayList<Student>();

//    public Student (){
//        s.add(this);
//    }
//    public void introduction(){
//        System.out.println("Hello");
//    }
//    Student.introduction()
    }


    public void addGrade(int ocena, String przedmiot) {
        this.oceny.put(ocena, przedmiot);
    }
    public void enrollStudent(StudyProgramme sp){
        this.semestr = sp.getSemester() + 1;
        this.statusStudenta = this.semestr == 1 ? "Kandydat" : (this.semestr == 7 ? "Absolwent" : "Student");
    }
}
