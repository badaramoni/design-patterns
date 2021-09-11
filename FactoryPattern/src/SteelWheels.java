public class SteelWheels extends Wheels{

    private String Diameter;
    private String Width;
    private String BoltPattern;
    private int offSetMix;
    private int offSetMax;

    public SteelWheels(String diameter, String width, String aNull, String s, String s1) {
        super();
    }

    @Override
    public String getDetails() {
        return "Steel Wheels ,Wheel size :" + this.Diameter + this.Width;
    }



    public SteelWheels(String diameter, String width, String boltPattern, int offSetMix, int offSetMax) {
        this.Diameter = diameter;
        this.Width = width;
        this.BoltPattern = boltPattern;
        this.offSetMix = offSetMix;
        this.offSetMax = offSetMax;
    }

    @Override
    public String toString() {
        return "SteelWheels{" +
                "Diameter='" + Diameter + '\'' +
                ", Width='" + Width + '\'' +
                ", BoltPattern='" + BoltPattern + '\'' +
                ", offSetMix=" + offSetMix +
                ", offSetMax=" + offSetMax +
                '}';
    }


}
