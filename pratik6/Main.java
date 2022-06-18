import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Metre cinsinden boy: ");
        boy = input.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("kilo: ");
        kilo = input2.nextFloat();

        float vke = kilo / (boy * boy);
        System.out.println("vucut kitle endeksiniz: " + vke);
    }
}