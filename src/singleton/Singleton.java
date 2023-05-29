package singleton;

public class Singleton {
    private static Singleton uniquiInstance;

    private Singleton() {};

    public static Singleton getInstance() {
        if (uniquiInstance == null) {
            uniquiInstance = new Singleton();
        }

        return uniquiInstance;
    }
}