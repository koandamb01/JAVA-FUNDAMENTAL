import java.util.HashMap;
import java.util.Set;

public class HasMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        // set the userMap with keys and values
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");

        String name = userMap.get("nninja@codingdojo.com");
        System.out.println("your name is: " + name);

        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}