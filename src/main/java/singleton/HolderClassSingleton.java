package singleton;

public class HolderClassSingleton {
    // 자바 1.4 이전 버전의 JVM에서도 lazy loading, thread-safe 한 객체 초기화가 가능하다.
    // 여전히 직렬화, 역직렬화 시에 싱글톤이 깨진다.

    public static HolderClassSingleton getInstance(){
        return StaticFactory.INSTANCE;
    }

    // 클래스가 로딩되는 시점에서 한 번만 클래스가 생성됨
    // static 필드를 초기화하기 때문에 jvm이 thread-safe 함을 보장함.
    // final 이기 떄문에 재 할당 되지 않음
    static class StaticFactory{
        private static final HolderClassSingleton INSTANCE = new HolderClassSingleton();
    }

    private HolderClassSingleton(){}

}
