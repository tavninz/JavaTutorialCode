public class Main {
    public static void main(String[] args) {

        // A. Automatic Conversion (Widening Casting)
        // byte → short → char → int → long → float → double
        int standardInt = 45;
        double automaticDouble = standardInt; // Automatically converted int to double

        System.out.println(standardInt);     // Output: 45
        System.out.println(automaticDouble); // Output: 45.0

        // B. Manual Conversion (Narrowing Casting)
        double originalPrice = 12.75;
        int integerPrice = (int) originalPrice; // Manually casting double to int

        System.out.println(originalPrice); // Output: 12.75
        System.out.println(integerPrice);  // Output: 12 (The decimal part .75 is completely chopped off!)

        // 2. Escape Characters
        // 1. Type Casting Example
        double averageScore = 95.8;
        int roundedScore = (int) averageScore;

        System.out.println("--- Student Summary ---");
        System.out.printf("Score:\t%d/100 (Casted from %.1f)\n", roundedScore, averageScore);
        System.out.println("Status:\t\"Passed Successfully\"");
        System.out.println("Path:\tsrc\\main\\java");
    }
}
