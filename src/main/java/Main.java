public class Main {
    public static void main(String[] args) {
        // 1- for Loop
        // Prints: 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // 1- foreach Loop

        String[] programmingLanguages = {"Java", "Python", "JavaScript"};
        // Read as: "For each String lang in programmingLanguages"
        for (String lang : programmingLanguages) {
            System.out.println("Language: " + lang);
        }

        // 3- While Loop
        int count = 1;

        while (count <= 3) {
            System.out.println("Count is: " + count);
            count++; // Crucial step to eventually stop the loop
        }

        // 4- Do While Loop

        int number = 10;

        do {
            System.out.println("This will print exactly once, even though 10 is not less than 5.");
        } while (number < 5);
    }
}
