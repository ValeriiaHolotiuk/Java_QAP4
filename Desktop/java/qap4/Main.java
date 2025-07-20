import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Save Drug to File");
            System.out.println("2. Read Drugs from File");
            System.out.println("3. Save Patient to DB");
            System.out.println("4. Read Patients from DB");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    Drug drug = new Drug(101, "Ibuprofen", 10.50, "200mg");
                    FileHandler.saveDrugToFile(drug);
                    break;
                case 2:
                    FileHandler.readDrugsFromFile();
                    break;
                case 3:
                    Patient patient = new Patient(201, "Alice", "Smith", "1992-03-15");
                    DatabaseHandler.savePatientToDB(patient);
                    break;
                case 4:
                    DatabaseHandler.readPatientsFromDB();
                    break;
                case 0:
                    System.out.println("Exiting. Bye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 0);

        sc.close();
    }
}
