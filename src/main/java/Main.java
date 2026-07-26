// Inheritance
class Animal{
    String name;
    public  void eat(){
        System.out.println(name +" is Eating.");
    }
}
class Car{
    String name;
    String color;
}

class Dog extends Animal{
    public void bark(){
        System.out.println(name + "is barking.");
    }
}

class Cat extends Animal{
    Cat(String name){
        super();
        this.name = name;
    }
}

// Multiple Implimentation
interface Character {
    void attack();
}
interface Weapon {
    void use();
}
class Worrior implements Character,Weapon{

    @Override
    public void attack() {
        
    }

    @Override
    public void use() {

    }
}



public class Main {
    public static void main(String[] args) {
    }
}
