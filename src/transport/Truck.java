package transport;

import java.util.*;

public class Truck extends Transport implements Competitor, Maintainable {

    public enum LoadCapacity{N1(3.5F), N2(12.0F), N3(12.001F);

        final float loadCapacity;
        LoadCapacity(float loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public float getLoadCapacity() {
            return loadCapacity;
        }

        @Override
        public String toString() {
            if (getLoadCapacity() <= 3.5) {
                return "Грузоподъемность: до 3.5 тонн. \n";
            }
            if (getLoadCapacity() > 3.5 || getLoadCapacity() <= 12.0) {
                return "Грузоподъемность: от 3.5 до 12 тонн. \n";
            } else {
                return "Грузоподъемность: свыше 12 тонн. \n";
            }
        }
    }

    public int pitStop;
    public int maxSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return getLoadCapacity() == truck.getLoadCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLoadCapacity());
    }

    public int bestTime;
    public LoadCapacity loadCapacity;

    public List<Sponsor<Transport>> sponsors = new ArrayList<>();
    public Set<Mechanic<Truck>> mechanics = new HashSet<>();
    public Set<DriverC> drivers = new HashSet<>();

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, int pitStop, int maxSpeed, int bestTime, boolean diagnostic) {
        super(brand, model, engineVolume, diagnostic);
        this.loadCapacity = loadCapacity;
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestTime = bestTime;
    }

    public List<Sponsor<Transport>> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor<Transport> sponsor) {
        this.sponsors.add(sponsor);
    }

    public Set<Mechanic<Truck>> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic<Truck> mechanic) {
        this.mechanics.add(mechanic);
    }

    public Set<DriverC> getDrivers() {
        return drivers;
    }

    public void addDriver(DriverC driver) {
        this.drivers.add(driver);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getPitStop() {
        return pitStop;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBestTime() {
        return bestTime;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп " + getPitStop() + " секунд");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга " + getBestTime() + " минут");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getMaxSpeed() + " км/ч");
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно. \n");
        } else {
            System.out.println("Транспортное средство грузовик " + getBrand() + " " + getModel() + ". " + getLoadCapacity());
        }
    }



    @Override
    public boolean passDiagnostic() {
        if (!isDiagnostic()) {
            try {
                throw new RuntimeException("Грузовик " + getBrand() + " " + getModel() + " НЕ ПРОШЕЛ диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println("Грузовик " + getBrand() + " " + getModel() + " прошел диагностику");
        return true;
    }

    @Override
    public void repairTransport() {
        System.out.println("Производится ремонт грузовика " + getBrand() + " " + getModel()  + " следующим механиком " + getMechanics());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", pitStop=" + getPitStop() +
                ", maxSpeed=" + getMaxSpeed() +
                ", bestTime=" + getBestTime() +
                '}';
    }
}
