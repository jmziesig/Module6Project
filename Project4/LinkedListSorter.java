import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A program to read integers from standard input, store them in a sorted LinkedList, and display the result.
 * 
 * Instructions:
 * - Reads integers from standard input until the user types "done".
 * - Stores integers in a LinkedList sorted in ascending order.
 * - Leverages the Java Collections Framework for sorting.
 * 
 * Usage:
 * - Compile: javac LinkedListSorter.java
 * - Run: java LinkedListSorter
 * - Generate JavaDoc: javadoc -d doc LinkedListSorter.java
 */
public class LinkedListSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        // Read integers from standard input
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        // Sort the LinkedList using the Collections Framework
        Collections.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
