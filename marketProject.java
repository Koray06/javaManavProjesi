package abdullahHocaPractice;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class marketProject {
    static Scanner scan =new Scanner(System.in);
    static String urunAdi;
    static String sepet = "";
    static int urunKodu ;
    static int urunFiyati;
    static int urunAdedi ;
    static int toplam ;
    static boolean ekUrun= false ;

    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println( "=======WİSE MARKETE HOŞGELDİNİZ=============");
        System.out.println("------------M E N Ü ------------------");
        System.out.println("Lütfen Alışveriş Yapmak İstediğiniz Reyonları Seçiniz ");
        System.out.println("1- Manav Reyonu \n2- Şarküteri Reyonu\n3- Market reyonu\n4- Fiş Yazdır\n5- Çıkış");
        int secim = scan.nextInt();
        if (!(secim>=1 && secim<=5)){
            System.out.println("Lütfen geçerli bir değer girin !");
            girisEkrani();
        }else{
            switch(secim){
                case 1 :
                manav();
                break;
                case 2 :
                    sarkuteri();
                    break;
                case 3 :
                    market();
                    break;
                case 4 :
                    fisyazdir();
                    break;
                case 5 :
                    cikis();
                    break;
            }
        }

    }

    private static void cikis() {
        System.out.println("İyi Günler Dileriz ");
        scan.close();
    }

    private static void fisyazdir() {
        System.out.println("======Wise Market========");
        System.out.println("Alışverişte Bizi Tercih ettiğiniz için Teşekkür Ederiz ");
        System.out.println("Alışverişinizin Toplam Tutarı : " + toplam);
        System.out.println(" ");
        System.out.println(sepet);
        System.out.println("İyi Günler Dileriz ");
        LocalDateTime saat = LocalDateTime.now();
        System.out.println(saat);
        cikis();
    }

    private static void market() {
        System.out.println("Lütfen Almak İstediğiniz Ürünü Seçiniz :\n10- Nutella 750gr 85₺ \n11-Çay 70₺ \n12- Makarna 20₺ \n13- Güllaç  65₺\n14- Un 53₺ ");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=9 && urunKodu<=14){
                System.out.println("Kaç adet alacaksınız ? ");
                urunAdedi = scan.nextInt();
                switch (urunKodu){
                    case 10:
                        urunAdi= "Nutella 750gr ";
                        urunFiyati= 85;
                        System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                        break;
                    case 11:
                        urunAdi= "Çay ";
                        urunFiyati= 70;
                        System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                        break;
                    case 12:
                        urunAdi= "Makarna  ";
                        urunFiyati= 20;
                        System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                        break;
                    case 13:
                        urunAdi= "Güllaç";
                        urunFiyati= 65;
                        System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                        break;
                    case 14:
                        urunAdi= "Un";
                        urunFiyati= 53;
                        System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                        break;
                }
                urunFiyati= urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Toplam Fiyat "+ toplam);
                sepet+=urunAdi + ": "+ urunFiyati + " TL dir\n ";
                System.out.println("Baska ürün almak istermisiniz ? \n" +
                        "eğer başka ürün almak isterseniz lütfen kodunu giriniz,\n" +
                        "Ana menüye dönmek için lütfen 0 tuşuan basınız ");

            } else if (urunKodu==0) {
                girisEkrani();
            }
        }
    }

    private static void sarkuteri() {
        System.out.println( "Lütfen Alacağınız Ürün Kodunu Seçiniz : \n6- Kaşar Peyniri 130₺ \n7- Zeytin 50₺ \n8- Pastırma 450₺ \n9- Kıyma  140₺");
    while (!ekUrun){
        urunKodu= scan.nextInt();
        if (urunKodu>=6 && urunKodu<=9){
            System.out.println("Kaç kg alacaksınız ? ");
            urunAdedi = scan.nextInt();
            switch (urunKodu){
                case 6:
                    urunAdi ="Kasar Peyniri ";
                    urunFiyati= 130 ;
                    System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                    break;
                case 7:
                    urunAdi= "Zeytin ";
                    urunFiyati= 50;
                    System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                    break;
                case 8:
                    urunAdi= "Pastırma";
                    urunFiyati=450;
                    System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                    break;
                case 9:
                    urunAdi= "Kıyma";
                    urunFiyati =140;
                    System.out.println(urunAdedi+ "kg" + urunAdi +" " +(urunAdedi*urunFiyati)+ "TL dir");
                    break;
            }
            urunFiyati= urunAdedi*urunFiyati;
            toplam+=urunFiyati;
            System.out.println("Toplam Fiyat " + toplam);
            sepet+=urunAdi + ": " + urunFiyati + " TL dir\n ";
            System.out.println("Baska ürün almak istermisiniz ? \n" +
                    "eğer başka ürün almak isterseniz lütfen kodunu giriniz,\n" +
                    "Ana menüye dönmek için lütfen 0 tuşuan basınız ");

        } else if (urunKodu== 0) {
            girisEkrani();
        }
    }
    }

    private static void manav() {
        System.out.println("lütfen almak istediğiniz ürün kodunu seçiniz : \n1- Patates :12₺ \n2- Soğan :15₺ \n3- Elma :18₺\n4- Portakal :12₺ \n4- Ananas :12₺");
    while(!ekUrun){
        urunKodu=scan.nextInt();
        if (urunKodu>=1 && urunKodu<=5){
            System.out.println("Kaç kg alacaksınız ?");
            urunAdedi=scan.nextInt();
            switch (urunKodu){
                case 1:
                    urunAdi= "Patates";
                    urunFiyati= 12;
                    System.out.println(urunAdedi+ " kg " + urunAdi + " fiyatı " + urunFiyati*urunAdedi);
                    break;
                case 2 :
                    urunAdi= "Soğan";
                    urunFiyati= 15;
                    System.out.println(urunAdedi+ " kg " + urunAdi + " fiyatı " + urunFiyati*urunAdedi);
                    break;
                case 3:
                    urunAdi= "Elma";
                    urunFiyati= 18;
                    System.out.println(urunAdedi+ " kg " + urunAdi+ " fiyati " + urunFiyati*urunAdedi);
                    break;
                case 4:
                    urunAdi= "Portakal";
                    urunFiyati= 20;
                    System.out.println(urunAdedi+ " kg " + urunAdi+ " fiyati " + urunFiyati*urunAdedi);
                    break;
                case 5:
                    urunAdi= "Ananas";
                    urunFiyati= 22;
                    System.out.println(urunAdedi+ " kg " + urunAdi+ " fiyati " + urunFiyati*urunAdedi);
                    break;
            }
            urunFiyati=urunFiyati*urunAdedi;
            toplam+=urunFiyati;
            System.out.println("Olusan Sepet Tutarı : " + toplam);
            sepet+=urunAdi+" : " +urunFiyati+ " TL dir\n";
            System.out.println("Baska ürün almak istermisiniz ? \n" +
                    "eğer başka ürün almak isterseniz lütfen kodunu giriniz,\n" +
                    "Ana menüye dönmek için lütfen 0 tuşuan basınız ");

        } else if (urunKodu== 0) {
            girisEkrani();
        }

    }
    }

}
