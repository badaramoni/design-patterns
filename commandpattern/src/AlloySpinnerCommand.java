public class AlloySpinnerCommand implements ICommand {
    Wheels wheels;

    public AlloySpinnerCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Alloy Spinner");
        wheels.makeAlloySpinner();
    }
}
