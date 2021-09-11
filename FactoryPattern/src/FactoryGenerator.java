public class FactoryGenerator {
    public static AbstractWheelFactory getFactory(FactoryType factoryType) {
        switch (factoryType){
            case NormalWheelsFactory:
                return new NormalWheelsFactory();
            case HotWheelsFactory:
                return new HotWheelsFactory();

        }
        return null;
    }
}
