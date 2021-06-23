package p03_matematikselIslemler;

public class A1_RandomSayi {
    public static void main(String[] args) {
        //Matematiksel fonksiyornlar(Math.class)
        double piSayisi=Math.PI; //pi sayisini verir
        double randomSayi=Math.random(); //rastgele sayi uretir 0 ile 0.9999 arasi
        int randomSayiInt=(int)(randomSayi*100);  //0 ile 99 arasinda bir rastgele sayi
        double rs2=Math.random()*100+1;  //1 ile 100 arasinda sayi verilsin diye 1 eklendi
        int rs2Int=(int) rs2; //tam sayiya ceviriyor


        System.out.println("pi sayisi="+ piSayisi);
        System.out.println("randomSayi="+ randomSayi);
        System.out.println("randomSayiInt="+ randomSayiInt);

        System.out.println("rs2="+ rs2);
        System.out.println("rs2Int="+ rs2Int);
    }
}
