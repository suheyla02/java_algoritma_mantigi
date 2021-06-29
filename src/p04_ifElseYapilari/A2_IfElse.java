package p04_ifElseYapilari;

public class A2_IfElse {
    public static void main(String[] args) {
        //uc kardesin yaslarindan buyuk olanini tanimlama programi
        //1.YOL

        int ali=11;
        int ayse=12;
        int hasan=16;

        if(ali>ayse) {
            if(ali>hasan){
                System.out.println("ali en buyuktur");
            }else{
                System.out.println("hasan en buyuktur");
            }
        }else{
            if(ayse>hasan){
                System.out.println("ayse en buyuktur");
            }else {
                System.out.println("hasan en buyuktur");
            }
        }
        System.out.println("=================================");
        //2.YOL
        if(ali>ayse && ali>hasan) System.out.println("ali en buyuktur");
        if(ayse>ali && ayse>hasan) System.out.println("ayse en buyuktur");
        if(hasan>ali && hasan>ayse) System.out.println("hasan en buyuktur");


    }
}
