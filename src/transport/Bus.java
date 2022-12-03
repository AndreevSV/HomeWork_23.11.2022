package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int speedMax,
               String fuel) {
        super(brand, model, year, country, color, speedMax, fuel);
    }

    @Override
    public void refill(String fuel) {
        if (fuel.equals("бензин") || fuel.equals("дизель")) {
            this.fuel = fuel;
        } else {
            this.fuel = "дизель";
        }
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() +
                ", бренд " + getModel() +
                ", год выпуска " + getYear() +
                ", страна производства " + getCountry() +
                ", цвет " + getColor() +
                ", максимальная скорость " + getSpeedMax() +
                ", вид топлива " + getFuel() +
                ".";
    }
}