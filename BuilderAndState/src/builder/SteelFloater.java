package builder;

public class SteelFloater extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Steel floater wheel is building";
    }
}
