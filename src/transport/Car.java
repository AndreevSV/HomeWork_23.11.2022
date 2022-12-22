package transport;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport implements Competitor {

    public enum CabinType {SEDAN("Седан"), HATCHBACK("Хэтчбэк"), COUPE("Купе"), WAGON("Универсал"), SUV("Внедорожник"), CROSSOVER("Кросовер"), PICKUP("Пикап"), VAN("Фургон"),
        MINIVAN("Минивен");

        final String cabinType;

        CabinType(String cabinType) {
            this.cabinType = cabinType;
        }

        public String getCabinType() {
            return cabinType;
        }

        @Override
        public String toString() {
            return "Тип кузова " + cabinType + ". \n";
        }
    }

    public int pitStop;
    public int maxSpeed;
    public int bestTime;
    public CabinType cabinType;

    public List<Sponsor<Transport>> sponsors = new ArrayList<>();
    public List<Mechanic<Car>> mechanics = new ArrayList<>();
    public List<DriverB> drivers = new ArrayList<>();

    public Car(String brand, String model, double engineVolume, CabinType cabinType, int pitStop, int maxSpeed, int bestTime, boolean diagnostic) {
        super(brand, model, engineVolume, diagnostic);
        this.cabinType = cabinType;
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

    public List<Mechanic<Car>> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic<Car> mechanic) {
        this.mechanics.add(mechanic);
    }

    public List<DriverB> getDrivers() {
        return drivers;
    }

    public void addDriver(DriverB driver) {
        this.drivers.add(driver);
    }

    public CabinType getCabinType() {
        return cabinType;
    }

    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
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
        if (getCabinType() == null) {
            System.out.println("Данных по транспортному средству недостаточно. \n");
        } else {
            System.out.println("Транспортное средство автомобиль " + getBrand() + " " + getModel() + "." + getCabinType());
        }
    }

    @Override
    public boolean passDiagnostic() {
        if (!isDiagnostic()) {
            try {
                throw new RuntimeException("Автомобиль " + getBrand() + " " + getModel() + " НЕ ПРОШЕЛ диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику");
    return true;
    }

    @Override
    public void repairTransport() {
        System.out.println("Производится ремонт автомобиля " + getBrand() + " " + getModel()  + " следующим механиком " + getMechanics());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", pitStop=" + getPitStop() +
                ", maxSpeed=" + getMaxSpeed() +
                ", bestTime=" + getBestTime() +
                '}';
    }
}
