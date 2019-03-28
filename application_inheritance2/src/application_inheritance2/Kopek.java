package application_inheritance2;
/**
 *
 * @author Emre
 */
public class Kopek extends Hayvan {
    private int disSayisi;
    public Kopek(String isim,int kilo ,int boy, int bacakSayisi,int disSayisi)
    {
        super(isim,kilo,boy,bacakSayisi);
        this.disSayisi=disSayisi;
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    public void kos(int hiz){
        System.out.println("kopek kosuyor");
        hareketeGec(hiz);
    }
    public void hareketeGec(int hiz){
        System.out.println("kopek "+ hiz+ " ile hareket ediyor" );
    }
}
