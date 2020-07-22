package abstractfactorypattern;
/**
 *
 * @author Emre
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        
        Shape roundedSquare = shapeFactory1.getShape("SQUARE");
        roundedSquare.draw();
        
        Shape roundedRectangle = shapeFactory1.getShape("RECTANGLE");
        roundedRectangle.draw();
    }
    
}
