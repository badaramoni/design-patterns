package state;

public class SteelProtectionState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State: Steel Wheel is in Protection state");
        context.setState(this);
    }
}