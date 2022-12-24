package transport;

public class Sponsor <T extends Transport> {
    private String name;
    private int sum;

    public Sponsor(String name, int sum) {
        setName(name);
        setSum(sum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void toSponsor () {
        System.out.println("Сумма вклада спонсора " + sum + " долларов США");
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
