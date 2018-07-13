import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {

    public static void main(String[] args) {

        String string = "aaabbbcccdddeeefff";

        // converting string to char array
        char[] charArray  = string.toCharArray();

        // creating the map object.
        Map<Character,Integer> map = new HashMap<>();

        // Iterating the char array.
        for (int i = 0; i < charArray.length; i++) {

            // getting the char at position i
            char key = charArray[i];

            // checking char is present in the map or not
            if (map.containsKey(key)) {

                // if present get the count of the char
                int count = map.get(key);

                // and push the count value by plus one
                map.put(key, ++count);

            } else {

                // if char is already not in map push it with count value one
                map.put(key, 1);
            }
        }

        // printing the char and number of count
        for (Map.Entry obj : map.entrySet()){
            System.out.println(" Char :  " + obj.getKey() +  "  " + "Number :  " + obj.getValue() );
        }
    }
}
