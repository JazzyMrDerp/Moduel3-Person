public class Admin extends Person{
    private myDOB hiringDate;
    private double adminID;

    Admin(){
        this.firstName = "";
        this.lastName = "";
        this.DOB = new myDOB();
    }

    Admin(String _firstname, String _lastName, myDOB _dob){
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

    public void setAdminID(double facultyID) {
        this.adminID = facultyID;
    }

    public double getAdminID() {
        return adminID;
    }

    @Override
    public String toString() {
        return "Admin - {" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", DOB: '" + DOB.toString() + '\'' +
                ", Faculty ID: '" + getAdminID() + '\''+
                ",  Hiring Date: '" + getHiringDate() + '\''+
                '}';
    }
}
