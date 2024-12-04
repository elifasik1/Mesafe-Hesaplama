import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("İlk aracın hızını giriniz: ");
        int v1 = 0;
        v1= mesafe(v1);

        System.out.println("İkinci aracın hızını giriniz: ");
        int v2 = 0;
        v2= mesafe(v2);

        System.out.println("Süre: ");
        int t = 0;
        t= mesafe(t);
        AracArasiMesafe aracArasiMesafe = new AracArasiMesafe(v1,v2,t);

        aracArasiMesafe.yazdir();



    }
    static int mesafe(int x)
    {
        Scanner scan = new Scanner(System.in);
        while (x<0){
            System.out.println("Lütfen pozitif bir değer giriniz:");
        }
        x = scan.nextInt();


        return x;
    }
}
class AracArasiMesafe{
    int v1;
    int v2;
    int t;

    AracArasiMesafe(int v1,int v2,int t)
    {
        this.v1=v1;
        this.v2 = v2;
        this.t = t;

    }

    public int hiz(){
        int mesafe = (v1-v2)*t;
        mesafe= Math.abs(mesafe);
        return mesafe;
    }
    public int tershiz(){
        int tersmesafe = (v1+v2)*t;
        tersmesafe= Math.abs(tersmesafe);
        return tersmesafe;
    }

    public void yazdir(){
        int mesafe = hiz();
        int mesafe2 = tershiz();
        System.out.println("Eğer araçlar aynı yönde gidiyorlarsa : \n1.araç "+v1+" hızında 2. araç "+v2+" hızında ilerlerken "+t+" süre sonra aralarındaki mesafe "+ mesafe+" dir.");
        System.out.println("Eğer araçlar zıt yönlere gidiyorslarsa : \n1.araç "+v1+" hızında 2. araç "+v2+" hızında ilerlerken "+t+" süre sonra aralarındaki mesafe "+ mesafe2+" dir.");
    }
}