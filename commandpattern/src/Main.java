public class Main {

    public static void main(String[] args) {
        Wheels wheels = new Wheels();

        WheelsManufacturer wheelsManufacturer = new WheelsManufacturer(wheels);
        RecyclingWheels recyclingWheels = new RecyclingWheels(wheels);



        Organization organization = new Organization();
        organization.Wheels_Manufacturer_Order(wheelsManufacturer);
        organization.Wheels_Manufacturer_Order(recyclingWheels);

        organization.Start_production_orders();




    }
}
