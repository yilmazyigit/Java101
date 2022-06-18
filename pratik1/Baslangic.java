import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik dersin notu: ");
        int ders1 = input.nextInt();

        System.out.print("Fizik dersin notu: ");
        int ders2 = input.nextInt();

        System.out.print("Kimya dersin notu: ");
        int ders3 = input.nextInt();

        System.out.print("Turkce dersin notu: ");
        int ders4 = input.nextInt();

        System.out.print("Tarih dersin notu: ");
        int ders5 = input.nextInt();

        System.out.print("Muzik dersin notu: ");
        int ders6 = input.nextInt();

        System.out.println("Ortalama: "+((ders1+ders2+ders3+ders4+ders5+ders6)/6));
    }
}