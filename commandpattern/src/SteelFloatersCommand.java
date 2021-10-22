public class SteelFloatersCommand implements ICommand {
    Wheels wheels;

    public SteelFloatersCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Steel Floaters");
        wheels.makeSteelFloaters();
    }
}
