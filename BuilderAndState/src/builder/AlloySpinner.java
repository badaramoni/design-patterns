package builder;

public class AlloySpinner extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Alloy spinner wheel is building";
    }
}