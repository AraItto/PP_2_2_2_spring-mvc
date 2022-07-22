package web.model;


public class Car {

    private String model;
    private int series;
    private int horsepower;

    public Car(String model, int series, int horsepower) {
        this.model = model;
        this.series = series;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
