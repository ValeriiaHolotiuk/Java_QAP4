import java.sql.*;

public class DatabaseHandler {
    private static final String URL = "jdbc:postgresql://localhost:5432/valeriaholotiuk";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Valeriia2203!";
    
    public static void savePatientToDB(Patient patient) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO patient (patientid, firstname, lastname, dob) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, patient.getPatientId());
            stmt.setString(2, patient.getPatientFirstName());
            stmt.setString(3, patient.getPatientLastName());
            stmt.setString(4, patient.getPatientDOB());
            stmt.executeUpdate();
            System.out.println("Patient saved to DB.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    public static void readPatientsFromDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient");

            System.out.println("Patients from DB:");
            while (rs.next()) {
                System.out.printf("%d | %s | %s | %s\n",
                        rs.getInt("patientid"),
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getDate("dob"));
            }
        } catch (SQLException e) {
            System.out.println("DB Read Error: " + e.getMessage());
        }
    }
}
