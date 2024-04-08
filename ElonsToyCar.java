package excercism;

public class ElonsToyCar {
    private int distanceDriven;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if(battery <= 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery != 0) {
            distanceDriven = distanceDriven + 20;
            battery = battery - 1;
        }
    }
}
