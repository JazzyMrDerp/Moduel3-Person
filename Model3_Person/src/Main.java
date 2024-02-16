
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());

        Student s1 = new Student("Jatan", "Mehta", new myDOB(8,19,2005));
        s1.setStudentID(2013098);
        s1.setEnrollmentDate(new myDOB(2,15,23));
        s1.setGraduationDate(new myDOB(3,16,24));
        System.out.println(s1.toString());

        Faculty f1 = new Faculty("Joe", "Smith", new myDOB(5,26, 1975));
        f1.setFacultyID(1237045);
        f1.setHiringDate(new myDOB(2,7,2007));
        System.out.println(f1.toString());
    }
}