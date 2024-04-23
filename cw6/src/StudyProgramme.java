public class StudyProgramme {

    private String nazwaPrzedmiotu;
    private String opisPrzedmiotu;
    int ileSemestrów;
    int itn;

    public StudyProgramme(String nazwaPrzedmiotu, String opisPrzedmiotu, int ileSemestrów, int itn){
        this.nazwaPrzedmiotu=nazwaPrzedmiotu;
        this.opisPrzedmiotu=opisPrzedmiotu;
        this.ileSemestrów=ileSemestrów;
        this.itn=itn;
    }
    @java.lang.Override
    public String toString() {
        return " [Name='" + nazwaPrzedmiotu + '\'' +
                ", description='" + opisPrzedmiotu + '\'' +
                ", howManySemesters=" + ileSemestrów +
                ", allowedItn=" + itn + " ]";
    }
}
