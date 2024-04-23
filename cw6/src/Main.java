import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("John", "Doe", "doe@wp.pl",
                "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
        System.out.println(s1);

        Student s2 = new Student("Ana", "Johnson", "anajohnson@gmail.com", "Złota 44", "123-456-789", new Date(2000,8,19));
        System.out.println(s2);
        //student get the indexNumber automatically assigned
        StudyProgramme sp=new StudyProgramme("IT", "AAA", 7, 5);
        //7 is the number of semesters, 5 - number of possible ITN's before being allowed to be promoted to next semester
        s1.enrollStudent(sp);
        System.out.println(s1);
        Student.promoteAllStudents();
        System.out.println(s1);
        System.out.println(s2);
        Student.promoteAllStudents();
        System.out.println(s1);
        System.out.println(s2);
        Student.promoteAllStudents();
        System.out.println(s1);
        System.out.println(s2);
        s1.addGrade(5, "MAT");
        s1.addGrade(5, "PGO");
        s2.addGrade(5, "TEM");
        s2.addGrade(5, "RPG");
        System.out.println(s1);
        System.out.println(s2);
    }
}
