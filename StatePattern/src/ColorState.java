public class ColorState implements State {

    public String toString(){
        return "Color State";
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Wheel is in Color state");
        context.setState(this);
    }
}