package bridge.after;

import bridge.before.Champion;
import bridge.before.Skin;

public class DefaultChampion implements Champion {
    private String name;
    private Skin skin;

    public DefaultChampion(String name, Skin skin){
        this.name = name;
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\n", skin.getName(), this.name);

    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n", skin.getName(), this.name);

    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n", skin.getName(), this.name);

    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n", skin.getName(), this.name);

    }

    @Override
    public String getName() {
        return name;
    }
}
