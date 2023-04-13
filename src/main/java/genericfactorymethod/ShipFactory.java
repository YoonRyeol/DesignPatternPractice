package genericfactorymethod;

import lambdafactorymethod.Ship;

public class ShipFactory {

    public Ship orderShip(String name, String email, Class<? extends Ship> clazz) throws InstantiationException, IllegalAccessException {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(clazz);
        sendEmailTo(email, ship);
        return ship;
    }

    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    private Ship createShip(Class<? extends Ship> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
