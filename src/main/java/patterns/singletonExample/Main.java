package patterns.singletonExample;

public class Main {
    public static void main(String[] args){
        SingletonWithoutThreadSafety obj2 = SingletonWithoutThreadSafety.getInstance("obj2");
        SingletonWithoutThreadSafety obj1 = SingletonWithoutThreadSafety.getInstance("Obj1");

        // proof that both are same instance
        //System.out.println(obj1.hashCode());
        //System.out.println(obj2.hashCode());

        Runnable runnable = new MyRunnable();

        Thread threadOne = new Thread(runnable, "ThreadOne");
        Thread threadTwo = new Thread(runnable, "ThreadTwo");

        threadOne.start();
        threadTwo.start();

    }
}
