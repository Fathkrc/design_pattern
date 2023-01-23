package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle1=new Circle();
        circle1.draw();
        Shape square1=new Square();
        square1.draw();
        Shape triangle=new Triangle();
        triangle.draw();
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("daire");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("KARE");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("UCGEN");
        shape3.draw();
    }
}
