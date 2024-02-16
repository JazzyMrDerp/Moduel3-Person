public class Faculty extends Person{
    private myDOB hiringDate;
    private double facultyID;

    Faculty(String _firstname, String _lastName, myDOB _dob){
        this.firstName = _firstname;
        this.lastName = _lastName;
         this.DOB = new myDOB(_dob);
    }

    public void setHiringDate(myDOB hiringDate) {
        this.hiringDate = hiringDate;
    }

    public myDOB getHiringDate() {
        return this.hiringDate;
    }

    public void setFacultyID(double facultyID) {
        this.facultyID = facultyID;
    }

    public double getFacultyID() {
        return facultyID;
    }

    @Override
    public String toString() {
        return "Faculty - {" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", DOB: '" + DOB.toString() + '\'' +
                ", Faculty ID: '" + getFacultyID() + '\''+
                ",  Hiring Date: '" + getHiringDate() + '\''+
                '}';
    }
}
