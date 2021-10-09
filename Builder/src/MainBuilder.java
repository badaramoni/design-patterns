
public class MainBuilder {

	public static void main(String[] args) {
		
		Wheel wheel = new Wheel();
		
		System.out.println("Wheel with different States:\n");
		
		wheel.insertSteelSpinners();
		wheel.insertSteelFloaters();
		wheel.insertSteelColor();
		wheel.insertSteelProtection();

		wheel.insertAlloySpinners();
		wheel.insertAlloyFloaters();
		wheel.insertAlloyColor();
		wheel.insertAlloyProtection();

	}

}
