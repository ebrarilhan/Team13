package JavaProjects.P05_HalukMarket;

import java.util.*;

public class Islemler {


    static Scanner input;
    public static HashMap<String,UrunlerPojo> urunler = new HashMap<>();

    static Set<Map.Entry<String, UrunlerPojo>> entries = urunler.entrySet();


    public static void hazirUrunler(){

        UrunlerPojo obj1 = new UrunlerPojo("domates",1,2.10);
        UrunlerPojo obj2 = new UrunlerPojo("patates",1,3.20);
        UrunlerPojo obj3 = new UrunlerPojo("biber",1,1.50);
        UrunlerPojo obj4 = new UrunlerPojo("sogan",1,2.30);
        UrunlerPojo obj5 = new UrunlerPojo("havuc",1,3.10);
        UrunlerPojo obj6 = new UrunlerPojo("elma",1,1.20);
        UrunlerPojo obj7 = new UrunlerPojo("muz ",1,1.90);
        UrunlerPojo obj8 = new UrunlerPojo("cilek",1,6.10);
        UrunlerPojo obj9 = new UrunlerPojo("kavun",1,4.30);
        UrunlerPojo obj10 = new UrunlerPojo("uzum",1,2.70);
        UrunlerPojo obj11 = new UrunlerPojo("limon",1,0.50);

        urunler.put("01",obj1);
        urunler.put("02",obj2);
        urunler.put("03",obj3);
        urunler.put("04",obj4);
        urunler.put("05",obj5);
        urunler.put("06",obj6);
        urunler.put("07",obj7);
        urunler.put("08",obj8);
        urunler.put("09",obj9);
        urunler.put("10",obj10);
        urunler.put("11",obj11);

        urunListele();



    }

    public static void urunListele(){
        System.out.println("No\t\t\tÜrün\t\t\tKg\t\t\tFiyat\n" + "====\t   ====== \t \t =======\t\t=======");

        for (Map.Entry<String, UrunlerPojo> w: entries){
            System.out.println(w);
        }

    }


    public static void secim(){

        input = new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urunun numarasini giriniz");
        String no = input.next();

        if (urunler.containsKey(no)){
            System.out.println("kac kg almak isteidginizi giriniz");
            double kg = input.nextDouble();
            double hesap = urunler.get(no).getFiyat()*kg;
            System.out.println("girdiginiz kg gore " + urunler.get(no).getUrun() +  " fiyati: " + hesap);


        }else {
            secim();

        }


    }



}
