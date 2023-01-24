package CreationalDP.Abstract_FactoryDP;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
       if(color==null) return null;
       if(color.equalsIgnoreCase("RED")){
           return new Red();
       } else if (color.equalsIgnoreCase("Green") ){
           return new Green();
       } else if (color.equalsIgnoreCase("blue") ){
            return new Blue();
        }
return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
