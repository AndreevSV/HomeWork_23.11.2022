package transport;

import java.util.Arrays;

public class Bus extends Transport implements Competitor {

    public int pitStop;
    public int maxSpeed;
    public int bestTime;
//    Bus[] buses;

    public Bus(String brand, String model, double engineVolume, int pitStop, int maxSpeed, int bestTime) {
        super(brand, model, engineVolume);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestTime = bestTime;
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

//    @Override
//    public int searchForBestTime(Transport[] transports) {
//        return 0;
//    }

//    @Override
//    public void searchForBestTime(Bus[] buses) {
//        int bestTime = buses[0].getBestTime();
//        int a = 0;
//        for (int i = 0; i < buses.length; i++) {
//            if (buses[i].getBestTime() < bestTime) {
//                bestTime = buses[i].getBestTime();
//                a = i;
//               }
//            System.out.println("Лучшее время" + buses[i].getBestTime() + "у автобуса " + buses[i].getBrand() + " " + buses[i].getModel() + " с двигателем " + buses[i].getEngineVolume() + " л");
//        }
//        }
}