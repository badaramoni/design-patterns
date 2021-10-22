public class AlloyColorCommand implements ICommand {
    Wheels wheels;

    public AlloyColorCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Alloy Color");
        wheels.makeAlloyColor();
    }
}
