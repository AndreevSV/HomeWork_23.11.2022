package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    public class Key {

        public String remote;
        public String keyless;
        public Key(String remote, String keyless) {
            setRemote(remote);
            setKeyless(keyless);
        }

        public void setRemote(String remote) {
            if (remote.equalsIgnoreCase("да")) {
                this.remote = remote;
            } else if (remote.equals("") || remote == null || remote.equalsIgnoreCase("нет")) {
                this.remote = "нет";
            } else {
                this.remote = "нет";
            }
        }

        public void setKeyless(String keyless) {
            if (keyless.equalsIgnoreCase("да")) {
                this.keyless = keyless;
            } else if (keyless.equalsIgnoreCase("") || keyless.equalsIgnoreCase(null) || keyless.equalsIgnoreCase("Нет")) {
                this.keyless = "нет";
            } else {
                this.keyless = "нет";
            }
        }

        public String getRemote() {
            return remote;
        }

        public String getKeyless() {
            return keyless;
        }
    }

    public class Insurance {
        private LocalDate validDate;
        private int costOfInsurance;
        public String numberOfInsurance;

        public Insurance(LocalDate validDate, int costOfInsurance, String numberOfInsurance) {
            setValidDate(validDate);
            setCostOfInsurance(costOfInsurance);
            setNumberOfInsurance(numberOfInsurance);
        }

        public LocalDate getInsuranceValidDate() {
            return validDate;
        }

        public void setValidDate(LocalDate validDate) {
            if (validDate != null) {
                this.validDate = validDate;
            } else {
                this.validDate = LocalDate.now();
            }
        }

        public int getCostOfInsurance() {
            return costOfInsurance;
        }

        public void setCostOfInsurance(int costOfInsurance) {
            if (costOfInsurance > 0) {
                this.costOfInsurance = costOfInsurance;
            } else {
                System.out.println("Введено некорректное значение");
            }

        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }

        public void setNumberOfInsurance(String numberOfInsurance) {
            if (numberOfInsurance.equals("") || numberOfInsurance == null) {
                this.numberOfInsurance = "номер не введен";
            } else {
                this.numberOfInsurance = numberOfInsurance;
            }

        }

    }


    private double engineVolume;
    private String transmission;
    private final String cabin;
    private String number;
    private final int seat;
    private String wheels;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String cabin, String number, int seat, String wheels, int speedMax, String fuel) {

        super(brand, model, year, country, color, speedMax, fuel);

        setWheels(wheels);
        setTransmission(transmission);
        setColor(color);
        setEngineVolume(engineVolume);
        this.cabin = cabin;
        this.seat = seat;
        setNumber(number);
        setFuel(fuel);

    }

    public String getCabin() {
        return cabin;
    }

    public int getSeat() {
        return seat;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public String getWheels() {
        return wheels;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setTransmission(String transmission) {
        if (transmission.equals("механика") || transmission.equals("автомат")) {
            this.transmission = transmission;
        } else {
            this.transmission = "Тип задан не верно";
        }
    }

    public void setNumber(String number) {
        if (number.matches("[а-я]\\d{3}[а-я]{2}\\d{3}") || number.matches("[a-z]\\d{3}[a-z]{2}\\d{3}")) {
            this.number = number;
        } else {
            this.number = "Номер не корректен";
        }
    }

    public void setWheels(String wheels) {
        if (wheels.equals("зимняя") || wheels.equals("летняя")) {
            this.wheels = wheels;
        } else {
            this.wheels = "не установлено";
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void wheelsExam() { // Метод проверяет какой сейчас сезон (лето с 4 месяца по 9й) или зима (с 1 по 2 и с 10 по 12) и сравнивает с шинами, которые установлены, выводит информацию о необходимости смены шин
        int season;
        int wheelsDigit;
        if (LocalDate.now().getMonthValue() > 3 && LocalDate.now().getMonthValue() < 10) { // Летние месяцы для смены резины
            season = 1; // Сейчас сезон лето
        } else {
            season = 0; // Сейчас сезон зима
        }
        if (getWheels().equals("летняя")) {
            wheelsDigit = 1; // Перевод вида резины в цифровой вид - лето
        } else {
            wheelsDigit = 0; // Перевод вида резины в цифровой вид - зима
        }
        if (season != wheelsDigit) {
            System.out.println("Необходимо сменить шины на сезонные");
        }
    }

    public void examValidDate() {
        LocalDate currentDate = LocalDate.now();
        if (getInsurance().validDate.isBefore(currentDate)) {
            System.out.println("Необходимо срочно оформить новую страховку");
        }
    }

    public void examNumberOfInsurance() {
        final int COUNTER = 9; // Нормативное количество знаков в номере страховки
        if(insurance.getNumberOfInsurance().length() != COUNTER) {
            System.out.println("Номер страховки для автомобиля " + getBrand() + " " + getModel() + " не корректен, введено " + insurance.getNumberOfInsurance().length() + " символов, должно быть введено 9 символов");
        }
    }

    @Override
    public void refill(String fuel) {
        if (fuel.equals("бензин") || fuel.equals("дизель") || fuel.equals("электрика")  ) {
            this.fuel = fuel;
        } else {
            this.fuel = "бензин";
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " +
                getModel() + ", " +
                getYear() + " год выпуска, сборка в " +
                getCountry() + ", " +
                getColor() + " цвета, объем двигателя " +
                getEngineVolume() + " л. Тип коробки передач - " +
                getTransmission() + ". Тип кузова: " +
                getCabin() + ". \n" + "Регистрационный номер: " +
                getNumber() + " .Количество мест: " +
                getSeat() + ". Тип установленной резины " +
                getWheels() + ". Удаленный запуск двигателя: " +
                key.getRemote() + ". Бесключевой доступ: " +
                key.getKeyless() + "\n" + "Номер страхового полиса " +
                insurance.getNumberOfInsurance() + ", стоимость страхового полиса " +
                insurance.getCostOfInsurance() + " рублей, " + "срок действия полиса - до " +
                insurance.getInsuranceValidDate() +
                ", вид топлива " + getFuel() +
                ".";
    }
}
