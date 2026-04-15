import java.util.Arrays;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java Library utilities.
 *
 * @author Shrey Sharma
 * @version 17.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("=====================================\n");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}