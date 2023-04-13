package proxy.virtual;

public class ProxySubject implements Subject {

    private Subject subject;

    @Override
    public String getName() {
        return "subject";
    }

    @Override
    public Subject getSubject() {
        if(subject == null)
            try{
                subject = new RealSubject();
            }catch (InterruptedException e){
                throw new RuntimeException("error~");
            }
        return subject;
    }
}
