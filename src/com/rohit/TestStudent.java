package com.rohit;

public interface TestStudent {

    void printName();

    static void printBody(){
        System.out.println("method from the interface");
    }
}

class StudnetName implements TestStudent{

    @Override
    public void printName() {
        System.out.println("printName invoked");
    }

    public static StudnetName getStudentName(){
        return new StudnetName();
    }

    public static void main(String[] args) {

        TestStudent obj = getStudentName();

        obj.printName();
        TestStudent.printBody();

    }
}
