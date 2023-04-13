package singleton;

public class EagerSingleton {

    // jvm이 클래스를 로딩하면서 static 멤버변수를 초기화해줌.
    // thread safe 하다.
    // 객체의 크기가 크면 사용하지 않을 경우의 리소스 낭비가 크다.
    public static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

}
