package prototype.copy;

abstract class Car implements Prototype {
    String name;

    Engine engine;

    Car(String name, Engine engine){
        this.name = name;
        this.engine = engine;
    }

    public String sound(){
        return this.engine.getSound();
    }

    public Engine engine(){
        return engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException{
        return (Car) super.clone();
    }


}
