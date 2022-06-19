import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas;
        double perKm = 0.10;
        int tip;
        double yasIndirimi;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafe (KM cinsinden): ");
        mesafe = input.nextInt();

        System.out.println("Yasiniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        tip = input.nextInt();

        double normalTutar = mesafe * perKm;

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            if (yas < 12) {
                if (tip == 1) {
                    double yasIndirimOrani = 0.5;
                    double indirimliTutar;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    normalTutar = indirimliTutar;
                    System.out.println(normalTutar);
                } else {
                    double yasIndirimOrani = 0.5;
                    double indirimliTutar;
                    double tipIndirimi;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    tipIndirimi = indirimliTutar * 0.2;
                    normalTutar = (indirimliTutar - tipIndirimi) * 2;
                    System.out.println(normalTutar);
                }
            } else if (yas >= 12 && yas <= 24) {
                if (tip == 1) {
                    double yasIndirimOrani = 0.1;
                    double indirimliTutar;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    normalTutar = indirimliTutar;
                    System.out.println(normalTutar);
                } else {
                    double yasIndirimOrani = 0.1;
                    double indirimliTutar;
                    double tipIndirimi;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    tipIndirimi = indirimliTutar * 0.2;
                    normalTutar = (indirimliTutar - tipIndirimi) * 2;
                    System.out.println(normalTutar);
                }
            } else if (yas > 65) {
                if (tip == 1) {
                    double yasIndirimOrani = 0.3;
                    double indirimliTutar;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    normalTutar = indirimliTutar;
                    System.out.println(normalTutar);
                } else {
                    double yasIndirimOrani = 0.3;
                    double indirimliTutar;
                    double tipIndirimi;
                    yasIndirimi = normalTutar * yasIndirimOrani;
                    indirimliTutar = normalTutar - yasIndirimi;
                    tipIndirimi = indirimliTutar * 0.2;
                    normalTutar = (indirimliTutar - tipIndirimi) * 2;
                    System.out.println(normalTutar);
                }
            } else {
                normalTutar = normalTutar;
                System.out.println(normalTutar);
            }
        } else {
                System.out.println("Hatali giris yaptiniz..");
            }
        }
    }