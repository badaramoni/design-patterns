public class AlloyProtectionCommand implements ICommand {
    Wheels wheels;

    public AlloyProtectionCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Alloy Protection");
        wheels.makeAlloyProtection();
    }
}
