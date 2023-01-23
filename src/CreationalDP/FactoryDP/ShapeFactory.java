package CreationalDP.FactoryDP;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("DAİRE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("KARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("UCGEN")){
            return new Triangle();
        }
        else{
            return null;
        }
    }
}
