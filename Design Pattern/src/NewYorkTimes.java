public class NewYorkTimes {

    public static void main(String[] args){

        Channel techNews = new Channel();

        Subscriber user1 = new Subscriber("Avinash");
        Subscriber user2 = new Subscriber("bill");
        Subscriber user3 = new Subscriber("elon");
        Subscriber user4 = new Subscriber("sundar");


       techNews.Subscribe(user1);
       techNews.Subscribe(user2);
       techNews.Subscribe(user3);
       techNews.Subscribe(user4);

       user1.subChannel(techNews);
       user2.subChannel(techNews);
       user3.subChannel(techNews);
       user4.subChannel(techNews);

       techNews.upload("how to learn design patterns ?");


    }
}
