public class ProtectionState implements State {

    public String toString(){
        return "Protection State";
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Wheel is in Protection state");
        context.setState(this);
    }
}