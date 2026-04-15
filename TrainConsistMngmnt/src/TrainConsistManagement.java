import java.util.Arrays;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Shrey Sharma
 * @version 19.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=====================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("\nBogie ID " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie ID " + key + " not found.");
        }
    }
}