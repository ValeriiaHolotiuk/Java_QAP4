public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); 
        this.subject = subject;
        this.salary = salary;
    }
    
    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}
