package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Emre
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> arraylist= new ArrayList<String>();
        
        arraylist.add("Slow");
        arraylist.add("rock");
        arraylist.add("pop");
        arraylist.add("rap");
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.size());
        
        arraylist.remove("rap");
        for(int i =0; i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
    }
}
