
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Emre
 */
public class Main {
   public static void Listele(LinkedList<String> list){

       Iterator<String> iterator= list.listIterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next()); 
       }
}
   public static void ekle(LinkedList<String> list,String yeni){
       ListIterator<String> iterator=list.listIterator();
       while(iterator.hasNext()){
            int karsilastir=iterator.next().compareTo(yeni);
                if(karsilastir==0){
                    System.out.println("Listenizde eleman zaten var");
                    return;
                }
                else if(karsilastir>0){
                    iterator.previous();
                    iterator.add(yeni);
                    return;
                }
       }
       iterator.add(yeni);
                
   }
    public static void main(String[] args){
       LinkedList<String> yer= new LinkedList<>();
        
        ekle(yer,"Adana");
        ekle(yer,"Kars");
        ekle(yer,"Batman");
        ekle(yer,"Hatay");
        ekle(yer, "Izmir");
        ekle(yer,"Niğde");
        Listele(yer);
   } 
}
