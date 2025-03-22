package javaexamples;

public class Main {

    public static void main(String[] args) {
       Main obj1 = new Main();
       obj1 = null;

       //System.gc(); // garbage collection
        Runtime.getRuntime().gc();
       System.out.println("In the main method");
    }

    @Override
    protected void finalize() throws Throwable {
       System.out.println("Finalize method called!");
    }
}
