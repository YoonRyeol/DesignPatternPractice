package prototype.copy;

public class Engine implements Prototype {
    private String sound;

    public Engine(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
