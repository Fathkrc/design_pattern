package BehavioralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount<500) {
            System.out.println("Müdür onayladı");
            System.out.println("***********************");
        } else if(chief!=null) {
            System.out.println("Miktar müdürün onaylama sınırı dışında, Şefe yönlendiriliyorsunuz");
            return chief.approveLoan(amount);
        }

        return false;
    }

}
