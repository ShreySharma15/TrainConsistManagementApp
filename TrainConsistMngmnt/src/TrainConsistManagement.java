/*
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Shrey Sharma
 * @version 5.0
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=====================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nUC5 operations completed successfully...");
    }
}