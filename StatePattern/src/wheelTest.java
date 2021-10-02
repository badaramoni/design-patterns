public class wheelTest {

	void wheelTest() throws InterruptedException {
		wheelsState backMode = new wheelsBackMode();
		wheelsState frontMode = new wheelsFrontMode();
		wheelsContext context = new wheelsContext();
		context.setWheelsState(backMode);
		context.wheelsAction();
		context.setWheelsState(frontMode);
		context.wheelsAction();
	}
}
