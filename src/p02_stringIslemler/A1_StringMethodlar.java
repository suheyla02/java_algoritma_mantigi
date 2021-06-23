package p02_stringIslemler;

public class A1_StringMethodlar {
    public static void main(String[] args) {
        String str="Merhaba Dunya";
        int sayi=str.length(); //uzunluk verdi
        str=str.toUpperCase(); //yaziyi buyuttu
        str=str.toLowerCase(); //yaziyi kuculttu
        str=str.substring(5);  //5.index dahil ve sonrasini verdi
        str=str.substring(3,8);  //3.index dahil 5 dahil degil bu araligi verdi
        str=str.replace(" ","+");  //boslugu + ile degistir islemi yapildi
        str=str.concat("Insanlari"); //var olan yazimiza insanlari kelimesini ekledi
    }
}
