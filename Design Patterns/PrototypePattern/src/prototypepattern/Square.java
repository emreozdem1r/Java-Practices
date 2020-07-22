package prototypepattern;

public class Square extends Shape {
 
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square draw() method");
    }
    
}

