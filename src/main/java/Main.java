public class Main {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int x = 10;
        int y = 10;

        int sum = x + y;
        sum = x - y;
        sum = x * y;
        sum = x / y;
        sum = x % y;

        // 2. Assignment Operators
        x += 5;     // Shortcut for: x = x + 5  (x becomes 15)
        x -= 2;     // Shortcut for: x = x - 2  (x becomes 13)
        x *= 2;     // Shortcut for: x = x * 2  (x becomes 26)
        x /= 2;     // Shortcut for: x = x / 2  (x becomes 13)
        x %= 5;     // Shortcut for: x = x % 5  (x becomes 3)

        // 3. Comparison (Relational) Operators

        int speed = 80;
        System.out.println(speed == 80); // true  (Equal to)
        System.out.println(speed != 100); // true  (Not equal to)
        System.out.println(speed > 100);  // false (Greater than)
        System.out.println(speed < 100);  // true  (Less than)
        System.out.println(speed >= 80);  // true  (Greater than or equal to)
        System.out.println(speed <= 50);  // false (Less than or equal to)

        // 4. Logical Operators
        // True because 25 is greater than 18 AND isPassed is true

        // && (Logical AND): Returns true only if both conditions are true.
        int age = 5;
        boolean isPassed = false;
        boolean canDrive = (age > 18) && isPassed;

        // || (Logical OR): Returns true if at least one of the conditions is true.

        // True if you have cash OR you have a credit card
        boolean hasCash = false;
        boolean hasCreditCard = true;
        boolean canBuy = hasCash || hasCreditCard;

        // ! (Logical NOT): Reverses the boolean value (turns true to false, and vice versa).
        boolean isLoggedIn = false;
        boolean isLoggedOut = !isLoggedIn;

        // 5. Increment and Decrement Operators

        // ++ (Increment): Adds 1 to the variable (x++ is the same as x = x + 1)
        //-- (Decrement): Subtracts 1 from the variable (x-- is the same as x = x - 1)

        int count = 0;
        count++; // count is now 1
        count--; // count is back to 0
    }
}
