import java.util.*;

public class NumberSystemConversion {

    // Function to convert decimal to binary
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2); // Insert the remainder (0 or 1) at the beginning
            n = n / 2;  // Divide the number by 2
        }
        return binary.toString();
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;  // Base of binary is 2, starting from the least significant bit (rightmost)
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;  // Add base value if the bit is 1
            }
            base = base * 2;  // Increase the base (2^i)
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal to Binary: " + binary);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        sc.nextLine();  // To consume the newline left by nextInt()
        String binaryInput = sc.nextLine();
        int decimalConverted = binaryToDecimal(binaryInput);
        System.out.println("Binary to Decimal: " + decimalConverted);

        sc.close();
    }
}
