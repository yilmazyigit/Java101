import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kalan = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dogum yiliniz:");
        int yil = inp.nextInt();

        kalan = yil % 12;
        if (kalan == 0) {
            System.out.println("Cin Zodyagi Burcunuz : Maymun");
        }
        if (kalan == 1) {
            System.out.println("Cin Zodyagi Burcunuz : Horoz");
        }
        if (kalan == 2) {
            System.out.println("Cin Zodyagi Burcunuz : Kopek");
        }
        if (kalan == 3) {
            System.out.println("Cin Zodyagi Burcunuz : Domuz");
        }
        if (kalan == 4) {
            System.out.println("Cin Zodyagi Burcunuz : Fare");
        }
        if (kalan == 5) {
            System.out.println("Cin Zodyagi Burcunuz : Okuz");
        }
        if (kalan == 6) {
            System.out.println("Cin Zodyagi Burcunuz : Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Cin Zodyagi Burcunuz : Tavsan");
        }
        if (kalan == 8) {
            System.out.println("Cin Zodyagi Burcunuz : Ejderha");
        }
        if (kalan == 9) {
            System.out.println("Cin Zodyagi Burcunuz : Yilan");
        }
        if (kalan == 10) {
            System.out.println("Cin Zodyagi Burcunuz : At");
        }
        if (kalan == 11) {
            System.out.println("Cin Zodyagi Burcunuz : Koyun");
        }
    }
}