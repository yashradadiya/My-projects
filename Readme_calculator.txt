Calculator - Java Console Application
This is a simple console-based calculator program written in Java. It allows users to perform basic arithmetic operations interactively until they choose to exit.

Features
Supports the four basic operations: addition (+), subtraction (-), multiplication (*), and division (/).

Handles invalid inputs gracefully with error messages.

Prevents division by zero with a warning.

Allows repeated calculations until the user decides to quit.

Requirements
Java Development Kit (JDK) 8 or higher

Command-line terminal or IDE (such as IntelliJ, Eclipse, or VS Code)

How to Compile
Save the code as Calculator.java.

Open a terminal or command prompt in the directory where the file is located.

Compile the program using:

bash
javac Calculator.java
How to Run
Execute the compiled program with:

bash
java Calculator
Usage
Enter the first number.

Enter an operator (+, -, *, /).

Enter the second number.

The program will display the result.

You will be asked if you want to perform another calculation:

Enter y to continue.

Enter n to quit.

Example Interaction
text
=== Basic Calculator ===
Supported operations: +, -, *, /

Enter first number: 10
Enter operator (+, -, *, /): *
Enter second number: 5
Result: 10.0 * 5.0 = 50.0

Do you want to perform another calculation? (y/n): n
Thank you for using the calculator!
Error Handling
If the user enters an invalid number, the program will display an error and prompt again.

If division by zero is attempted, the program displays an error and skips the operation.

If an invalid operator is entered, the program warns and continues.