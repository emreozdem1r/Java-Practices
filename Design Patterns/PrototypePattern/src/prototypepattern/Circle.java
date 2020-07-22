package prototypepattern;
/**
 *
 * @author Emre
 */
public class Circle extends Shape{
    
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle draw() method");
    }
    
}
