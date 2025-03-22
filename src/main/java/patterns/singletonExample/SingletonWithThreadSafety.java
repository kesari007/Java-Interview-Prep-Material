package patterns.singletonExample;

public class SingletonWithThreadSafety {
    private static volatile SingletonWithThreadSafety instance;

    private SingletonWithThreadSafety(String name){
        System.out.println("Instance created by " + name);
    }

    public static SingletonWithThreadSafety getInstance(String name){
        if(instance == null){
            synchronized (SingletonWithThreadSafety.class){
                if(instance == null){
                    instance = new SingletonWithThreadSafety(name);
                }
            }
        }
        return instance;
    }
}
