
package kelimebulma;

import java.util.Random;
import java.util.Scanner;
public class KelimeBulma {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner klavye=new Scanner(System.in);
        int dogru=0,yanlis=0;
        String sifre="BMCE",tahmin="";
        char dizi[]=new char[4];
        char t_dizi[]=new char[4];
        dizi=sifre.toCharArray();
         System.out.println("Sifre 4 Harfli bir kelime.Tahmin Giriniz:");
        while(true)
        { 
            tahmin=klavye.next();
            if(tahmin.length()!=4)
            System.out.println("Lütfen 4 Harfli bir tahmin yapınız!Tahmin Giriniz:");
            else break;
        }
        t_dizi=tahmin.toCharArray();
        int sayac=0;
        while(sayac<21)
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
            {System.out.println("Tebrikler sifreyi buldunuz.\n Sifre = "+sifre);   break;}
            System.out.print("Yeni tahmin giriniz: ");
            tahmin=klavye.next();
      /*   while(true)
        {
            tahmin=klavye.next();
            if(tahmin.length()!=4)
            System.out.println("Lütfen 4 Harfli bir tahmin yapınız!Tahmin Giriniz:");
            else break;
        }*/
            t_dizi=tahmin.toCharArray();
            if(sayac==20)
                System.out.println("Son Hakkın. İyi kullan :)");
            sayac++;
        }
       if(dogru!=4)
           System.out.println("Bilemediniz. Sifre"+sifre);
        
    }
}

