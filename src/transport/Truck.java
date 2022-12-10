package transport;

public class Truck extends Transport implements Competitor {

    public enum LoadCapacity{
        N1(3.5F),
        N2(12.0F),
        N3(12.001F);

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
    public int bestTime;
    public LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, int pitStop, int maxSpeed, int bestTime) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestTime = bestTime;
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
