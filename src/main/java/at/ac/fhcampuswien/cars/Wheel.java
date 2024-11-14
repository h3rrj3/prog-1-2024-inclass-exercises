package at.ac.fhcampuswien.cars;

public class Wheel {

    int pressure;

    public int getPressure() {
        return pressure;
    }

    public int setPressure(int pressure) {
        this.pressure=pressure;
    }

    public Wheel(int pressure) {
        this.pressure = pressure;
    }
}
