public class HotWheelsFactory extends AbstractWheelFactory{
    @Override
    Wheels getWheels(WheelsType wheelsType) {
        switch (wheelsType){
            case SteelWheels:
                return new SteelWheels("10","20","null","10","12");

        }

        return null;
    }
}
