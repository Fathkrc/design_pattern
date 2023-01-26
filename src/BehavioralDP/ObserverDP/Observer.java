package BehavioralDP.ObserverDP;

public class Observer {
    public static void main(String[] args) {
        Observer obs=new Observer();
        obs.observerDemo();
    }
    void observerDemo(){
        Channel channel1=new NewsChannel();
        Channel channel2=new NewsChannel();
        Channel channel3=new NewsChannel();

        NewsAgency agency=new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews(" Java is cool");
        agency.sendNews(" Spring boot çok kötü boğdu");
        agency.sendNews(" Spring security kaba etlerimizi dağladı ");

        System.out.println("Channel 1 Haberleri");
        channel1.printNews();
        System.out.println("************************");
        System.out.println("Channel 2 Haberleri");
        channel2.printNews();
        System.out.println("************************");
        System.out.println("Channel 3 Haberleri");
        channel3.printNews();
        System.out.println("************************");
    }
}
