package exampleforgıthub;

/**
 *
 * @author SNN
 */
import java.util.Scanner;

public class ExampleforGITHUB {//Sinan SIĞAK
/*program boşluklarla sayıyor kelimeleri 
fazladan boşluk kullanmamaya dikkat et.*/
   

    //harf sayısı;
    public static int harf(String cumle) {
        int sonuc = cumle.length();
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                sonuc--;
            }
        }
        return sonuc;
    }//

    //kelime sayısı;
    public static int cumleS(String cumle) {
       
        int adet=1;/*+1 vererek 1 den başlattık 0'dan başlasaydı ilk 
        kelimeyi görmezden gelirdi*/
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                adet++;
            }

        }
        return adet;

    }//

    //tersten yazılışı;
    public static String ters(String cumle) {
        String sonuc = "";
        for (int i = cumle.length() - 1; i >= 0; i--) {
            sonuc += cumle.charAt(i);
        }
        return sonuc;
    }//

    //sesli harf sayısı;
    public static int sesli(String cumle) {
        String sesli = "aeıiöouü";
       int adet = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (sesli.indexOf(cumle.charAt(i)) >= 0) {
                adet++;
            }
        }
        return adet;

    }//

    //boşluk sayısı;
    public static int bosluk(String cumle) {
        int adet = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                adet++;
            }
        }
        return adet;
    }//

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scan.nextLine();

        System.out.println("Cümlede bulunan harf veya rakam sayısı: " + harf(cumle));

        System.out.println("Cümlede bulunan kelime sayısı: " + cumleS(cumle));

        System.out.println("Cümlenin tersten yazılışı: " + ters(cumle));

        System.out.println("Cümlede bulunan sesli harf sayısı: " + sesli(cumle));

        System.out.println("Cümlede bulunan bosluk sayısı: " + bosluk(cumle));

    }
}
