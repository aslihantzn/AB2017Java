package kütüphane;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kütüphane {
    public static void main(String[] args) 
            throws FileNotFoundException, IOException {  
        //exception; Çalışma zamanında beklenmeyen bir hata oluşması durumu
        //throwing; bir istisnanın yaratılıp program içerisine atılması işlemi
        //catching; oluşan bir istisnayı yakalayıp problemin çözülmesi adına belirtilen ifadeleri çalıştırma  işlemine 
        //stack trace; istisnanın oluştuğu noktada kontrol sağlayan bir dizi metot çağırma işlemi 
        //(try-catch) hatayı  yakalama mekanizması
        //try koşulu denemeve denenen koşul geçerliyse sorun yok yanlış ise bu istisnayı fırlatır catch yakalar.
        Scanner klavye=new Scanner(System.in);
        
        int secim;
        int devam;
        
        Calendar cld = Calendar.getInstance();
        Date dt = cld.getTime();
        do
        {
            int a=0;
            
            System.out.println(" KÜTÜPHANE ");
            System.out.println();
            System.out.println("Mevcut Kitap Listesi İçin 1 Tuşlayınız:");
            System.out.println("Kitap Ödünç Vermek İçin 2 Tuşlayınız:");
            System.out.println("Ödünç Verilmiş Kitapları Listesi İçin 3 Tuşlatınız:");
            System.out.println("Ödünç Kitap Teslimi İçin 4 Tuşlayınız:");
            System.out.println("Çıkış İçin 0 Tuşlayınız");
            
            secim=klavye.nextInt();
            switch(secim) 
            {
                case 0:
                    break;
                case 1:
                    File dosya = new File("D:\\yeni.txt");
                    try (FileInputStream fin = new FileInputStream("D:\\yeni.txt")) 
                    {
                        byte[] okunan = new byte[(int)dosya.length()];
                        fin.read(okunan);
                        String veri = new String (okunan);
                        System.out.println(veri);
                    }
                    break;
                case 2:
                    try 
                    {
                        File file = new File("D:\\yeni.txt");
                        try (FileInputStream fis = new FileInputStream(file)) 
                        {
                            int b;
                            do 
                            {
                                b=fis.read();
                                if(b=='\n') 
                                {
                                    a++;
                                }
                            } 
                            while(b != -1);

                        }
                    }
                    catch (FileNotFoundException fnfe) { }
                    catch (IOException ioe) { }
                    System.out.println("Lutfen Ödünç Vereceginiz Kitap Sayısını Giriniz:");
                    int sec;
                    sec=klavye.nextInt();
                    int gecici[]=new int[sec];
                    if(sec>a)
                    {
                        System.out.println("Girdiğiniz Sayıda kitap Bulunmamaktadır.");
                    }
                    else 
                    {
                        System.out.println("Lutfen Ödünç Vereceginiz Kitap Sıralarını Giriniz:");
                        for(int i=0;i<sec;i++) 
                        {
                            gecici[i]=klavye.nextInt();
                        }
                        int c=0;
                        String path = ("D:\\yeni.txt");
                        FileReader file = new FileReader(path);
                        BufferedReader reader = new BufferedReader(file);
                        String satir;
                        for(int h=0;h<sec;h++)
                            while((satir = reader.readLine()) != null)
                            {
                                c++;
                                try
                                {
                                    try (BufferedWriter out = new BufferedWriter (new FileWriter("D:\\oddunc.txt",true))) 
                                    {
                                        out.write(satir+" dir. Ödünç Verilme Tarihi => "+dt+" dir");
                                        out.newLine();
                                    }
                                  
                                } 
                                catch(final IOException e) { }
                            }
                    }
                    break;
                    case 3:
                System.out.println("Odunc Verilmis Kitaplar Listeleniyor.....");
                File liste = new File("D:\\oddunc.txt");
                try (FileInputStream fin = new FileInputStream("D:\\oddunc.txt")) 
                {
                    byte[] okunan = new byte[(int)liste.length()];
                    try 
                    {
                        fin.read(okunan);
                    } 
                    catch (IOException ex) 
                    {
                        Logger.getLogger(Kütüphane.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String veri = new String (okunan);
                    System.out.println(veri);
                }
                break;
                        case 4:
                            File file=new File("D:\\oddunc.txt");
                            FileInputStream finb=new FileInputStream(file);
                            byte[] okunan=new byte[(int)file.length()];
                            finb.read(okunan);
                            String veri3=new String(okunan);
                            byte fs[]=veri3.getBytes();
                            FileOutputStream os1=new FileOutputStream(file);
                            int x=1,y=0,giris,kitaplar;
                            System.out.print("Ödünç Verilmiş Kitap Sayısı:");
                            kitaplar=klavye.nextInt();
                            System.out.println();
                            System.out.print("Kaçıncı Satırdakı Kitap İade Edilecek:");
                            giris=klavye.nextInt();
                            System.out.println();
                            System.out.printf("%d. Kitap İade Edilmiştir.",giris);System.out.println();

                            for(int i=0;i<kitaplar;i++) 
                            {
                                if(x!=giris) 
                                {
                                    do 
                                    {
                                        os1.write(fs[y]);
                                        y++; 
                                    }
                                    while(fs[y]!='\n'); 
                                }
                                if(y==giris)
                                { 
                                    do
                                    {
                                        y++; 
                                    }
                                    while(fs[x]!='\n'); 
                                }
                                y++; 
                            }
                            break;
                    
            }
            System.out.println("Menü İçin Herhangi Bir Tuşa Bsaınız:");
            devam=klavye.nextInt();
        }
        while(secim!=0);
    }
}
