public class SteelColorCommand implements ICommand {
    Wheels wheels;

    public SteelColorCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Steel Color");
        wheels.makeSteelColor();
    }
}
