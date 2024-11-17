
# StackSorter Program (Maintenance Task from Project #4)

## Overview
This program is a **maintenance task** that adapts the functionality from **Project #4**. 
It replaces the use of `LinkedList` with a `Stack` to store and sort integers in ascending order. The key components of the previous project, such as input handling, sorting, and output logic, have been retained with minimal changes.

## Features
- Reads integers from standard input until "done" is entered.
- Stores integers in a `Stack` instead of a `LinkedList`.
- Sorts the stack in ascending order using `Collections.sort` (same as Project #4).
- Displays sorted integers from the stack.

## Instructions to Run

### Compilation
1. Save the program in a file named `StackSorter.java`.
2. Open a terminal or command prompt, navigate to the directory containing the file, and run:
   ```bash
   javac StackSorter.java
   ```

### Execution
1. After compilation, execute the program using:
   ```bash
   java StackSorter
   ```

2. Input integers one by one, pressing Enter after each. Type `done` when all numbers are entered.

### Generating JavaDoc
1. To generate HTML documentation for the program, use the following command:
   ```bash
   javadoc -d doc StackSorter.java
   ```

   This will create a `doc` directory containing the generated documentation.

## Example

### Input
```
Enter integers (type 'done' to finish):
10
5
20
1
done
```

### Output
```
Sorted numbers:
1
5
10
20
```

## Maintenance Notes
- **Reused Components:**
  - **Input Handling:** The logic to read integers, validate input, and handle errors is identical to Project #4.
  - **Sorting:** The `Collections.sort` method is reused to sort integers, ensuring consistency with the previous implementation.
  - **Output Logic:** Displays the sorted numbers in the same way as Project #4, with minor adjustments for stack traversal.
- **Changes Made:**
  - Replaced the `LinkedList` data structure with a `Stack`.
  - Updated methods to use `push()` for adding elements instead of `add()`.
  - Adjusted comments and documentation to reflect the changes.

## Design
### Diagram
Refer to the attached PDF (`StackSorter_Diagram.pdf`) for the design and structure of the program.

### Key Components
- **Stack:** Used to dynamically store integers.
- **Collections Framework:** Handles sorting efficiently with `Collections.sort`.

## Requirements
- Java Development Kit (JDK) 8 or above installed on your system.

## Notes
- The program does not rely on any IDE and can be run entirely from the command line.
- Efficiently utilizes the Java Collections Framework for stack management and sorting.
- Documentation explicitly highlights reused components and changes made.

---

**Author:** Janice Ziesig
 
