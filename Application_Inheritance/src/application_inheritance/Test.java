package application_inheritance;

/**
 *
 * @author Emre
 */
public class Test {
            public static void main(String[] args){
                Yonetici yonetici = new Yonetici("Emre", 2000, "Muhendis", 20);
                yonetici.zamYap(200);
                yonetici.bilgileriGoster();
            }
}
