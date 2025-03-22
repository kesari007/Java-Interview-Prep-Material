package patterns.singletonExample;

public class SingletonWithoutThreadSafety {

    private static SingletonWithoutThreadSafety instance ;

    private SingletonWithoutThreadSafety(String name){
        System.out.println("Singleton instance created by " + name);
    }

    public static SingletonWithoutThreadSafety getInstance(String name){
        if(instance == null){
            instance = new SingletonWithoutThreadSafety(name);
        }
        return instance;
    }
}
