package composition;
/**
 *
 * @author Emre
 */
public class Anakart {
    private String model;
    private String uretici;
    private String isletimSistemi;
    private int yuvaSayisi;

    public Anakart(String model, String uretici, String isletimSistemi, int yuvaSayisi) {
        this.model = model;
        this.uretici = uretici;
        this.isletimSistemi = isletimSistemi;
        this.yuvaSayisi = yuvaSayisi;
    }

 

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }
    public void isletimSistemiYukle(String isletimSistemi){
        this.isletimSistemi=isletimSistemi;
        System.out.println("Isletim sistemi yuklendi : "+ isletimSistemi);
        
    }
}
