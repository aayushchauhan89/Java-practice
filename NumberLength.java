import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert the number to a string to count its length
        String numString = Long.toString(number);

        // Get the length of the string (which is the number of digits)
        int length = numString.length();

        // Output the result
        System.out.println("The length of the number is: " + length);
        scanner.close();
    }
}
