package transport;

public class DriverD<T extends Bus> extends Driver {
    public DriverD(String name, char licence, int experience) {
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
