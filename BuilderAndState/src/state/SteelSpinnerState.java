package state;

public class SteelSpinnerState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State: Steel Wheel is in Spinner state");
        context.setState(this);
    }
}