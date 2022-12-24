package transport;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)  {

        Car car1 = new Car("Lada", "Granta", 1.7, Car.CabinType.SEDAN, 20, 250, 40, true);
        Car car2 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, Car.CabinType.SEDAN,20, 200, 50, true);
        Car car3 = new Car("BMW", "Z8", 3.0, Car.CabinType.COUPE,20, 200, 28, false);
        Car car4 = new Car("Kia", "Sportage", 2.4, Car.CabinType.CROSSOVER,20, 260, 40, false);

        Bus bus1 = new Bus ("Mercedes", "Citaro", 11.98, Bus.BusCapacity.LITTLE ,23, 200, 45, false);
        Bus bus2 = new Bus ("Mercedes", "Conecto", 11.97, Bus.BusCapacity.LARGE, 25, 220, 50, false);
        Bus bus3 = new Bus ("Mercedes", "Travego", 11.97, Bus.BusCapacity.SUPER_LITTLE,23, 230, 48, true);
        Bus bus4 = new Bus ("Mercedes", "Tourismo", 10.68, Bus.BusCapacity.SUPER_LARGE,26, 235, 50, true);

        Truck truck1 = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N1,21, 250, 30, false);
        Truck truck2 = new Truck("Mercedes", "Arocs", 7.7, Truck.LoadCapacity.N2,24, 205, 40, false);
        Truck truck3 = new Truck("Mercedes", "Actros", 15.6, Truck.LoadCapacity.N3,26, 222, 45, true);
        Truck truck4 = new Truck("Mercedes", "Atego", 5.1, Truck.LoadCapacity.N1,20, 220, 50, false);

        Sponsor<Transport> sponsor1 =  new Sponsor<>("Сбербанк", 1_000_000);
        Sponsor<Transport> sponsor2 =  new Sponsor<>("ВТБ", 500_000);
        Sponsor<Transport> sponsor3 =  new Sponsor<>("Уралсиб", 2_500_000);
        Sponsor<Transport> sponsor4 =  new Sponsor<>("Открытие", 500_000_000);

        Mechanic<Car> mechanic1 = new Mechanic<>("Сергей", "Козлов", "Синтез");
        Mechanic<Transport> mechanic2 = new Mechanic<>("Артем", "Пивоваров", "БестПартс");
        Mechanic<Bus> mechanic3 = new Mechanic<>("Владимир", "Картополов", "Сервис плюс");
        Mechanic<Truck> mechanic4 = new Mechanic<>("Александр", "Васнецов", "Астон-Мартин");

        DriverB driverB = new DriverB("Artem", 'B', 10, car1);
        DriverB driverB1 = new DriverB("Tomik", 'B', 8, car2);
        DriverB driverB2 = new DriverB("Kostya", 'B', 7, car3);
        DriverB driverB3 = new DriverB("Samson", 'B', 4, car4);

        DriverC driverC = new DriverC("Maxim", 'C', 15, truck1);
        DriverC driverC1 = new DriverC("Vlad", 'C', 1, truck2);
        DriverC driverC2 = new DriverC("Viktor", 'C', 4, truck3);
        DriverC driverC3 = new DriverC("Anton", 'C', 2, truck4);

        DriverD driverD = new DriverD("Aslan", 'D', 3, bus1);
        DriverD driverD1 = new DriverD("Vladimit", 'D', 4, bus2);
        DriverD driverD2 = new DriverD("Andrey", 'D', 30, bus3);
        DriverD driverD3 = new DriverD("Turan", 'D', 34, bus4);

//        car1.addDriver(driverB);
//        car1.addMechanic(mechanic1);
//        car1.addSponsor(sponsor1);
//        printDriverSponsorsMechanics(car1);
//        mechanic1.makeService(car1);
//        mechanic1.passDiagnsostic(car1);
//
//        bus3.addDriver(driverD1);
//        bus3.addMechanic(mechanic3);
//        bus3.addSponsor(sponsor4);
//        printDriverSponsorsMechanics(bus3);
//        mechanic3.makeService(bus3);
//        mechanic3.passDiagnsostic(bus3);


        ServiceStation<Car> serviceStation1 = new ServiceStation<>("Сервисная станция 1");
        serviceStation1.addTransport(car1);
        serviceStation1.addTransport(car2);
        serviceStation1.addTransport(car3);
        serviceStation1.addTransport(car4);

        serviceStation1.doDiagnsotic();
        serviceStation1.doDiagnsotic();
        serviceStation1.doDiagnsotic();
        serviceStation1.doDiagnsotic();

//        Transport[] transports = new Transport[] {car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};
//        Car[] cars = new Car[] {car1, car2, car3, car4};
//        Bus[] buses = new Bus[] {bus1, bus2, bus3, bus4};
//        Truck[] trucks = new Truck[] {truck1, truck2, truck3, truck4};

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

//        car1.printDriverSponsorsMechanics();

//        Driver[] drivers = {driverA, driverB, driverC};
//
//        System.out.println();
//        System.out.println(driverA.showText(car2));
//        System.out.println(driverB.showText(truck3));
//        System.out.println(driverC.showText(bus2));

//        car1.printType();
//        bus2.printType();
//        truck4.printType();

//        testDiagnostic(transports);
//        testLicence(drivers);
    }

    public static void printTransport(Transport[] transport) {
        for (Transport transports : transport) {
            System.out.println(transports);
        }
    }

    public static void testDiagnostic(Transport[] transports) {
        for (Transport transport : transports) {
            transport.passDiagnostic();
        }
    }

    public static void testLicence(Driver... drivers) {
        for (Driver driver: drivers) {
            try {
                if (driver.getLicence() == ' ') {
                    throw new RuntimeException("Водителю " + driver.getName() + " необходиму указать тип прав");
                } else {
                    System.out.println("У водителя " + driver.getName() + " права категории " + driver.getLicence());
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void printDriverSponsorsMechanics (Car transport) {
        System.out.println("Транспортное средств " +  transport.getBrand()  + " " + transport.getModel() +
                " управлется водителем " + transport.getDrivers() + " обслуживается следующими механиками " +
                transport.getMechanics() + " и имеет следующих спонсоров " + transport.getSponsors());
    }

    public static void printDriverSponsorsMechanics (Bus transport) {
        System.out.println("Транспортное средств " +  transport.getBrand()  + " " + transport.getModel() +
                " управлется водителем " + transport.getDrivers() + " обслуживается следующими механиками " +
                transport.getMechanics() + " и имеет следующих спонсоров " + transport.getSponsors());
    }

    public static void printDriverSponsorsMechanics (Truck transport) {
        System.out.println("Транспортное средств " +  transport.getBrand()  + " " + transport.getModel() +
                " управлется водителем " + transport.getDrivers() + " обслуживается следующими механиками " +
                transport.getMechanics() + " и имеет следующих спонсоров " + transport.getSponsors());
    }

}