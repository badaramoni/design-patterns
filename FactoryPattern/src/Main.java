public class Main {
    public static void main(String[] args) {

        Wheels wheels = FactoryGenerator.getFactory(FactoryType.HotWheelsFactory).getWheels(WheelsType.SteelWheels);
        System.out.println(wheels.getDetails());

        AbstractWheelFactory abstractWheelFactory = FactoryGenerator.getFactory(FactoryType.NormalWheelsFactory);
        Wheels wheels1 = abstractWheelFactory.getWheels(WheelsType.AlloyWheels);
        System.out.println(wheels1.toString());

    }
}
