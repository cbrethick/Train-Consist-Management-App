import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper present? " + exists);

        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);
    }
}