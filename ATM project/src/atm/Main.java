package atm;

public class Main {
    public static void main(String[] args){
        
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Emre","111",2000);
        
        
        atm.calis(hesap);
        System.out.println("programdan cikiliyor");
                
        
    }
}
