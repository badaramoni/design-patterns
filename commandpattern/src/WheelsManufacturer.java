public class WheelsManufacturer implements Order{


    private Wheels wheels;

    public WheelsManufacturer(Wheels wheels){
      this.wheels = wheels;
    }


    @Override
    public void execute() {
        wheels.NormalWheelsFactory();
    }
}
