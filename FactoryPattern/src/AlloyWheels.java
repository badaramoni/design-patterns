public class AlloyWheels extends Wheels{

    private String Diameter;
    private String Width;
    private String BoltPattern;
    private int offSetMix;
    private int offSetMax;

    public AlloyWheels(String diameter, String width, String boltPattern, int offSetMix, int offSetMax) {
        Diameter = diameter;
        Width = width;
        BoltPattern = boltPattern;
        this.offSetMix = offSetMix;
        this.offSetMax = offSetMax;
    }

    public AlloyWheels(String diameter, String width, String aNull, String s, String s1) {
        super();
    }

    @Override
    public String toString() {
        return "AlloyWheels{" +
                "Diameter='" + Diameter + '\'' +
                ", Width='" + Width + '\'' +
                ", BoltPattern='" + BoltPattern + '\'' +
                ", offSetMix=" + offSetMix +
                ", offSetMax=" + offSetMax +
                '}';
    }

    @Override
    public String getDetails() {
        return "Alloy Wheels ,Wheel size :" + this.Diameter + this.Width;
    }
}
