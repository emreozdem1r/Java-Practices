package filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emre
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
    
}
