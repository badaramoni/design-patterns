package builder;

public class SteelColor extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Steel color wheel is building";
    }
}
