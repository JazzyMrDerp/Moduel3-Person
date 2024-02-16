public class myDOB {
    private int month;
    private  int day;
    private int year;

    myDOB(int m, int d, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    myDOB(myDOB dob){
        this.day = dob.day;
        this.month = dob.month;
        this.year = dob.year;
    }


// This overrides the toString function in the Person Class so it formats it like this
    @Override
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }
    //    Takes an object and returns the object
    @Override
    protected myDOB clone() throws CloneNotSupportedException {
        myDOB obj = new myDOB(this.day, this.month, this.year);
        return obj;
    }

    public boolean equals(myDOB obj) {
        //boolean equal = false;
        /*
        if(obj.year == this.year && obj.day == this.day && obj.month = this.month)
            equal = true;
        else
            equal = false;

         */
//        work the same way
        return (obj.day == this.day &&
                obj.month == this.month &&
                obj.year == this.year);

    }
}
