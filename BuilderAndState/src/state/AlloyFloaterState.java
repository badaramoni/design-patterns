package state;

public class AlloyFloaterState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State: Alloy Wheel is in Floater state");
        context.setState(this);
    }
}