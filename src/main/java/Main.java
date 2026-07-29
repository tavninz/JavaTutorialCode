import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Camery");
        cars.add("Hiyanday");
        cars.add("Toyota");
        System.out.println(cars);

        // 3. Methods ពិសេសរបស់ LinkedList (មានប្រយោជន៍សម្រាប់ធ្វើ Queue ឬ Stack)
        cars.addFirst("Cameron");
        cars.addLast("VolVo");

        // 4. Get First Item and Last Item
        cars.getFirst();
        cars.getLast();

        // 5. Remove First and Last Item
        cars.removeFirst();
        cars.removeLast();
    }
}
