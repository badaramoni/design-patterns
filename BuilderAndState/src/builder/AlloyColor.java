package builder;

public class AlloyColor extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Alloy color wheel is building";
    }
}
