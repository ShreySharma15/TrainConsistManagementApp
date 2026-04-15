import java.util.*;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity ≤ 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Shrey Sharma
 * @version 14.0
 */

public class TrainConsistManagement {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid capacity for bogie: " + name);
            }
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("=====================================\n");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);

            System.out.println(b1);
            System.out.println(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}