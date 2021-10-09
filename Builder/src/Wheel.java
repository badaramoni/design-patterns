
public class Wheel {

    WheelState steelSpinners;
    WheelState steelfloaters;
    WheelState steelColor;
    WheelState steelProtection;

    WheelState alloySpinners;
    WheelState alloyfloaters;
    WheelState alloyColor;
    WheelState alloyProtection;






    public void setWheelState(WheelState wheelState) {
        this.wheelState = wheelState;
    }

    WheelState wheelState;

    public Wheel() {
        steelSpinners = new SteelSpinners(this);
        steelfloaters = new SteelFloaters(this);
        steelColor = new SteelColor(this);
        steelProtection = new SteelProtection(this);

        alloySpinners = new AlloySpinners(this);
        alloyfloaters = new AlloySpinners(this);
        alloyColor = new AlloyColor(this);
        alloyProtection = new AlloyProtection(this);
        wheelState = steelSpinners;

    }


    public void insertSteelSpinners() {
        wheelState.insertSteelSpinners();
    }

    public void insertSteelFloaters() {
        wheelState.insertSteelFloaters();
    }

    public void insertSteelColor() {
        wheelState.insertSteelColor();
    }

    public void insertSteelProtection() {
        wheelState.insertSteelProtection();
    }

    public void insertAlloySpinners() {
        wheelState.insertAlloySpinners();
    }

    public void insertAlloyFloaters() {
        wheelState.insertAlloyFloaters();
    }

    public void insertAlloyColor() {
        wheelState.insertAlloyColor();
    }

    public void insertAlloyProtection() {
        wheelState.insertAlloyProtection();
    }

    public WheelState getSteelSpinners() {
        return steelSpinners;
    }

    public WheelState getSteelfloaters() {
        return steelfloaters;
    }

    public WheelState getSteelColor() {
        return steelColor;
    }

    public WheelState getSteelProtection() {
        return steelProtection;
    }

    public WheelState getAlloySpinners() {
        return alloySpinners;
    }

    public WheelState getAlloyfloaters() {
        return alloyfloaters;
    }

    public WheelState getAlloyColor() {
        return alloyColor;
    }

    public WheelState getAlloyProtection() {
        return alloyProtection;
    }

    public WheelState getWheelState() {
        return wheelState;
    }


}
