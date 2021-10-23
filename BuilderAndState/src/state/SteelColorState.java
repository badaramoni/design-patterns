package state;

public class SteelColorState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State: Steel Wheel is in Color state");
        context.setState(this);
    }
}