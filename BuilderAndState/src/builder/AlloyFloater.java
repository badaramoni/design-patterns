package builder;

public class AlloyFloater extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Alloy floater wheel is building";
    }
}