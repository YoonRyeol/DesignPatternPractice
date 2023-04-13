package prototype.copy;

public class DeepCar extends Car {

    DeepCar(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new DeepCar(this.name, (Engine) this.engine.clone());
    }
}
