import java.util.Scanner; // 1. Import the Scanner class

public class Main {

    // 3. Documentation Comments (/** ... */)
    /**
     * The Calculator class provides basic mathematical operations.
     *
     * @author Nyn
     * @version 1.0
     */
    public class Calculator {

        /**
         * Calculates the sum of two integers.
         *
         * @param a The first number to add
         * @param b The second number to add
         * @return The total sum of a and b
         */
        public int add(int a, int b) {
            return a + b;
        }
    }
    public static void main(String[] args) {


        // 1. Single-Line Comments (//)

        int score = 100; // Initialize the student's starting score
        // System.out.println("This won't run");
        System.out.println(score);

        // 2. Multi-Line Comments (/* ... */)

        /*
         * The following block of code handles database connections.
         * It initializes the driver, sets up the connection pool,
         * and verifies that the server is listening on port 3306.
         */
        System.out.println("Database connected successfully!");



        // Read from keyboard
        Scanner input = new Scanner(System.in);

        // Reading text (a single word)
        System.out.print("Enter your first name: ");
        String name = input.next();

        // Reading a whole number (Integer)
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Reading a decimal number (Double)
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        // Displaying the gathered information
        System.out.printf("\nHello %s! You are %d years old with a GPA of %.2f.\n", name, age, gpa);

        // 3. Close the scanner when you are completely done using it
        input.close();
    }
}
