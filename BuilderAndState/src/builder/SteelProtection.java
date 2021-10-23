package builder;

public class SteelProtection extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Steel protection wheel is building";
    }
}
