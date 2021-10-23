package builder;

public class AlloyProtection extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Alloy protection wheel is building";
    }
}