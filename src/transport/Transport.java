package transport;

import java.util.Arrays;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport[] transports;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.equals("")) {
            this.brand = "некорректно";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.equals("")) {
            this.model = "некорректно";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public static void startMoving() {
        System.out.println("Начать движение");
    }

    public static void stopMoving() {
        System.out.println("Закончить движение");
    }

//    public abstract int searchForBestTime(Transport[] transports);

}



