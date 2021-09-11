public class NormalWheelsFactory extends AbstractWheelFactory{
    @Override
    Wheels getWheels(WheelsType wheelsType) {
        switch (wheelsType){
            case AlloyWheels :
                return new AlloyWheels("10","20","null","10","12");
            case SteelWheels:
                return new SteelWheels("11","21","null","11","13");
        }

        return null;
    }
}
