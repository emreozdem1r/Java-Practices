
package singletonpattern;

/**
 *
 * @author Emre
 */
public class SingletonPattern {
   
    public static void main(String[] args) {
        
        SingleObject object =SingleObject.getInstance();
        
        object.showMessage();
        
    }
    
}
