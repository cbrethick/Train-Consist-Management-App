import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ---------- UC2 (Passenger Bogies) ----------
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nIs Sleeper present? " + exists);

        // ---------- UC3 (Unique Bogie IDs using HashSet) ----------
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nBogie IDs after adding (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}