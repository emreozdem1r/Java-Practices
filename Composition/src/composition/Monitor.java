package composition;

import javax.xml.ws.RespectBinding;

/**
 *
 * @author Emre
 */
public class Monitor {
        private String model;
        private String uretici;
        private String boyut;
        private Resolution rs;

    public Monitor(String model, String uretici, String boyut, Resolution rs) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.rs = rs;
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getRs() {
        return rs;
    }

    public void setRs(Resolution rs) {
        this.rs = rs;
    }
        public void monitorKapat(){
            System.out.println("monitor kapatiliyor.");
        }
}
