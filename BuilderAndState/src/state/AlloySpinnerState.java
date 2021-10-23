package state;

public class AlloySpinnerState  implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State: Alloy Wheel is in Spinner state");
        context.setState(this);
    }
}
