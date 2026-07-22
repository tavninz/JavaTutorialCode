import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        // 1-Declare Array
        int[] num;

        // 2-Declare Fixed Size
        int[] num1 = new int[4];
        num1[0] = 2;
        num1[1] = 3;

        // 3-Declare Initialize Value

        int[] num2 = {1,2,3};

        // 4-Access Array
        System.out.println(num2[0]);

        // 5-Change Value
        num2[2] = 50;

        // 6-Loop Array
        int[] scores = {90, 85, 95};
        // For-each loop read-only style
        for (int score : scores) {
            System.out.println(score);
        }

        // 7-Array Length
        System.out.println(scores.length);

        // 8-Sort-Array
        int[] data = {8,9,1};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data)); // Output: [1, 2, 5, 8]

        System.out.println(Arrays.toString(data)); // Output: [5, 2, 8, 1]
    }
}
