package p05_looplar;

public class A1_ForLoop {

    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){ //i++ => i=i+1;
            System.out.println("i"+ i); //1 den 9 kadar rakamlari yazar
        }

        System.out.println("======================================================");

        int toplam=0; //baslangic degeri vermezsek toplamaya nerden baslamasini bilemez
                      //toplmda genelde 0'a esitleriz
        for (int i=1;i<n;i++){
          toplam=toplam+i;
        }

        System.out.println("=========================================================");

        //1'den 10'a kadar tek sayilarin toplami

        for(int i=1;i<n+1;i=i+2){
            toplam=toplam+i;
        }

        System.out.println("===========================================================");
        //1'den 10 a kadar hem cift hem tek sayilarin toplami

        int toplamTek=0;
        int toplamCift=0;
        for(int i=1;i<n+1;i++){
            if(i%2==0) toplamCift=toplamCift+i;
            else toplamTek=toplamTek+i;
        }
        System.out.println("toplamCift = " + toplamCift);
        System.out.println("toplamTek = " + toplamTek);


    }

}