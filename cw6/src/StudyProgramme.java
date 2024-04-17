import java.util.ArrayList;

public class StudyProgramme {

    private String nazwaPrzedmiotu;
    private String opisPrzedmiotu;
    private int semestr;

    private int itn;

    public StudyProgramme(String nazwaPrzedmiotu, String opisPrzedmiotu, int semestr,int itn){
        this.nazwaPrzedmiotu=nazwaPrzedmiotu;
        this.opisPrzedmiotu=opisPrzedmiotu;
        this.semestr=semestr;
        this.itn=itn;
    }

    public int getSemester() {
        return 0;
    }
}
