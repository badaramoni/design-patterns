public class SteelSpinnerCommand implements ICommand {
    Wheels wheels;

    public SteelSpinnerCommand(Wheels wheel) {
        super();
        this.wheels = wheel;
    }
    @Override
    public void execute() {
        System.out.println("Make an Steel Spinner");
        wheels.makeSteelSpinner();
    }
}
