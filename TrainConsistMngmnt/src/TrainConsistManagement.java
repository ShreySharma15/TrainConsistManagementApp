import java.util.*;

/**
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * @author Shrey Sharma
 * @version 15.0
 */

public class TrainConsistManagement {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Rectangular bogie cannot carry Petroleum.");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment attempt completed.");
            }
        }

        public String toString() {
            return shape + " -> Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC15 - Safe Cargo Assignment Using try-catch-finally ");
        System.out.println("=====================================\n");

        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        b1.assignCargo("Coal");
        b2.assignCargo("Petroleum");
        b1.assignCargo("Petroleum");

        System.out.println("\nFinal Bogie Status:");
        System.out.println(b1);
        System.out.println(b2);
    }
}