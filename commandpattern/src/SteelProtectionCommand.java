public class SteelProtectionCommand implements ICommand {
    Wheels wheels;

    public SteelProtectionCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Steel Protection");
        wheels.makeSteelProtection();
    }
}
