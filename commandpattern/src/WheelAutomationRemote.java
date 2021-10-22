public class WheelAutomationRemote {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
