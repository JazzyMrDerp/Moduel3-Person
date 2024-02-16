public class Person {
    protected String firstName;
    protected String lastName;
    protected myDOB DOB;

//
    Person(){
        this.firstName = "";
        this.lastName = "";
        this.DOB = new myDOB(1,1,1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB.toString() +
                '}';
    }
}
