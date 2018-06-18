package com.rohit;

 abstract  class Book {

     Book() {
         System.out.println("Constructor invoked");
     }

     abstract void printBook();
//    static void readBook(){
//        System.out.println("Readbook form parent invoked");
//    }


}

  class TestBook extends Book{

    @Override
    public void printBook() {
        System.out.println("printBook invoked");
    }

    private static TestBook getBook(){

        return new TestBook();
    }

    public static void main(String[] args) {

        Book obj = getBook();
        obj.printBook();


//        Book.readBook();
    }

}
