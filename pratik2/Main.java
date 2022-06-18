import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutari giriniz: ");
        tutar = input.nextDouble();

        double kdvtutari = tutar * kdvOran;
        double kdvliTutar = tutar + kdvtutari;

        System.out.println(kdvliTutar);
    }
}