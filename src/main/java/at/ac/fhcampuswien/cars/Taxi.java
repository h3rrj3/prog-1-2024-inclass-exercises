package at.ac.fhcampuswien.cars;

public class Taxi extends Car {

    private boolean onDuty;

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public Taxi(int speed) {
        super(speed);
    }

}
