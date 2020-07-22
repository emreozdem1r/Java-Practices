package filterpattern;

import java.util.List;

/**
 *
 * @author Emre
 */
public interface Criteria {
    
    public List<Person> meetCriteria(List<Person> persons);
    
    
}
