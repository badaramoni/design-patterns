public class StatePatternMain {
    public static void main(String[] args) {
        Context context = new Context();

        SpinnerState spinnerState = new SpinnerState();
        spinnerState.doAction(context);
        System.out.println(context.getState().toString());

        FloaterState floaterState = new FloaterState();
        floaterState.doAction(context);
        System.out.println(context.getState().toString());

        ColorState colorState = new ColorState();
        colorState.doAction(context);
        System.out.println(context.getState().toString());

        ProtectionState protectionState = new ProtectionState();
        protectionState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
