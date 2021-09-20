public class RecyclingWheels implements Order {

    private Wheels wheels;

    public RecyclingWheels(Wheels wheels){
        this.wheels = wheels;
    }



    @Override
    public void execute() {
          wheels.HotWheelsFactory();
    }
}
