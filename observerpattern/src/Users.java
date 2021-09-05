import java.util.ArrayList;

public class Users implements Observer{

    String name;

    public Users(String name) {
        this.name = name;
    }

    @Override
    public void update(Object o) {

        if (o instanceof UnitedStatesPostalService){
            UnitedStatesPostalService unitedStatesPostalService = (UnitedStatesPostalService)  o;
            CheckMail(((UnitedStatesPostalService) o).getState());
        }
    }

    private void CheckMail(ArrayList<Mails> state) {
        for (int i = 0; i <state.size(); i++){
            if (name.compareTo(state.get(i).receiverName)== 0){
                System.out.println(name+ ":" +  state.get(i).content );
            }
        }
    }
}
