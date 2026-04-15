/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic searching logic using sequential traversal.
 *
 * @author Shrey Sharma
 * @version 18.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=====================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nBogie ID " + searchId + " found in the train consist.");
        } else {
            System.out.println("\nBogie ID " + searchId + " not found.");
        }
    }
}