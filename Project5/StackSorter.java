import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A program to read integers from standard input, store them in a sorted Stack, and display the result.
 * 
 * Maintenance Notes:
 * - Adapted from Project #4, where we used LinkedList.
 * - Now uses a Stack instead of LinkedList, ensuring minimal code changes.
 * - Sorting still utilizes Collections.sort for efficiency, as in Project #4.
 * 
 * Usage:
 * - Compile: javac StackSorter.java
 * - Run: java StackSorter
 * - Generate JavaDoc: javadoc -d doc StackSorter.java
 */
public class StackSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter integers (type 'done' to finish):");

        // Read integers from standard input
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                stack.push(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        // Sort the Stack using Collections Framework
        Collections.sort(stack);

        // Display the sorted numbers (from top to bottom of the stack)
        System.out.println("Sorted numbers:");
        for (int num : stack) {
            System.out.println(num);
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
