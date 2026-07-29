import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1- Create Map
        Map<String, Integer> studentScores = new HashMap<>();

        // 2. Add using method put(key, value)
        studentScores.put("Dara", 85);
        studentScores.put("Sokha", 92);
        studentScores.put("Bona", 78);

        // 3- Add duplicate data
        studentScores.put("Dara", 95);

        // 4- Retrieve data using method get()
        studentScores.get("Sokha");

        // 5- Checking key or value
        if(studentScores.containsKey("Bona")){
            System.out.println("User Nona already exist.");
        }

        // 6- Remove Key
        studentScores.remove("Nona");

        // 7-Show Size of studentScores
        System.out.println(studentScores.size());

        // 7- Loop HashMap
        studentScores.forEach((name,score)->{
            System.out.println("Name : "+ name + " Score: " + score);
        });
    }
}
