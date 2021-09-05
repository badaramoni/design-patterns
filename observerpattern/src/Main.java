public class Main {


    public static void main(String[] args) {

        UnitedStatesPostalService unitedStatesPostalService = new UnitedStatesPostalService();
        Users Avinash = new Users("Avinash");
        Users ElonMusk = new Users("ElonMusk");
        Mails mails = new Mails("Avinash","New York","Your American express credit card has approved congratulations");


        unitedStatesPostalService.Attach(Avinash);
        unitedStatesPostalService.Attach(ElonMusk);

        unitedStatesPostalService.addMail(mails);


    }
}
