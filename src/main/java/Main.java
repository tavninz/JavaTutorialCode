public class Main {
    public static void main(String[] args) {

        // 1-length() : Returns the total number of characters in the string, including spaces and punctuation.
        System.out.println("Hello".length());// Output: 5

        // 2-toLowerCase() : Converts all characters in the string to lowercase.
        System.out.println("JAVA Programming".toLowerCase());// Output: java programming

        // 3-charAt(int index) : Returns the character at a specific position (index). Remember, Java starts counting from 0.
        System.out.println("Cambodia".charAt(0));// Output: C


        // 4-contains(CharSequence s) : Checks if the string contains a specific sequence of characters. It returns a boolean (true or false). It is case-sensitive!
        System.out.println("Full-Stack Developer".contains("Stack"));// Output: true

        // 5- equals(Object anObject): Compares two strings to see if their actual text content matches exactly. Never use == to compare strings in Java, always use .equals().
        System.out.println("Apple".equals("Apple"));// Output: true

        // 6- equalsIgnoreCase(String anotherString): Compares two strings just like .equals(), but ignores whether the letters are uppercase or lowercase.
        System.out.println("admin".equalsIgnoreCase("ADMIN"));// Output: true


        // 7-substring(int beginIndex) / substring(int beginIndex, int endIndex) : Extracts a smaller part of the string. If you provide a second index, it stops right before that position.
        String text = "JavaScript";
        System.out.println(text.substring(4));     // Output: Script (From index 4 to end)
        System.out.println(text.substring(0, 4));  // Output: Java   (From index 0 up to 4)


        // 8- replace(char oldChar, char newChar): Replaces all occurrences of a specific character (or target text) with a new one.
        System.out.println("Node.js".replace('.', '-'));
        // Output: Node-js

        // 9- trim() : Removes any blank spaces from the very beginning and the very end of a string. It leaves spaces in the middle alone.
        System.out.println("   Hello World   ".trim());
        // Output: Hello World


        // 10-split(String regex): Splits a single string into an array of smaller strings based on a separator (like a space or comma).
        String[] words = "Learn Java Fast".split(" ");
        System.out.println(words[0]); // Output: Learn
        System.out.println(words[1]); // Output: Java
        
        // isEmpty() / isBlank(): isEmpty() returns true only if the string length is exactly 0.
        //
        //isBlank() returns true if the string is empty or contains only empty spaces.
        System.out.println("".isEmpty());      // Output: true
        System.out.println("   ".isEmpty());   // Output: false (spaces count as length)
        System.out.println("   ".isBlank());   // Output: true  (it sees only whitespace)
    }
}
