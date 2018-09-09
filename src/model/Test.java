package model;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<student> list = new ArrayList<>();

        student obj = new student("abc", "0012");

        list.add(obj);

        student obj1 = new student("def", "0013");

        list.add(obj1);

        for (student it : list){
            System.out.println(it.getId());
            System.out.println(it.getName());
        }

    }
}
