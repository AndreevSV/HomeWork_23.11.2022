package transport;

public class DriverD<T extends Bus> extends Driver {
    public DriverD(String name, boolean licence, int experience) {
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

    public String showText(Transport transport) {
        return "Водитель " + getName() + " управляет автобусом " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде";
    }
}
