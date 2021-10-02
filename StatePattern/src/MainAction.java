import java.util.Arrays;

public class MainAction {

	public static void main(String[] args) throws InterruptedException {
		
		wheelsContext context = new wheelsContext();
		wheelsState backMode = new wheelsBackMode();
		wheelsState frontMode = new wheelsFrontMode();


		System.out.println("phase 1");
		context.setWheelsState(backMode);
		context.wheelsAction();


		System.out.println("");
		System.out.println("phase 2");
		context.setWheelsState(frontMode);
		context.wheelsAction();
	}

}
