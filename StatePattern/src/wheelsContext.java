
public class wheelsContext implements wheelsState {

	private wheelsState wheelsState;

	public wheelsState getWheelsState() {
		return this.wheelsState;
	}


	public void setWheelsState(wheelsState wheelsState) {
		this.wheelsState = wheelsState;
	}



	@Override
	public void wheelsAction() throws InterruptedException {
		this.wheelsState.wheelsAction();
	}
}
