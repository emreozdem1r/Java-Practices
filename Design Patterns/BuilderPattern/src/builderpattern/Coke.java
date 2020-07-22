package builderpattern;
/**
 *
 * @author Emre
 */
public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 30.5f;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}
