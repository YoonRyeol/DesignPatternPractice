package prototype.copy;

public class CarTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine("brrr");

        Car shallowCar = new ShallowCar("sonata", engine);
        Car deepCar = new DeepCar("avante", engine);

        System.out.println("shallowCar : " + shallowCar.sound());
        System.out.println("deepCar : " + deepCar.sound());

        Car shallowCar2 = shallowCar.clone();
        Car deepCar2 = deepCar.clone();

        engine.setSound("vrrrrr");

        System.out.println("shallowCar2 : " + shallowCar2.sound());
        System.out.println("deepCar2 : " + deepCar2.sound());

        System.out.println("shallowCar.engine() == shallowCar2.engine() : " + (shallowCar.engine() == shallowCar2.engine()));
        System.out.println("deepCar.engine() == deepCar2.engine() : " + (deepCar.engine() == deepCar2.engine()));

    }
}
