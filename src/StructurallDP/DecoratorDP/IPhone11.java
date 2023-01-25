package StructurallDP.DecoratorDP;

public class IPhone11 extends PhoneDecorator{//Iphone extends etmediğimiz için base seçenekler geliyor

    public IPhone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" 11";
    }
}
