import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Create Set & HashSet
        Set<String> userIds = new HashSet<>();

        // 2. Add items
        userIds.add("USER_01");
        userIds.add("USER_02");
        userIds.add("USER_03");

        // 3- Duplicate key userIds.add("USER_01");// No Dulicate key in Set
        System.out.println(userIds);

        // 4- Check Key
        if(userIds.contains("USER_02")){
            System.out.println("USER_02 ready in Database.");
        }

        // 5- Remove
        userIds.remove("USER_02");

        // 6- Check Size of
        System.out.println(userIds.size());


        // Create HashSet

    }
}
