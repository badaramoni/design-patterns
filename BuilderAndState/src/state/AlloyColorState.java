package state;

public class AlloyColorState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State: Alloy Wheel is in Color state");
        context.setState(this);
    }
}
