/*
 * MAIN CLASS - TrainConsistManagement
 *
* Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not added
 * into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Shrey Sharma
 * @version 3.0
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=====================================\n");

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogies);

        System.out.println("\nDuplicate IDs were automatically ignored.");

        System.out.println("\nUC3 operations completed successfully...");
    }
}