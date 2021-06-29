package p04_ifElseYapilari;

public class A1_IfElse {
    public static void main(String[] args) {
        int a= (int) (Math.random()*10+1); //1-10 arasinda rastgele sayi

        if(a<5){ //sart kismi a 5 den kucukse = dogru blogu
            System.out.println("a 5 den kucuktur="+ a);
        }else{ //yanlis blogu
            System.out.println("a 5 tir veya daha buyuktur"+ a);
        }
        System.out.println("========================================");
        int b=6;
        if(b<5) b=b-2;b=b+5; //ilk ; kadr if yes blogu sonrasi atama islemi

        System.out.println("==========================================");
        int c= (int) (Math.random()*10);
        if(c>5){
            System.out.println(c +" 5 ten buyuk");
        }else if(a==5){
            System.out.println("c "+ c+"tir");
        }else {
            System.out.println(c +" 5 ten kucuktur");}

    }
}
