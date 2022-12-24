package transport;

public abstract class Driver <T extends Transport> {
    private String name;
    private char licence;
    private int experience;
    private T transport;

    public Driver(String name, char licence, int experience, T transport) {
        setName(name);
        setLicence(licence);
        setExperience(experience);
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLicence() {
        return licence;
    }

    public void setLicence(char licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void startMoving() {
        System.out.println("Водитель " + getName() + " начал движение");
    }

    public void stopMoving() {
        System.out.println("Водитель" + getName() + "остановился");
    }

    public void refillTransport() {
        System.out.println("Водитель" + getName() + "заправил автомобиль");
    }

    public String showText(T transport) {
        return "Водитель " + getName() + " управляет транспортным средством " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде";
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licence=" + licence +
                '}';
    }
}