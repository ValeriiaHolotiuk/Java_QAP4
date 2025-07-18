public class Patient {
    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private String patientDOB;

    public Patient(int patientId, String firstName, String lastName, String dob) {
        this.patientId = patientId;
        this.patientFirstName = firstName;
        this.patientLastName = lastName;
        this.patientDOB = dob;
    }

    // Getters and toString()
}
