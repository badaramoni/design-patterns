package builder;

public class SteelSpinner extends WheelBuilderSection {
    @Override
    public String qaTest(){
        return "Passed";
    }
    @Override
    public String section(){
        return "Steel spinner wheel is building";
    }
}
