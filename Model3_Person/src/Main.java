
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());

//        Student s1 = new Student();
//        Student s2 = new Student("Jatan", "Mehta");
        Student s3 = new Student("Jatan", "Mehta", new myDOB(1,2,3));

        //System.out.println(s1.toString());
        //System.out.println(s2.toString());
        s3.setStudentID(2013098);
        s3.setEnrollmentDate(new myDOB(2,15,23));
        s3.setGraduationDate(new myDOB(3,16,24));

        System.out.println(s3.toString());
    }
}