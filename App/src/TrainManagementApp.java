import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " → " + cargo;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        System.out.println("\nGoods Bogies:");
        System.out.println(goodsBogies);

        // SAFETY CHECK using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> 
                    !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }
    }
}