import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String > maplist = new HashMap<>();

        maplist.put("101", "rohit kumar");
        maplist.put("102", "vivek kumar");
        maplist.put("103", "ramesh kumar");
        maplist.put("104", "dinesh kumar");


        for (Map.Entry<String , String > map : maplist.entrySet()){

            String  key = map.getKey().toString();
            int intkey = Integer.valueOf(key);

            if (intkey == 102){

                String  name = map.getValue().toString();
                System.out.println(name);
            }
        }

    }
}
