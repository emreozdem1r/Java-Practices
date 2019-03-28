package composition;
/**
 *
 * @author Emre
 */
public class Test {
    public static void main(String[] args){
        Resolution rs=new Resolution(1920, 1080);
        Monitor monitor=new Monitor("rs-m22", "samsung", "17", rs);
        Kasa kasa=new Kasa("shadowBlade", "Shadow","cam");
        Anakart anakart = new Anakart("bpw23","asus","win10",11);
        
        Bilgisayar pc= new Bilgisayar(monitor,kasa,anakart);
        
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitorKapat();
        pc.getAnakart().isletimSistemiYukle("ubuntu");
        
        
    }
}
