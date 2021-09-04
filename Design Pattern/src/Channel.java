import java.util.ArrayList;
import java.util.List;

public class Channel {

private List<Subscriber> subs = new ArrayList<Subscriber>();

private String title;

public void Subscribe(Subscriber sub){

    subs.add(sub);
}

public void unSubscribe(Subscriber sub){

    subs.add(sub);
}

public void notifySub(){

    for (Subscriber sub:subs){
        sub.update();
    }
}

public void upload(String title){

    this.title = title;
    notifySub();

}

}
