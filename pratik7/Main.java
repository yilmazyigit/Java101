import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5.00, armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;
        double toplamUcret;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kac kg: ");
        armutMiktar = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Elma kac kg: ");
        elmaMiktar = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Domates kac kg: ");
        domatesMiktar = input3.nextDouble();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Muz kac kg: ");
        muzMiktar = input4.nextDouble();

        Scanner input5 = new Scanner(System.in);
        System.out.println("Patlican kac kg: ");
        patlicanMiktar = input5.nextDouble();

        toplamUcret=(armutKg*armutMiktar)+(elmaMiktar*elmaKg)+(domatesMiktar*domatesMiktar)+(muzMiktar*muzKg)+(patlicanMiktar*patlicanKg);
        System.out.println("Toplam ucret: "+toplamUcret);
    }
}