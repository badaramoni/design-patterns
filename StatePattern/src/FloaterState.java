public class FloaterState implements State {

    public String toString(){
        return "Floater State";
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Wheel is in Floater state");
        context.setState(this);
    }
}