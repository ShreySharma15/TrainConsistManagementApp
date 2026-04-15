/*
 * MAIN CLASS - TrainConsistManagement
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Shrey Sharma
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("=====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        System.out.println("Unsorted Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        Collections.sort(bogies, (b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nBogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}