public class AlloyFloatersCommand implements ICommand {
    Wheels wheels;

    public AlloyFloatersCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Alloy Floaters");
        wheels.makeAlloyFloaters();
    }
}
