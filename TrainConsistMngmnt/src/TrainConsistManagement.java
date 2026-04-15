/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author Shrey Sharma
 * @version 20.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC20 - Exception Handling During Search Operations ");
        System.out.println("=====================================\n");

        try {

            String[] bogieIds = {};

            String searchId = "BG101";

            if (bogieIds.length == 0) {
                throw new IllegalStateException("Search operation failed: No bogies exist in the train.");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID " + searchId + " found.");
            } else {
                System.out.println("Bogie ID " + searchId + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}