package transport;

public abstract class Driver {
    public String name;
    public boolean licence;
    public int experience;

    public Driver(String name, boolean licence, int experience) {
        setName(name);
        setLicence(licence);
        setExperience(experience);
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

}
