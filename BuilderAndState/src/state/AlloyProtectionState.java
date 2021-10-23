package state;

public class AlloyProtectionState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State: Alloy Wheel is in Protection state");
        context.setState(this);
    }
}