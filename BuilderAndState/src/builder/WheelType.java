package builder;

import java.util.ArrayList;
import java.util.List;

public class WheelType {
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void showItems(){
        for (Packing packing : items){
            System.out.print("Builder: "+packing.section());
            System.out.println(", QA : "+packing.qaTest());
        }
    }
}
