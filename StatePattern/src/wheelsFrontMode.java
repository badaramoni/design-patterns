
public class wheelsFrontMode implements wheelsState {


	@Override
	public void wheelsAction() throws InterruptedException {
		System.out.println("wheels is moving front side");

		for(int i = 1 ; i <= 10 ;i ++){
			Thread.sleep(500);
			System.out.print("-");
		}
		System.out.print(">");
	}
}
