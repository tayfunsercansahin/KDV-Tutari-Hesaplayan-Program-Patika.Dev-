import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar = 0, kdvOrani = 0, kdvTutari = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = inp.nextDouble();

        if (tutar >= 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else if (tutar > 1000) {
            kdvOrani = 0.08;
        } else {
            System.out.println("Lutfen 0'dan Buyuk Bir Tutar Giriniz...");
        }

        if (tutar >= 0) {
            kdvTutari = tutar * kdvOrani;
            System.out.println("KDV'siz Tutar: " + tutar + " TL");
            System.out.println("KDV Orani: %" + (kdvOrani * 100));
            System.out.println("KDV Tutari: " + kdvTutari + " TL");
            System.out.println("KDV'li Tutar: " + (tutar + kdvTutari) + " TL");
        }
    }
}
