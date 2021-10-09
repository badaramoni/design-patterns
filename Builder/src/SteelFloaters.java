
public class SteelFloaters implements WheelState {

	Wheel wheel;
	
	public SteelFloaters(Wheel newWheel) {
		
		wheel = newWheel;
	
	}
	@Override
	public void insertSteelSpinners() {
		System.out.println("Steel Spinner is added in the Wheel");
		wheel.setWheelState(wheel.getSteelSpinners());
	}

	@Override
	public void insertSteelFloaters() {
		System.out.println("Steel Floaters is added in the Wheel");

	}

	@Override
	public void insertSteelColor() {
		System.out.println("Steel Color is added in the Wheel");
		wheel.setWheelState(wheel.getSteelColor());
	}

	@Override
	public void insertSteelProtection() {
		System.out.println("Steel Protection is added in the Wheel");
		wheel.setWheelState(wheel.getSteelProtection());

	}

	@Override
	public void insertAlloySpinners() {
		System.out.println("Alloy Spinner is added in the Wheel");
		wheel.setWheelState(wheel.getAlloySpinners());
	}

	@Override
	public void insertAlloyFloaters() {
		System.out.println("Alloy Floaters is added in the Wheel");
		wheel.setWheelState(wheel.getAlloyfloaters());
	}

	@Override
	public void insertAlloyColor() {
		System.out.println("Alloy Color is added in the Wheel");
		wheel.setWheelState(wheel.getAlloyColor());
	}

	@Override
	public void insertAlloyProtection() {
		System.out.println("Alloy Protection is added in the Wheel");
		wheel.setWheelState(wheel.getAlloyProtection());
	}

}
