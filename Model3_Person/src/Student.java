public class Student extends Person {
    private myDOB EnrollmentDate;
    private myDOB GraduationDate;
    private  double StudentID;

    Student(){
        this.firstName = "";
        this.lastName = "";
        this.DOB = new myDOB();
    }

    Student(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.DOB = new myDOB(_dob);
        //this.DOB = _dob.clone();
    }
    public void setStudentID(double _studentID) {

        this.StudentID = _studentID;
    }



    public void setEnrollmentDate(myDOB enrollmentDate) {

        this.EnrollmentDate = enrollmentDate;
    }



    public void setGraduationDate(myDOB graduationDate) {

        this.GraduationDate = graduationDate;
    }

    public double getStudentID() {

        return this.StudentID;
    }

    public myDOB getEnrollmentDate() {

        return this.EnrollmentDate;
    }

    public myDOB getGraduationDate() {

        return GraduationDate;
    }

    @Override
    public String toString() {
        return "Student - {" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", DOB: '" + DOB.toString() + '\'' +
                ", StudentID: '" + getStudentID() + '\''+
                ", Enrollment Date: '" + getEnrollmentDate() + '\''+
                ", Graduation Date: '" + getGraduationDate() + '\''+
                '}';
    }


}
