import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("3. sayiyi giriniz: ");
        c = input.nextInt();

        System.out.print("Kucukten buyuge dogru siralama: ");
        if (a<b && b<c) {
            System.out.println("a < b < c");
        } else if (c<b && b<a) {
            System.out.println("c < b < a");
        } else if (a<c && c<b) {
            System.out.println("a < c < b");
        } else if (b<c && c<a) {
            System.out.println("b < c < a");
        } else if (b<a && a<c) {
            System.out.println("b < a < c");
        } else if (c<a && a<b) {
            System.out.println("c < a < b");
        } else {
            System.out.println("Gecersiz islem");
        }
    }
}