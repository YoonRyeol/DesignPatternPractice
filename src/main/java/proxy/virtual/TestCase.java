package proxy.virtual;

public class TestCase {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        System.out.println(subject.getName());
        Subject target = subject.getSubject();
        assert target != null;
        Subject target2 = subject.getSubject();
        assert target == target2;

    }
}
