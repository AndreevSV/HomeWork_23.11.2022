package transport;

public abstract class Driver <T extends Transport> {
    public String name;
    public boolean licence;
    public int experience;

    public T transport;

    public Driver(String name, boolean licence, int experience) {
        setName(name);
        setLicence(licence);
        setExperience(experience);
    }

    public Driver(String name, boolean licence, int experience, T transport) {
        setName(name);
        setLicence(licence);
        setExperience(experience);
        this.transport = transport;
    }
    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refillTransport();

    public String showText(Transport transport) {
        return "Водитель " + getName() + " управляет транспортным средством " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде";
    }


}
