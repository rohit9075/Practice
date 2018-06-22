package model;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> studentList;
        studentList = new ArrayList<>();

       studentList.add(new Student("Rohit  ","Bangalore"));
        studentList.add(new Student("Mohit  ","Mangalore"));
        studentList.add(new Student("Sohit  ","Patna"));


        for (Student st : studentList){

            String name = st.getName();
            String city = st.getCity();

            System.out.println(name + city);
        }


    }





}
