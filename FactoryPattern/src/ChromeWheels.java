public class ChromeWheels extends Wheels{

    private String Diameter;
    private String Width;
    private String BoltPattern;
    private int offSetMix;
    private int offSetMax;
    private int HubBoreMin;
    private int HubBoreMax;

    public ChromeWheels(String diameter, String width, String boltPattern, int offSetMix, int offSetMax, int hubBoreMin, int hubBoreMax) {
        Diameter = diameter;
        Width = width;
        BoltPattern = boltPattern;
        this.offSetMix = offSetMix;
        this.offSetMax = offSetMax;
        HubBoreMin = hubBoreMin;
        HubBoreMax = hubBoreMax;
    }

    @Override
    public String toString() {
        return "ChromeWheels{" +
                "Diameter='" + Diameter + '\'' +
                ", Width='" + Width + '\'' +
                ", BoltPattern='" + BoltPattern + '\'' +
                ", offSetMix=" + offSetMix +
                ", offSetMax=" + offSetMax +
                ", HubBoreMin=" + HubBoreMin +
                ", HubBoreMax=" + HubBoreMax +
                '}';
    }

    @Override
    public String getDetails() {
        return  "Chrome Wheels ,Wheel size :" + this.Diameter + this.Width + "and "+ this.HubBoreMin + this.HubBoreMax ;
    }
}
