public class Wheels {

    private String name = "NormalWheels";
    private String name2 = "HotWheels";
    private int quantity = 10;


    public void NormalWheelsFactory(){
        System.out.println("Wheel Type: "+name+",No.of.pairs: " + quantity);
    }
    public void HotWheelsFactory(){
        System.out.println("Wheels Type: "+name2+",No.of.pairs: " + quantity);
    }
}
