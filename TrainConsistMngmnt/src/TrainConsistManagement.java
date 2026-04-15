import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author Shrey Sharma
 * @version 12.0
 */

public class TrainConsistManagement {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " -> Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("=====================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));

        boolean safe = goodsBogies.stream()
                .allMatch(b ->
                        (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum")) ||
                        (b.type.equals("Rectangular") && !b.cargo.equals("Petroleum"))
                );

        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b);
        }

        System.out.println("\nSafety Compliance Status: " + (safe ? "SAFE" : "NOT SAFE"));
    }
}