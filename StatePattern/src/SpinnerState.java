

public class SpinnerState implements State {

    public String toString(){
        return "Spinner State";
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Wheel is in Spinner state");
        context.setState(this);
    }
}