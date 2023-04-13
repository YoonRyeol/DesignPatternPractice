package singleton;

public class DclSingleton {
    // 자바는 cpu cache에 멤버변수의 값을 캐싱한다. 여러 스레드가 접근할 때, 오래된 값을 읽을 수 있음.
    // volatile 키워드를 써 줌으로써, cpu cache가 아닌 메모리로 부터 fresh 한 값을 읽고, 쓰는 것을 보장한다.
    // 쓰기 연산시에 thread-safe 함을 보장하지는 못함...
    // 자바 1.4 이전에서는 volatile 키워드의 기능이 보장되지 않았다. 따라서 1.4 이전에는 사용할 수 없는 코드임.
    private static volatile DclSingleton instance;

    // instance 변수 초기화 시점에만 lock이 걸린다.
    // 두 번 체크하는 이유는 A, B 쓰레드가 처음에 instance가 없어서 락을 시도하면
    // 뒤에서 한 번 더 체크해줘야 초기화 된 변수를 다시 초기화하지 않기 때문이다.
    public static DclSingleton getInstance(){
        if(instance == null){
            synchronized (DclSingleton.class){
                if(instance == null)
                    instance = new DclSingleton();
            }
        }
        return instance;
    }

    private DclSingleton(){}

}
