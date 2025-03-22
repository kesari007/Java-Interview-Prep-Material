package patterns.singleton;


class MyRunnable implements Runnable{

    @Override
    public void run(){
        DBConnection connection = DBConnection.getInstance();
    }
}

public class Main {
    public static void main(String[] args) {
        /*
        Accessing the Singleton instance
        DBConnection instance1 = DBConnection.getDBConnection();
        DBConnection instance2 = DBConnection.getDBConnection();
         */

        // Both references point to the same instance
        //System.out.println(instance1.hashCode() == instance2.hashCode());

        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
