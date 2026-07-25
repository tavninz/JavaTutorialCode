
// Create New Class

class Vehicle {
    // Create Class Property/Field
    String name;
    String color;
    double price;
    int amount;
}
public class Main {
    public static void main(String[] args) {

        // Create Object of Class using keyword new

        Vehicle vehicle = new Vehicle(); // Create new object from Vehicle class

        // Access to field or property of Class
        // Give property value
        vehicle.name = "BMW";
        vehicle.color = "Black";
        vehicle.price = 111000.0;
        vehicle.amount = 1;

        // Display

        System.out.println(vehicle.name);
        System.out.println(vehicle.color);
        System.out.println(vehicle.price);
        System.out.println(vehicle.amount);


        // Create Other Object

        Vehicle luxaryCar = new Vehicle();
        luxaryCar.name = "Lexus";
        luxaryCar.color = "Silever";
        luxaryCar.price = 250000;
        luxaryCar.amount = 5;

        System.out.println(luxaryCar.name);
        System.out.println(luxaryCar.color);
        System.out.println(luxaryCar.price);
        System.out.println(luxaryCar.amount);

    }
}
