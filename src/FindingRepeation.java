import java.util.HashMap;
import java.util.Map;

public class FindingRepeation {

    public static void main(String[] args) {
        String name = "aaaa bbb ccc ddd ee";
       char[] charName = name.toCharArray();

       int cout = 0;

        Map<String , String >  map = new HashMap<>();

        for (int i = 0; i < charName.length ; i++) {

            char key = charName[i];
            String stringKey = Character.toString(key);

        if ( map.containsKey(stringKey)){
            
        }

        }
    }

}
