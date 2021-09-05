import java.util.ArrayList;

public class UnitedStatesPostalService implements Subject{

    private ArrayList<Mails> allMails;
    private ArrayList<Observer> observers;

    public UnitedStatesPostalService(){

        allMails = new ArrayList<Mails>();
        observers = new ArrayList<Observer>();

    }

    public void addMail(Mails m){
        allMails.add(m);
        Notify();
    }

    public ArrayList<Mails> getState(){
        return allMails;
    }

    @Override
    public void Attach(Observer o) {

        observers.add(o);
    }

    @Override
    public void Dettach(Observer o) {

        observers.remove(o);

    }

    @Override
    public void Notify() {

        for (int i = 0 ; i < observers.size();i++){
            observers.get(i).update(this);
        }

    }
}
