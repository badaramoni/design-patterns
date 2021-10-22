public class Main {

    public static void main(String[] args) {
        Wheels wheels = new Wheels();
        WheelAutomationRemote remote = new WheelAutomationRemote();

        remote.setCommand(new AlloySpinnerCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new AlloyFloatersCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new AlloyColorCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new AlloyProtectionCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");


        remote.setCommand(new SteelSpinnerCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new SteelFloatersCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new SteelColorCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new SteelProtectionCommand(wheels));
        remote.buttonPressed();
        System.out.println("*********************************");




    }
}
