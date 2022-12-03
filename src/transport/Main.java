package transport;

import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {


        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России", "механика", "седан", "а201аа123", 5, "летняя", 120, "дизель");
        Car audiA8 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, "черного", 2020, "Германии", "автомат", "седан", "а201аа123", 5, "зимняя", 220, "");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черного", 2021, "Германии", "автомат", "купе", "а201аа123", 2, "зимняя", 250, "");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красного", 2018, "Южной Корее", "автомат", "SUV", "a201ff555", 5, "летняя", 180, "");
        Car hyundaiAvante = new Car("Hyandai", "", -1.6, null, -2016, "Южной Корее", "механика", "седан", "a201aa123", 5, "зимняя", 190, "");

        Car.Key keyLadaGranta = ladaGranta.new Key("нет", "нет");
        Car.Key keyAudiA8 = audiA8.new Key("да", "да");
        Car.Key keyBmwZ8 = bmwZ8.new Key("да", "да");
        Car.Key keyKiaSportage = kiaSportage.new Key("нет", "да");
        Car.Key keyHyundaiAvante = hyundaiAvante.new Key("да", "нет");

        ladaGranta.setKey(keyLadaGranta);
        audiA8.setKey(keyAudiA8);
        bmwZ8.setKey(keyBmwZ8);
        kiaSportage.setKey(keyKiaSportage);
        hyundaiAvante.setKey(keyHyundaiAvante);

        LocalDate ladaGrantaInsuranceCalendar = LocalDate.of(2022, Month.NOVEMBER, 30);
        LocalDate audiA8InsuranceCalendar = LocalDate.of(2022, Month.DECEMBER, 24);
        LocalDate bmwZ8InsuranceCalendar = LocalDate.of(2023, Month.FEBRUARY, 1);
        LocalDate kiaSportageInsuranceCalendar = LocalDate.of(2023, Month.AUGUST, 15);
        LocalDate hyundaiAvanteInsuranceCalendar = LocalDate.of(2022, Month.OCTOBER, 20);

        Car.Insurance insuranceLadaGranta = ladaGranta.new Insurance(ladaGrantaInsuranceCalendar, 2000, "000000001");
        Car.Insurance insuranceAudiA8 = audiA8.new Insurance(audiA8InsuranceCalendar, 30000, "000000002");
        Car.Insurance insuranceBmwZ8 = bmwZ8.new Insurance(bmwZ8InsuranceCalendar, 35000, "000000001");
        Car.Insurance insuranceKiaSportage = kiaSportage.new Insurance(kiaSportageInsuranceCalendar, 9000, "300000001");
        Car.Insurance insuranceHyundaiAvante = hyundaiAvante.new Insurance(hyundaiAvanteInsuranceCalendar, 10000, "0000000011");

        ladaGranta.setInsurance(insuranceLadaGranta);
        audiA8.setInsurance(insuranceAudiA8);
        bmwZ8.setInsurance(insuranceBmwZ8);
        kiaSportage.setInsurance(insuranceKiaSportage);
        hyundaiAvante.setInsurance(insuranceHyundaiAvante);

        System.out.println("------------------------- задача 1 _______________________________");
        System.out.println();

        System.out.println(ladaGranta);
        ladaGranta.examValidDate();
        ladaGranta.wheelsExam();
        ladaGranta.examNumberOfInsurance();
        System.out.println();

        System.out.println();

        System.out.println(audiA8);
        audiA8.examValidDate();
        audiA8.wheelsExam();
        audiA8.examNumberOfInsurance();

        System.out.println();

        System.out.println(bmwZ8);
        bmwZ8.examValidDate();
        bmwZ8.wheelsExam();
        bmwZ8.examNumberOfInsurance();

        System.out.println();

        System.out.println(kiaSportage);
        kiaSportage.examValidDate();
        kiaSportage.wheelsExam();
        kiaSportage.examNumberOfInsurance();

        System.out.println();

        System.out.println(hyundaiAvante);
        hyundaiAvante.examValidDate();
        hyundaiAvante.wheelsExam();
        hyundaiAvante.examNumberOfInsurance();

        System.out.println("------------------------- задача 2 _______________________________");
        System.out.println();

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", 301, 3500, "Белорусский вокзал", "Минск-Пассажирский", 11, "");
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "");


        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println();
        System.out.println("------------------------- задача 3 _______________________________");
        System.out.println();

        Bus bus1 = new Bus ("Mercedes", "Citaro", 2019, "Германия", "белый",  190, "электрика");
        Bus bus2 = new Bus ("Mercedes", "Conecto", 2020, "Германия", "черный",  200, "бензин");
        Bus bus3 = new Bus ("Mercedes", "Travego", 2021, "Венгрия", "синий",  220, "");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);


    }
}