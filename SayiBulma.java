
package sayibulma;

import java.util.*;
public class SayiBulma {
    public static void main(String[] args) {
       
        Random rnd = new Random();
        Scanner klavye=new Scanner(System.in);
        int sayi=0,dogru=0,yanlis=0;
        String say="",tahmin;
        char dizi[]=new char[4];
        char t_dizi[]=new char[4];
        while(say.length()!=4) {
            sayi=rnd.nextInt(10000);
            say=String.valueOf(sayi);
        }
        dizi=say.toCharArray();
        System.out.print("Tahmin Giriniz:");
        tahmin=klavye.next();
        t_dizi=tahmin.toCharArray();
        int sayac=0;
        while(sayac<11)
        {
            dogru=0; yanlis=0;
            for(int i=0;i<4;i++)
            {
                if(dizi[i]==t_dizi[i])
                    dogru++;
                else
                    yanlis++;
            }
            System.out.println(dogru+"-Dogru   "+yanlis+"-Yanlis");
            if(dogru==4)
            {System.out.println("Tebrikler sayıyı buldunuz.\n Sayı = "+sayi);   break;}
            System.out.print("Yeni tahmin giriniz: ");
            tahmin=klavye.next();
            t_dizi=tahmin.toCharArray();
            if(sayac==10)
                System.out.println("Son Hakkın. İyi kullan :)");
            sayac++;
        }
       if(dogru!=4)
           System.out.println("Bilemediniz. Sayı"+sayi);
        
    }
}
