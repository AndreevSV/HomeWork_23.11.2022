package transport;/*
Задание 1
Создайте класс transport, который содержит в себе следующие параметры:

«Марка»,
«Модель»,
«Год выпуска»,
«Страна производства»,
«Цвет кузова»,
«Максимальная скорость передвижения».
Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться, «Цвет», «Скорость» меняться могут.
Для изменяемых параметров добавьте проверку данных, что значение указано корректно, не содержит null и не пустое.

Скорректируйте класс car таким образом, чтобы ранее указанные параметры не повторяли те, которые содержатся в классе transport.

Класс car должен наследовать параметры класса transport.
 */


public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int speedMax;
    public String fuel;

    public Transport(String brand, String model, int year, String country, String color, int speedMax, String fuel) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCountry(country);
        setColor(color);
        setSpeedMax(speedMax);
        setFuel(fuel);

    }

    public Transport(String brand, String model, int year, String country, int speedMax, String fuel) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCountry(country);
        setSpeedMax(speedMax);
        setFuel(fuel);
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

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }


    public int getYear() {
        return year;
    }

    public void setCountry(String country) {
        if (country.equals("") || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) {
            this.color = "некорректно";
        } else {
            this.color = color;
        }
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        int speedDefault = 100; //   Значение скорости по умолчанию
        if (speedMax == 0) {
            this.speedMax = speedDefault;
        } else {
            this.speedMax = speedMax;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        refill(fuel);
    }

    public abstract void refill(String fuel);
}



