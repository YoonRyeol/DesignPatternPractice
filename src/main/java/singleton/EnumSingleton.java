package singleton;

public enum EnumSingleton {
    // 리플렉션, 역직렬화에 대해서 singletone이 깨지지 않는다.
    // 하지만, eager loading 하기 때문에 최적화 문제가 있다.
    // 상속이 불가능하다.
    INSTANCE;

}
