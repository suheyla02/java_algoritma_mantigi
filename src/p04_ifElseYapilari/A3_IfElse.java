package p04_ifElseYapilari;

public class A3_IfElse {
    public static void main(String[] args) {
        //Iki sayidan buyuk olanini ekrana yazdiran programi yaziniz

        double sayi1=Math.random()*10;
        double sayi2=Math.random()*10;
        System.out.println("sayi1"+ sayi1);
        System.out.println("sayi2"+ sayi2);
       // double buyukOlan=Math.max(sayi1,sayi2);
        double buyukOlan;
        if(sayi1>sayi2){
            buyukOlan=sayi1;
        }else{
            buyukOlan=sayi2;
        }
        System.out.println("buyukOlan="+ buyukOlan);


        //2 vize 1 final nolu verilen ogrencinin gecip kaldigini ekrana yazdiran (vizeler %25, final%50,gecme notu60)

        int vize1= (int) (Math.random()*101);
        int vize2= (int) (Math.random()*101);
        int finalNotu= (int) (Math.random()*101);
        int gecmeNotu= (int) (vize1*0.25+vize2*0.25+finalNotu*0.50);
        System.out.println("vize1 = " + vize1);
        System.out.println("vize2 = " + vize2);
        System.out.println("finalNotu = " + finalNotu);
        System.out.println("gecmeNotu = " + gecmeNotu);

        if(gecmeNotu<60){
            System.out.println("basarisiz");
        }else {
            System.out.println("tebrikler");
        }
        //Verilen sayinin cift yada tek oldugunu bulup ekrana yazdiran programi yaziniz

        int a= (int) (Math.random()*101);
        int kalan;
        kalan=a%2;
        if (kalan==0) System.out.println("cift sayi");
        else System.out.println("tek sayi");
    }
}
