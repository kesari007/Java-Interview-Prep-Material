package patterns.singletonExample;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        SingletonWithThreadSafety instance = SingletonWithThreadSafety.getInstance(Thread.currentThread().getName());
    }
}
