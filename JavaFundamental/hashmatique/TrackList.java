import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> myTrack = new HashMap<String, String>();
        myTrack.put("Belive", "I'ma say all the words inside my head");
        myTrack.put("2pac", "Who The Fuck Shot 2pac? Something Everybody Wants ");
        myTrack.put("Booba", "Mollah Omar Le vrai Mollah Omar Il est minuit sur la Audemars");
        myTrack.put("Sean", "right off the hinges A workaholic that's");

        Set<String> keys = myTrack.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(myTrack.get(key));
        }
    }

}