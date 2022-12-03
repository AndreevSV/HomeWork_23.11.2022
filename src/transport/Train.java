package transport;

public class Train extends Transport{
    int price;
    int time;
    String stationStart;
    String stationEnd;
    int carriage;

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 int speedMax,
                 int price,
                 int time,
                 String stationStart,
                 String stationEnd,
                 int carriage,
                 String fuel) {

        super(brand, model, year, country, speedMax, fuel);

        this.price = price;
        this.time = time;
        this.stationStart = stationStart;
        this.stationEnd = stationEnd;
        this.carriage = carriage;
        this.fuel = fuel;
    }

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 int speedMax,
                 int price,
                 String stationStart,
                 String stationEnd,
                 int carriage, String fuel) {

        super(brand, model, year, country, speedMax, fuel);

        this.price = price;
        this.stationStart = stationStart;
        this.stationEnd = stationEnd;
        this.carriage = carriage;
        this.fuel = fuel;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStationStart() {
        return stationStart;
    }

    public void setStationStart(String stationStart) {
        this.stationStart = stationStart;
    }

    public String getStationEnd() {
        return stationEnd;
    }

    public void setStationEnd(String stationEnd) {
        this.stationEnd = stationEnd;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    @Override
    public void refill(String fuel) {
        if (fuel.equals("дизель")) {
            this.fuel = fuel;
        } else {
            this.fuel = "дизель";
        }
    }

    @Override
    public String toString() {
        return
                "Поезд " + getBrand() +
                        ", модель " + getModel() +
                        ", год выпуска " + getYear() +
                        ", скорость " + getSpeedMax() +
                        ", отходит от " + getStationStart() +
                        ", конечная станция " + getStationEnd() +
                        ", цена поездки " + getPrice() +
                        ", количество вагонов " + getCarriage() +
                        ", вид топлива " + getFuel() +
                        ".";
    }
}