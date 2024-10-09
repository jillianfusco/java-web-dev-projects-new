import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int x = 10;
        int y = 0; // You can test with different values for y

        try {
            int result = Divide(x, y);
            System.out.println("Result of division: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) throws CustomArithmeticException {
        if (y == 0) {
            throw new CustomArithmeticException("Cannot divide by zero.");
        }
        return x / y; // Perform the division if y is not zero
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        return 0;
    }
}
