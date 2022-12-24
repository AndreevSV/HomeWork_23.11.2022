package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    public int pitStop;
    public int maxSpeed;
    public int bestTime;
//    public Transport[] transports;
    public boolean diagnostic;

    public Transport(String brand, String model, double engineVolume, boolean diagnostic) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDiagnostic(diagnostic);
    }

    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
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

//    public Transport[] getTransports() {
//        return transports;
//    }

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

    public static String searchForBestTime(Transport[] transports) {
        int bestTime = transports[0].getBestTime();
        int a = 0;
        for (int i = 0; i < transports.length; i++) {
            if (transports[i].getBestTime() < bestTime) {
                bestTime = transports[i].getBestTime();
                a = i;
            }
        }
        return "Лучшее время " + transports[a].getBestTime() +
                " минут у автомобиля " + transports[a].getBrand() + " " +
                transports[a].getModel() + " с двигателем " + transports[a].getEngineVolume() + "л";
    }
    public abstract void printType();
    public abstract boolean passDiagnostic();
    public abstract void repairTransport();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}



