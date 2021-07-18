package p05_looplar;

public class A2_WhileLooplar {
    public static void main(String[] args) {
        //while dongusu =>index yok kendim eklerim
        int n=10;
        long toplamTek=0;
        long toplamCift=0;

        //toplam bulma
        int toplam=0;
        int i=1;
//        while(i<n+1){
//            toplam=toplam+i;
//            i++;
//        }
//        System.out.println("toplam = " + toplam);
//        System.out.println("====================================");
//
//        //do-while
//        do{
//            toplam=toplam+i;
//            i++;
//
//        }while (i<n+1);
//        System.out.println("toplam = " + toplam);

        //tek ve cift sayilarin toplamini bulma

        do {
            if(i%2==0) toplamCift=toplamCift+i;
                else toplamTek=toplamTek+i;
            i++;  //i nin artis miktari konuldugu yere gore degisir buna dikkat etmeli
        }while (i<n+1);

        System.out.println("toplamCift = " + toplamCift);
        System.out.println("toplamTek = " + toplamTek);

    }
}
