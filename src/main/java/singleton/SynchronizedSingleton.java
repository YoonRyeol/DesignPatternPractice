package singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    // 메서드 전체에 락을 걸면서 성능 문제가 있을 수 있다.
    // 락은 instance가 초기화되는 시점에서 만 필요하다.
    // instance가 초기화된 시점에서도, 쓸데 없는 락을 걸게 된다.
    public static synchronized SynchronizedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    private SynchronizedSingleton(){}

}
