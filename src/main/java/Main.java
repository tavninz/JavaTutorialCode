public class Main {
    public static void main(String[] args) {
        // println()
        System.out.println("Hello World");


        // print()

        System.out.print("Hello World");
        System.out.print("Java Programming");

        // printf()

        System.out.printf("%.2f", 3.14159); // Outputs: 3.14

        System.out.println("\n");

        System.out.printf("%,d", 1000000); // Outputs: 1,000,000
        System.out.println("\n");

        // Right-aligned (default): uses 10 spaces total for the name
        System.out.printf("%10s: $%d\n", "Shoes", 50);

        System.out.println("\n");
        // Left-aligned: using the minus (-) flag
        System.out.printf("%-10s: $%d\n", "Shirt", 20);


    }
}
