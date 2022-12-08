package transport;

public class DriverB<T extends Car> extends Driver {

    public DriverB(String name, boolean licence, int experience) {
        super(name, licence, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель " + getName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель" + getName() + "остановился");
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель" + getName() + "заправил автомобиль");
    }

}
