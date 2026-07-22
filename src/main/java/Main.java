public class Main {
    public static void main(String[] args) {
        //If
        int score = 85;

        if (score >= 50) {
            System.out.println("You passed the exam!");
        }

        // 2- If,Else

        int age = 16;

        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You are too young to vote.");
        }


        // 3- If, Else-If, Else

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B"); // This will execute
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // 4- Conditional Operator

        int examScore = 45;
        // If score >= 50, status gets "Pass", otherwise it gets "Fail"
        String status = (examScore >= 50) ? "Pass" : "Fail";

        System.out.println("Result: " + status); // Output: Result: Fail

        // 5- Switch Case
        int dayOfWeek = 2;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); // This executes
                break; // break stops execution from hitting case 3
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }


        // 6- for Loop
        // Prints: 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // 7- foreach Loop

        String[] programmingLanguages = {"Java", "Python", "JavaScript"};
        // Read as: "For each String lang in programmingLanguages"
        for (String lang : programmingLanguages) {
            System.out.println("Language: " + lang);
        }

        // 8- While Loop
        int count = 1;

        while (count <= 3) {
            System.out.println("Count is: " + count);
            count++; // Crucial step to eventually stop the loop
        }

        // 9- Do While Loop

        int number = 10;

        do {
            System.out.println("This will print exactly once, even though 10 is not less than 5.");
        } while (number < 5);
    }
}
