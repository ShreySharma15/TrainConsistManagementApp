import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Shrey Sharma
 * @version 11.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("=====================================\n");

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        Pattern trainPattern = Pattern.compile("^TRN-\\d{4}$");
        Pattern cargoPattern = Pattern.compile("^[A-Z]{3}-[A-Z]{2}$");

        boolean trainValid = trainPattern.matcher(trainId).matches();
        boolean cargoValid = cargoPattern.matcher(cargoCode).matches();

        System.out.println("\nValidation Results:");

        if (trainValid) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Train ID is invalid.");
        }

        if (cargoValid) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Cargo Code is invalid.");
        }
    }
}