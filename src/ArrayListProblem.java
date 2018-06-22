import java.util.ArrayList;

public class ArrayListProblem {

    public static void main(String[] args) {


        ArrayList<String > listFirstName = new ArrayList<>();
        ArrayList<String > listLastName = new ArrayList<>();
        ArrayList<String > listCombine = new ArrayList<>();


        listFirstName.add("rohit");
        listFirstName.add("vivek");


        listLastName.add("kumar");
        listLastName.add("prasad");

        for (int i = 0; i < listFirstName.size(); i++) {
            String name = listFirstName.get(i).toString();
//            listCombine.add(name);
            String lastname = listLastName.get(i).toString();
//            listCombine.add(lastname);

            String  temp = name.concat(lastname);
// Storing the combined data to the list.
            listCombine.add(temp);


        }


        for (String list : listCombine){
            System.out.println(list);
        }


}
}
