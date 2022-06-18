import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select;
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayi: ");
        n1 = input.nextDouble();

        System.out.println("ikinci sayi: ");
        n2 = input.nextDouble();

        System.out.println("islemi seç:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if (n2==0) {
                    System.out.println("Sifira baolunme hatasi. Tekrar Dene");
                }else {
                    System.out.println(String.format("%.2f", (n1/n2)));
                }
                break;
            default:
                System.out.println("Yanlis secim yaptin. Tekrar dene");
        }
    }
}