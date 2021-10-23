import builder.WheelBuilder;
import builder.WheelType;
import state.AlloyColorState;
import state.AlloyFloaterState;
import state.AlloyProtectionState;
import state.AlloySpinnerState;
import state.Context;
import state.SteelColorState;
import state.SteelFloaterState;
import state.SteelProtectionState;
import state.SteelSpinnerState;

public class WheelMain {

    public static void main(String[] args) {
        Context context = new Context();

        WheelBuilder wheelBuilder = new WheelBuilder();

        //trigger steel spinner state
        SteelSpinnerState steelSpinnerState = new SteelSpinnerState();
        steelSpinnerState.doAction(context);
        //trigger steel spinner builder
        WheelType steelSpinner = wheelBuilder.buildSteelSpinner();
        steelSpinner.showItems();

        //trigger steel Floater state
        SteelFloaterState steelFloaterState = new SteelFloaterState();
        steelFloaterState.doAction(context);
        //trigger steel Floater builder
        WheelType steelFloater = wheelBuilder.buildSteelFloater();
        steelFloater.showItems();

        //trigger steel Color state
        SteelColorState steelColorState = new SteelColorState();
        steelColorState.doAction(context);
        //trigger steel Color builder
        WheelType steelColor = wheelBuilder.buildSteelColor();
        steelColor.showItems();

        //trigger steel Protection state
        SteelProtectionState steelProtectionState = new SteelProtectionState();
        steelProtectionState.doAction(context);
        //trigger steel Protection builder
        WheelType steelProtection = wheelBuilder.buildSteelProtection();
        steelProtection.showItems();

        //trigger Alloy Spinner state
        AlloySpinnerState alloySpinnerState = new AlloySpinnerState();
        alloySpinnerState.doAction(context);
        //trigger Alloy Spinner builder
        WheelType alloySpinner = wheelBuilder.buildAlloySpinner();
        alloySpinner.showItems();

        //trigger Alloy Floater state
        AlloyFloaterState alloyFloaterState = new AlloyFloaterState();
        alloyFloaterState.doAction(context);
        //trigger Alloy Floater builder
        WheelType alloyFloater = wheelBuilder.buildAlloyFloater();
        alloyFloater.showItems();

        //trigger Alloy Color state
        AlloyColorState alloyColorState = new AlloyColorState();
        alloyColorState.doAction(context);
        //trigger Alloy Color builder
        WheelType alloyColor = wheelBuilder.buildAlloyColor();
        alloyColor.showItems();

        //trigger Alloy Protection state
        AlloyProtectionState alloyProtectionState = new AlloyProtectionState();
        alloyProtectionState.doAction(context);
        //trigger Alloy Protection builder
        WheelType alloyProtection = wheelBuilder.buildAlloyProtection();
        alloyProtection.showItems();

    }
}
