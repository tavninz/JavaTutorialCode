import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Create ArrayList for storing (String)
        ArrayList<String> cars = new ArrayList<String>();

        // Add item to ArrayList
        cars.add("BMW");
        cars.add("Roll Royce");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Get value index (Get Item)
        String bmw = cars.get(0);
        String bmw1 = cars.getFirst();

        // Modify item
        cars.set(3,"Rang Rover");

        // Remove Item
        cars.remove(3);

        // ArrayList Size
        System.out.println(cars.size());

        // Method
        /*
        * add(element)
        * add(index,element)
        * get(index)
        * set(index,element)
        * remove(index) or remove(object)
        * clear()
        * size()
        * contain(object)
        *
        * */
    }
}
