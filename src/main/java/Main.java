public class Main {
    public static void main(String[] args) {

        Student[] classroom = new Student[4];
        classroom[0] = new Student("Dara Kok",56);
        classroom[1] = new Student("Visal hong",34);
        classroom[2] = new Student("Reaksa Ty",21);
        classroom[3] = new Student("Reaksa Ty",25);

        for(int i=0; i< classroom.length; i++){
            classroom[i].Display();
        }

        System.out.println("\n");

        // Initialize with value
        Student[] classmate = {
                new Student("Sina Sin",45),
                new Student("Cheasrouch Sok",45),
                new Student("Dyna Sok",45),
        };

        for(int i=0; i< classmate.length; i++){
            classmate[i].Display();
        }
    }
}


class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    void Display(){
        System.out.println("Student Name:" + name + " Student Age: " + age);
    }
}