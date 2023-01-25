package CreationalDP.ProtoTypeDP;

public class PrototypeDPDemo {
    public static void main(String[] args) {
        Soldier availableSoldier=new Soldier(100,
                45,20,50,60,5,"kılıç",true);
        Soldier unAvailableSoldier=new Soldier(100,
                45,20,50,60,5,"kılıç",false);

       Soldier unAvailableSoldier2= availableSoldier.clone();
       unAvailableSoldier2.setAvailableForWar(false);

        System.out.println("*************************");
        System.out.println("unAvaible çıktısı ");
        System.out.println(unAvailableSoldier);
        System.out.println("unAvaible2 çıktısı ");
        System.out.println(unAvailableSoldier2);
    }
}
