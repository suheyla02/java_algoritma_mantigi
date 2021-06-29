package p03_matematikselIslemler;

public class A2_MathClass {
    public static void main(String[] args) {
       //Math.class 1)Math.abs=>sonucun mutlak degerini alir.
      int yas1=18;
      int yas2=13;
      int yasFarki=yas2-yas1;
      yasFarki=Math.abs(yasFarki);
        System.out.println("yasFarki = " + yasFarki);

        //Math.class 2)Math.round=>sonucun tam sayi degerini gonderir
        long sayi=Math.round(3.49);
        System.out.println("sayi="+ sayi);

        //Math.class 3)Math.sqrt=> sayinin karekokunu verir
        double sayi1=Math.sqrt(49);
        System.out.println("sayi1="+sayi1);

        //Math.class 4)Math.max ve Math.min
        int a=Math.max(23,45);
        int b=Math.min(23,45);
        System.out.println("a max="+ a);
        System.out.println("b min="+ b);


    }
}
