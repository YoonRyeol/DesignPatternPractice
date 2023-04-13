package lambdafactorymethod;

public class Framework {

    private static ShipFactory SHIP_FACTORY = new ShipFactory();
    public static void main(String[] args) {
        makeShip("hello", "world", Blackship::new);
        makeShip("hello", "world", Whiteship::new);
    }

    public static Ship makeShip(String name, String email, ShipSupplier supplier){
        return SHIP_FACTORY.orderShip(name, email, supplier);
    }
}
