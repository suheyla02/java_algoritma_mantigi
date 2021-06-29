package p04_ifElseYapilari;

public class A4_IfElse {
    public static void main(String[] args) {
        //verilen sayinin pozitif,negatif yada sifir olup olmadigini ekrana yazdiran programi yaziniz

        int sayi= (int) (Math.random()*11-5);
        if(sayi==0) System.out.println(sayi);
        else if(sayi>0) System.out.println(sayi +" pozitif sayidir");
           else System.out.println(sayi +" negatif sayidir");

        //verilen 4 sayinin en buyugunu ekrana yazdiran programi bulunuz

        int sayi1= (int) (Math.random()*10);
        int sayi2= (int) (Math.random()*10);
        int sayi3= (int) (Math.random()*10);
        int sayi4= (int) (Math.random()*10);
        System.out.println(sayi1+ " "+ sayi2+" "+sayi3+ " "+ sayi4);
        int enBuyuk=sayi1;
        if(sayi2>enBuyuk) enBuyuk=sayi2;
        if(sayi3>enBuyuk) enBuyuk=sayi3;
        if(sayi4>enBuyuk) enBuyuk=sayi4;

        System.out.println("enBuyuk="+ enBuyuk);
    }
}
