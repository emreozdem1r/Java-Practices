package atm;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz.");
        System.out.println("**********");
        System.out.println("Kullanici girisi");
        System.out.println("**********");
        int girisHakki=3;
        while(true){
            if(login.login(hesap)){
                System.out.println("Giris basarili");
                break;
            }else{
                System.out.println("Giris Basarisiz");
                girisHakki-=1;
                System.out.println("Kalan giris hakki: "+girisHakki);
                if(girisHakki==0){
                    System.out.println("Giris Hakkiniz Bitti");
                    return;
                }
            }
        }
        System.out.println("*************");
        String islemler="1.Bakiye Goruntule\n"
                + "2. Para Yatirma\n"
                +"3.Para Cekme\n"
                +"Cikis icin q'ya basin";
        System.out.println(islemler);
        System.out.println("***************");
        while(true){
            System.out.println("İslem seciniz: ");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+ hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);
                
            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar=scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Gecersiz İslem");
                        
            }
        }
    }

}
