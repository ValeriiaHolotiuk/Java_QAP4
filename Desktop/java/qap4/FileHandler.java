import java.io.*;

public class FileHandler {
    private static final String FILE_NAME = "drugs.txt";

    public static void saveDrugToFile(Drug drug) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(drug.toString());
            writer.newLine();
            System.out.println("Drug saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving drug: " + e.getMessage());
        }
    }

    public static void readDrugsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Drugs in file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading drugs: " + e.getMessage());
        }
    }
}

