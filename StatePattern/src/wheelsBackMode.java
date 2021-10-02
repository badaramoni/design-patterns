import java.util.concurrent.TimeUnit;

public class wheelsBackMode implements wheelsState {


	@Override
	public void wheelsAction() throws InterruptedException {
		System.out.println("wheels is moving back side");
		System.out.print("<");
		for(int i = 1 ; i <= 10 ;i ++){
			Thread.sleep(500);
			System.out.print("-");
		}

	}


}
