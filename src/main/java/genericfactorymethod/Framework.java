package genericfactorymethod;

import lambdafactorymethod.Blackship;
import lambdafactorymethod.Ship;
import lambdafactorymethod.Whiteship;

public class Framework {

    private static ShipFactory SHIP_FACTORY = new ShipFactory();
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        makeShip("hello", "world", Blackship.class);
        makeShip("hello", "world", Whiteship.class);
    }

    public static Ship makeShip(String name, String email, Class<? extends Ship> clazz ) throws InstantiationException, IllegalAccessException {
        return SHIP_FACTORY.orderShip(name, email, clazz);
    }

}
