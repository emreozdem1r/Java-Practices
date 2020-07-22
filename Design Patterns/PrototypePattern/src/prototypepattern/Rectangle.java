package prototypepattern;
/**
 *
 * @author Emre
 */
public class Rectangle extends Shape {
    
    Rectangle(){
        type = "Rectangle";
    }
    
    @Override
    void draw() {
        System.out.println("Rectangle draw() method");
    }
    
    
}
