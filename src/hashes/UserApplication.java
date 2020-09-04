package hashes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jvazquezolivares
 */
public class UserApplication {
    public static void main(String[] args) {
        Map<User, User> users = new HashMap<>();
        User user1 = new User(1, "John", "john@domain.com", "12345");
        User user2 = new User(2, "Jennifer", "jennifer@domain.com", "12345");
        User user3 = new User(3, "Mary", "mary@domain.com", "12345");
         User user4 = new User(3, "Mary", "mary@domain.com", "23412353446");
        
        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);
        users.put(user4, user4);
        
        //System.out.println("hashcode de user1: " + user1.hashCode());

    }
}
