
# LinkedListSorter Program

## Overview
This program reads a list of integer numbers from standard input, stores them in a `LinkedList`, sorts them in ascending order, and displays the sorted list. It uses the Java Collections Framework to handle sorting efficiently.

## Features
- Reads integers from standard input until "done" is entered.
- Sorts the numbers in ascending order using `Collections.sort`.
- Displays the sorted numbers on the console.
- Provides JavaDoc documentation for better understanding of the code.

## Instructions to Run

### Compilation
1. Save the program in a file named `LinkedListSorter.java`.
2. Open a terminal or command prompt, navigate to the directory containing the file, and run:
   ```bash
   javac LinkedListSorter.java
   ```

### Execution
1. After compilation, execute the program using:
   ```bash
   java LinkedListSorter
   ```

2. Input integers one by one, pressing Enter after each. Type `done` when all numbers are entered.

### Generating JavaDoc
1. To generate HTML documentation for the program, use the following command:
   ```bash
   javadoc -d doc LinkedListSorter.java
   ```

   This will create a `doc` directory containing the generated documentation.

## Example

### Input
```
Enter integers (type 'done' to finish):
5
3
8
1
done
```

### Output
```
Sorted numbers:
1
3
5
8
```

## Design
### Diagram
Refer to the attached PDF (`LinkedListSorter_Diagram.pdf`) for the design and structure of the program.

### Key Components
- **LinkedList**: Used to dynamically store numbers.
- **Collections Framework**: Handles sorting efficiently with the `Collections.sort` method.

## Notes
- The program does not rely on any IDE and can be run entirely from the command line.
- Provides clear error messages for invalid inputs.
- Efficiently utilizes existing Java libraries to avoid reinventing solutions.

## Requirements
- Java Development Kit (JDK) 8 or above installed on your system.

---

**Author:** [Your Name]  
**Date:** [Today's Date]
