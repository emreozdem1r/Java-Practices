
package application_inheritance;

/**
 *
 * @author Emre
 */
public class Yonetici extends Calisan{ //subclass
    private int sorumluKisi;
    public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
        super(isim, maas, departman);
        this.sorumluKisi=sorumluKisi;
    }
    public void zamYap(int zamMiktari){
        System.out.println("Calisanlara "+ zamMiktari + " TL kadar zam yapildi.");
    }
    public void bilgileriGoster(){
            /*System.out.println("Isim : "+getIsim());
            System.out.println("Maas: "+ getMaas());
            System.out.println("Departman: "+ getDepartman());*/
            super.BilgileriGoster();
            System.out.println("Sorumlu kisi sayisi: "+ this.sorumluKisi);
    }
    
}
