package state;

public class SteelFloaterState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State: Steel Wheel is in Floater state");
        context.setState(this);
    }
}