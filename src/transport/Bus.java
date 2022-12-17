package transport;

public class Bus extends Transport implements Competitor {

    public enum BusCapacity {
        SUPER_LITTLE(10),
        LITTLE(25),
        MEDIUM(50),
        LARGE(80),
        SUPER_LARGE(120);

        final int busCapacity;

        BusCapacity(int busCapacity) {
            this.busCapacity = busCapacity;
        }

        public int getBusCapacity() {
            return busCapacity;
        }

        @Override
        public String toString() {
            if (getBusCapacity() <= 10) {
                return "Вместимость: особо малая (до 10 мест). \n";
            }
            if (getBusCapacity() > 10 & getBusCapacity() <= 25) {
                return "Вместимость: малая (до 25 мест). \n";
            }
            if (getBusCapacity() >= 40 & getBusCapacity() <= 50) {
                return "Вместимость: средняя (40 - 50 мест). \n";
            }
            if (getBusCapacity() >= 60 & getBusCapacity() <= 80) {
                return "Вместимость: большая (60 - 80 мест). \n";
            }
            if (getBusCapacity() >= 100 & getBusCapacity() <= 120) {
                return "Вместимость: особо большая (100 - 120 мест). \n";
            } else {
                return "Нет такой грузоподъмности. \n";
            }
        }
    }

    public int pitStop;
    public int maxSpeed;
    public int bestTime;
    public BusCapacity capacity;


    public Bus(String brand, String model, double engineVolume, BusCapacity capacity, int pitStop, int maxSpeed, int bestTime, boolean diagnostic) {
        super(brand, model, engineVolume, diagnostic);
        this.capacity = capacity;
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestTime = bestTime;
    }

    public BusCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(BusCapacity capacity) {
        this.capacity = capacity;
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
        System.out.println("Пит-стоп " + getPitStop() + " минут");
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
            if (getCapacity() == null) {
                System.out.println("Данных по транспортному средству недостаточно. \n");
            } else {
                System.out.println("Транспортное средство автобус " + getBrand() + " " + getModel() + ". " + getCapacity());
            }
    }

    @Override
    public boolean passDiagnostic() {
            System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", pitStop=" + getPitStop() +
                ", maxSpeed=" + getMaxSpeed() +
                ", bestTime=" + getBestTime() +
                '}';
    }

}