package proxy.virtual;

public class RealSubject implements Subject{

    public RealSubject() throws InterruptedException {
        for(int i=0; i<5; i++) {
            System.out.println("this take a while...");
            Thread.sleep(1000);
        }
    }

    @Override
    public String getName() {
        return "subject";
    }

    @Override
    public Subject getSubject() {
        return this;
    }
}
