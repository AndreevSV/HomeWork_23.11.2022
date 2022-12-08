package transport;

import static transport.Transport.searchForBestTime;

public class Main {
    public static void main(String[] args)  {


        Car car1 = new Car("Lada", "Granta", 1.7, Car.CabinType.SEDAN, 20, 250, 40);
        Car car2 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, Car.CabinType.SEDAN,20, 200, 50);
        Car car3 = new Car("BMW", "Z8", 3.0, Car.CabinType.COUPE,20, 200, 28);
        Car car4 = new Car("Kia", "Sportage", 2.4, Car.CabinType.CROSSOVER,20, 260, 40);

        Bus bus1 = new Bus ("Mercedes", "Citaro", 11.98, Bus.BusCapacity.LITTLE ,23, 200, 45);
        Bus bus2 = new Bus ("Mercedes", "Conecto", 11.97, Bus.BusCapacity.LARGE, 25, 220, 50);
        Bus bus3 = new Bus ("Mercedes", "Travego", 11.97, Bus.BusCapacity.LARGE,23, 230, 48);
        Bus bus4 = new Bus ("Mercedes", "Tourismo", 10.68, Bus.BusCapacity.SUPER_LARGE,26, 235, 50);

        Truck truck1 = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N1,21, 250, 30);
        Truck truck2 = new Truck("Mercedes", "Arocs", 7.7, Truck.LoadCapacity.N2,24, 205, 40);
        Truck truck3 = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N3,26, 222, 45);
        Truck truck4 = new Truck("Mercedes", "Atego", 5.1, Truck.LoadCapacity.N1,20, 220, 50);


        Transport[] transports = new Transport[] {car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};
        Car[] cars = new Car[] {car1, car2, car3, car4};
        Bus[] buses = new Bus[] {bus1, bus2, bus3, bus4};
        Truck[] trucks = new Truck[] {truck1, truck2, truck3, truck4};

//        printTransport(cars);
//        System.out.println();
//
//        printTransport(buses);
//        System.out.println();
//
//        printTransport(trucks);
//        System.out.println();
//
//        bus2.bestCircleTime();
//        truck1.pitStop();
//        car2.maxSpeed();
//
//        System.out.println();
//
//        System.out.println(searchForBestTime(transports));
//        System.out.println(searchForBestTime(cars));
//        System.out.println(searchForBestTime(buses));
//        System.out.println(searchForBestTime(trucks));
//
//
//        DriverB<Car> driverA = new DriverB<>("Artem", true, 10);
//        DriverC<Truck> driverB = new DriverC<>("Maxim", true, 15);
//        DriverD<Bus> driverC = new DriverD<>("Aslan", true, 3);
//
//        System.out.println();
//        System.out.println(driverA.showText(car1));
//        System.out.println(driverB.showText(truck3));
//        System.out.println(driverC.showText(bus2));

    car1.printType();
    bus2.printType();
    truck4.printType();

    }

    public static void printTransport(Transport[] transport) {
        for (Transport transports : transport) {
            System.out.println(transports);
        }
    }
}