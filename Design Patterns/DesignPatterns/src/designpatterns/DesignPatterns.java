package designpatterns;
/**
 *
 * @author Emre
 */
public class DesignPatterns {

    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
    
}
