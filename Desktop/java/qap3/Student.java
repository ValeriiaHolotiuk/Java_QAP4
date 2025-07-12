public class Student extends Person {
    protected String myIdNum; // ID Number
    protected double myGPA;   // GPA

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    // Getters
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setters
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
