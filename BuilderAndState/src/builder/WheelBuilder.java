package builder;

public class WheelBuilder {
    public WheelType buildSteelSpinner() {
        WheelType steelSpinner = new WheelType();
        steelSpinner.addItem(new SteelSpinner());
        return steelSpinner;
    }

    public WheelType buildSteelFloater() {
        WheelType steelFloater = new WheelType();
        steelFloater.addItem(new SteelFloater());
        return steelFloater;
    }

    public WheelType buildSteelColor() {
        WheelType steelColor = new WheelType();
        steelColor.addItem(new SteelColor());
        return steelColor;
    }

    public WheelType buildSteelProtection() {
        WheelType steelProtection = new WheelType();
        steelProtection.addItem(new SteelProtection());
        return steelProtection;
    }

    public WheelType buildAlloySpinner() {
        WheelType alloySpinner = new WheelType();
        alloySpinner.addItem(new AlloySpinner());
        return alloySpinner;
    }

    public WheelType buildAlloyFloater() {
        WheelType alloyFloater = new WheelType();
        alloyFloater.addItem(new AlloyFloater());
        return alloyFloater;
    }

    public WheelType buildAlloyColor() {
        WheelType alloyColor = new WheelType();
        alloyColor.addItem(new AlloyColor());
        return alloyColor;
    }

    public WheelType buildAlloyProtection() {
        WheelType alloyProtection = new WheelType();
        alloyProtection.addItem(new AlloyProtection());
        return alloyProtection;
    }
}