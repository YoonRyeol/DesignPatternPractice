package singleton;

public class FactorySingleton {

    // thread-safe 하지 않다.
    private static FactorySingleton instance;

    public FactorySingleton getInstance(){
        if(instance == null)
            instance = new FactorySingleton();
        return instance;
    }

    private FactorySingleton(){}
}
