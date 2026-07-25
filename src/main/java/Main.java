class Fruit {
    // Property or Field
    String name;
    String color;
    int amount;

    public void display(){
        System.out.println("Display Method in Class.");
    }
    public void showInfo(){
        System.out.printf("Name :%s, Color: %s, Amount: %d",name,color,amount);
    }
}
public class Main {
    public static void main(String[] args) {
        //1- OOP Class and Object
        Fruit fruit1 = new Fruit();

        // 2- Property/Field
        fruit1.name = "Apple";
        fruit1.color = "Red";
        fruit1.amount = 30;

        System.out.println(fruit1.name);
        System.out.println(fruit1.color);
        System.out.println(fruit1.amount);


        // 3- Method
        fruit1.display(); // Call method in class
        fruit1.showInfo();
    }
}
